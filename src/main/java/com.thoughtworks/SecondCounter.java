package com.thoughtworks;

public class SecondCounter {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String WHIZZ = "WHIZZ";

    public String fizzBuzz(Integer pos) {
        if (pos % 3 == 0) {
            return FIZZ;
        }
        if (pos % 5 == 0) {
            return BUZZ;
        }
        if (pos % 7 == 0) {
            return WHIZZ;
        }
        return pos.toString();
    }
}
