package com.thoughtworks;

public class SecondCounter {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String WHIZZ = "WHIZZ";

    public String fizzBuzz(Pos pos) {
        if (pos.isDivisible(3)) {
            return FIZZ;
        }
        if (pos.isDivisible(5)) {
            return BUZZ;
        }
        if (pos.isDivisible(7)) {
            return WHIZZ;
        }
        return pos.getPos();
    }
}
