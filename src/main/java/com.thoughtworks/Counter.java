package com.thoughtworks;

public class Counter {

  public static final String BUZZ = "Buzz";
  public static final String FIZZ = "Fizz";
  public static final String WHIZZ = "WHIZZ";

  public String fizzBuzz(int position) {
    if (position % 5 == 0) {
      return BUZZ;
    }
    if (position % 7 == 0) {
      return WHIZZ;
    }
    if (position % 3 == 0) {
      return FIZZ;
    }
    return position + "";
  }
}
