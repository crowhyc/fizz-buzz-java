package com.thoughtworks;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CounterTest {

  Counter counter = new Counter();

  @Test
  public void return_fizz_for_3() {
    assertThat(counter.fizzBuzz(3), is(Counter.FIZZ));
  }

  @Test
  public void return_Buzz_for_5() {
    assertThat(counter.fizzBuzz(5), is(Counter.BUZZ));
  }

  @Test
  public void return_Whizz_for_7() {
    assertThat(counter.fizzBuzz(7), is(Counter.WHIZZ));
  }

  @Test
  public void return_1_for_1() {
    assertThat(counter.fizzBuzz(1), is("1"));
  }

  @Test
  public void return_FizzBuzz_for_15() {
    assertThat(counter.fizzBuzz(15), is(Counter.BUZZ));
  }

  @Test
  public void return_FizzBuzz_for_210() {
    assertThat(counter.fizzBuzz(210), is(Counter.FIZZ + Counter.BUZZ + Counter.WHIZZ));
  }

  @Test
  public void return_Fizz_for_13() {
    assertThat(counter.fizzBuzz(13), is(Counter.FIZZ));
  }

  @Test
  public void return_Fizz_for_30() {
    assertThat(counter.fizzBuzz(30), is(Counter.FIZZ));
  }

  @Test
  public void return_Fizz_for_35() {
    assertThat(counter.fizzBuzz(35), is(Counter.BUZZ));
  }
}
