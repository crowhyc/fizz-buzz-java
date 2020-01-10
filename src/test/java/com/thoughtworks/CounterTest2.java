package com.thoughtworks;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CounterTest2 {
    SecondCounter secondCounter = new SecondCounter();

    @Test
    public void return_Fizz_for_3() {
        assertThat(secondCounter.FizzBuzz(3), is("Fizz"));
    }

    @Test
    public void return_4_for_4() {
        assertThat(secondCounter.FizzBuzz(4), is("4"));
    }

}
