package com.thoughtworks;

public class SecondCounter {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public String FizzBuzz(Integer pos) {
        if (pos % 3 == 0) {
            return FIZZ;
        }
        if (pos % 5 == 0) {
            return BUZZ;
        }
        return pos.toString();
    }
}
