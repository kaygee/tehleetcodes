package com.kevingann;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Objects;

/**
 * Hackerrank interview question
 */
public final class FoodOutlet {

    public int getVoteCount(String cityName, int estimatedCost) {
        var encodedCity = URLEncoder.encode(cityName, StandardCharsets.UTF_8);

        var url = "https://jsonmock.hackerrank.com/api/food_outlets?city=<cityName>&estimated_cost=<estimatedCost>".replace("<cityName>", encodedCity).replace("<estimatedCost>", String.valueOf(estimatedCost));
        var uri = URI.create(url);

        var httpClient = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder().uri(uri).GET().build();

        String responseBody = null;
        try {
            responseBody = httpClient.send(request, HttpResponse.BodyHandlers.ofString()).body().toString();
            System.out.println(responseBody);
        } catch(IOException ioe){

        } catch (InterruptedException ie){

        }

        // Deserialize the response into a response object.
        var foodOutletResponse = new Gson().fromJson(responseBody, FoodOutletResponse.class);

        if (Objects.isNull(foodOutletResponse.data )){
            return -1;
        }

        if (foodOutletResponse.data.isEmpty()){
            return -1;
        } else {
            // Return the sum of the votes.
            int voteCount = 0;
            for (FoodOutletResult foodOutletResult : foodOutletResponse.data){
                voteCount = voteCount + foodOutletResult.userRating.votes;
            }
            return voteCount;
        }




    }

    public class FoodOutletResponse {
        int page;
        int perPage;
        int total;
        int totalPages;
        List<FoodOutletResult> data;
    }

    public class FoodOutletResult{
        String city;
        String name;
        int estimatedCost;
        @SerializedName("user_rating") UserRating userRating;
        int id;

    }

    /**
     * file
     */
    public class UserRating {
        @SerializedName("average_rating")double averageRating;
        @SerializedName("votes")int votes;
    }
}
