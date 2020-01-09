package com.thoughtworks;

public class Counter {

  public static final String BUZZ = "Buzz";
  public static final String FIZZ = "Fizz";

  public String fizzBuzz(int position) {
    if (position % 5 == 0) {
      return BUZZ;
    }
    return FIZZ;
  }
}
