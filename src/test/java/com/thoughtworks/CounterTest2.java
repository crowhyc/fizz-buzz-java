package com.thoughtworks;

import static com.thoughtworks.SecondCounter.BUZZ;
import static com.thoughtworks.SecondCounter.FIZZ;
import static com.thoughtworks.SecondCounter.WHIZZ;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CounterTest2 {
    SecondCounter secondCounter = new SecondCounter();

    @Test
    public void return_Fizz_for_3() {
        assertThat(secondCounter.fizzBuzz(Pos.of(3)), is(FIZZ));
    }

    @Test
    public void return_4_for_4() {
        assertThat(secondCounter.fizzBuzz(Pos.of(4)), is("4"));
    }

    @Test
    public void return_Buzz_for_5() {
        assertThat(secondCounter.fizzBuzz(Pos.of(5)), is(BUZZ));
    }

    @Test
    public void return_Whizz_for_7() {
        assertThat(secondCounter.fizzBuzz(Pos.of(7)), is(WHIZZ));
    }

    @Test
    public void return_FizzBuzzWhizz_for_210() {
        assertThat(secondCounter.fizzBuzz(Pos.of(210)), is(FIZZ + BUZZ + WHIZZ));
    }

    @Test
    public void return_Fizz_for_13() {
        assertThat(secondCounter.fizzBuzz(Pos.of(13)), is(FIZZ));
    }

    @Test
    public void return_BuzzWhizz_for_35() {
        assertThat(secondCounter.fizzBuzz(Pos.of(35)), is(BUZZ + WHIZZ));
    }
}
