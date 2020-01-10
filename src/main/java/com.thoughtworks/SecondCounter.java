package com.thoughtworks;

public class SecondCounter {

  public String FizzBuzz(Integer pos) {
    if (pos % 3 == 0) {
      return "Fizz";
    }
    return pos.toString();
  }
}
