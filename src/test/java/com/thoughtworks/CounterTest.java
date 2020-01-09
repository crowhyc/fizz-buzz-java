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
    assertThat(counter.fizzBuzz(15), is(Counter.FIZZ + Counter.BUZZ));
  }

  @Test
  public void return_FizzBuzz_for_35() {
    assertThat(counter.fizzBuzz(35), is(Counter.BUZZ + Counter.WHIZZ));
  }

  @Test
  public void return_FizzBuzzWhizz_for_105() {
    assertThat(counter.fizzBuzz(105), is(Counter.FIZZ + Counter.BUZZ + Counter.WHIZZ));
  }
}
