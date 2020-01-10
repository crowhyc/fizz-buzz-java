package com.thoughtworks;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CounterTest2 {
    SecondCounter secondCounter = new SecondCounter();

    @Test
    public void return_Fizz_for_3() {
        assertThat(secondCounter.fizzBuzz(Pos.of(3)), is(SecondCounter.FIZZ));
    }

    @Test
    public void return_4_for_4() {
        assertThat(secondCounter.fizzBuzz(Pos.of(4)), is("4"));
    }

    @Test
    public void return_Buzz_for_5() {
        assertThat(secondCounter.fizzBuzz(Pos.of(5)), is(SecondCounter.BUZZ));
    }

    @Test
    public void return_Whizz_for_7() {
        assertThat(secondCounter.fizzBuzz(Pos.of(7)), is(SecondCounter.WHIZZ));
    }

    @Test
    public void return_FizzBuzzWhizz_for_105() {
        assertThat(
                secondCounter.fizzBuzz(Pos.of(105)),
                is(SecondCounter.FIZZ + SecondCounter.BUZZ + SecondCounter.WHIZZ));
    }

    @Test
    public void return_Fizz_for_13() {
        assertThat(secondCounter.fizzBuzz(Pos.of(13)), is(SecondCounter.FIZZ));
    }
}
