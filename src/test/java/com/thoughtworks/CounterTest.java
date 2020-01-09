package com.thoughtworks;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.hamcrest.core.Is;
import org.junit.Test;

public class CounterTest {

    Counter counter=new Counter();
    @Test
    public void return_fizz_for_3() {
        assertThat(counter.fizzBuzz(3), is("fizz"));
    }
}
