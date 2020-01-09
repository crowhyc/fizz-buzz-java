package com.thoughtworks;

public class Counter {

  public static final String BUZZ = "Buzz";
  public static final String FIZZ = "Fizz";
  public static final String WHIZZ = "WHIZZ";

  public String fizzBuzz(int position) {
    StringBuilder result = new StringBuilder();
    if (position % 3 == 0 || (position + "").contains("3")) {
      result.append(FIZZ);
    }
    if (position % 5 == 0) {
      result.append(BUZZ);
    }
    if (position % 7 == 0) {
      result.append(WHIZZ);
    }
    if (result.length() == 0) {
      return position + "";
    }
    return result.toString();
  }
}
