package com.kevingann;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class RomanToIntegerTest {

    @Test
    void first(){
        String test = "III";
        RomanToInteger romanToInteger = new RomanToInteger();
        int result = romanToInteger.romanToInt(test);
        assertThat(result).isEqualTo(3);
    }

    @Test
    void second(){
        String test = "LVIII";
        RomanToInteger romanToInteger = new RomanToInteger();
        int result = romanToInteger.romanToInt(test);
        assertThat(result).isEqualTo(58);
    }

    @Test
    void third(){
        String test = "MCMXCIV";
        RomanToInteger romanToInteger = new RomanToInteger();
        int result = romanToInteger.romanToInt(test);
        assertThat(result).isEqualTo(1994);
    }
}
