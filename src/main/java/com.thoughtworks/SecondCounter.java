package com.thoughtworks;

public class SecondCounter {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String WHIZZ = "WHIZZ";
    public static final String EMPTY_STR = "";

    public String fizzBuzz(Pos pos) {
        String result = EMPTY_STR;
        if (pos.isDivisible(3)) {
            result += FIZZ;
        }
        if (pos.isDivisible(5)) {
            result += BUZZ;
        }
        if (pos.isDivisible(7)) {
            result += WHIZZ;
        }
        if (pos.isContains(3)) {
            return FIZZ;
        }

        if (result.length() == 0) {
            return pos.getPos();
        }
        return result;
    }
}
