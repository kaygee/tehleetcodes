package com.kevingann;

import org.junit.jupiter.api.Test;

public final class FoodOutletTest {

    @Test
    void first(){
        FoodOutlet foodOutlet = new FoodOutlet();
        int seattle = foodOutlet.getVoteCount("Seattle", 110);
    }
}
