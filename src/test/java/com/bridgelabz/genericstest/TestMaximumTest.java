package com.bridgelabz.genericstest;
import java.util.*;
import org.junit.Assert;
import org.junit.Test;
public class TestMaximumTest {
	@Test
    public void first_num_max_return_first() {
        TestMaximum t = new TestMaximum();
        Integer max = t.findMax(7, 6, 5);
        Assert.assertSame(7, max);
    }

    @Test
    public void second_num_max_return_second() {
        TestMaximum t = new TestMaximum();
        Integer max = t.findMax(6, 7, 5);
        Assert.assertSame(7, max);
    }

    @Test
    public void third_num_max_return_third() {
        TestMaximum t = new TestMaximum();
        Integer max = t.findMax(5, 6, 7);
        Assert.assertSame(7, max);
    }
    @Test
    public void check_max_number_is_true_when_numbers_are_same() {
        TestMaximum t = new TestMaximum();
        Integer max = t.findMax(1,1,1);
        Assert.assertSame(1, max);
    }
   }