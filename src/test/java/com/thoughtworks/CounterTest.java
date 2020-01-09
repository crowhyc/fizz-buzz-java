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
}
