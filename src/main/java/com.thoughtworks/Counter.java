package com.thoughtworks;

public class Counter {

  public static final String BUZZ = "Buzz";
  public static final String FIZZ = "Fizz";
  public static final String WHIZZ = "Whizz";

  public String fizzBuzz(int position) {
    StringBuilder result = new StringBuilder();
    String pos = position + "";
    if (pos.contains("7")) {
      return WHIZZ;
    } else if (pos.contains("5")) {
      return BUZZ;
    } else {
      if (pos.contains("3")) {
        return FIZZ;
      } else {
        if (position % 3 == 0) {
          result.append(FIZZ);
        }
        if (position % 5 == 0) {
          result.append(BUZZ);
        }
        if (position % 7 == 0) {
          result.append(WHIZZ);
        }
      }
    }
    if (result.length() == 0) {
      return pos;
    }
    return result.toString();
  }
}
