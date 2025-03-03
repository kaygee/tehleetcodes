package com.kevingann;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class PalindromeNumberTest {

    @Test
    void oneHundredTwentyOne(){

        var palindromeNumber = new PalindromeNumber();
        assertThat(palindromeNumber.isPalindrome(121)).isTrue();
    }

    @Test
    void ten(){

        var palindromeNumber = new PalindromeNumber();
        assertThat(palindromeNumber.isPalindrome(10)).isFalse();
    }



}
