package com.bridgelabz.genericstest;
import java.util.*;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
public class TestMaximumTest {
	@Test
    public void first_num_max_return_first() {
        Integer max = TestMaximum.findMax(7, 6, 5);
        Assert.assertSame(7, max);
    }
	@Test
    public void second_num_max_return_second() {
        Integer max = TestMaximum.findMax(6, 7, 5);
        Assert.assertSame(7, max);
    }
	@Test
    public void third_num_max_return_third() {
        Integer max = TestMaximum.findMax(5, 6, 7);
        Assert.assertSame(7, max);
    }
    @Test
    public void check_max_number_is_true_when_numbers_are_same() {
        Integer max = TestMaximum.findMax(1,1,1);
        Assert.assertSame(1, max);
    }
    @Test
    public void first_float_max_return_first() {
        Float max = TestMaximum.findMax(7.01f, 6.01f, 5.01f);
        Assert.assertThat(max,CoreMatchers.equalTo(7.01f));
    }
    @Test
    public void second_float_max_return_second() {
        Float max = TestMaximum.findMax(5.01f, 7.01f, 6.01f);
        Assert.assertThat(max,CoreMatchers.equalTo(7.01f));
    }
    @Test
    public void third_float_max_return_third() {
        Float max = TestMaximum.findMax(5.01f, 6.01f, 7.01f);
        Assert.assertThat(max,CoreMatchers.equalTo(7.01f));
    }
   }