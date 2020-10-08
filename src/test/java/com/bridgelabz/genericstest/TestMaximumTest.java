package com.bridgelabz.genericstest;
import java.util.*;
import org.junit.Assert;
import org.junit.Test;
public class TestMaximumTest {
	@Test
    public void check_max_number_is_true() {
        TestMaximum t = new TestMaximum();
        Integer max = t.findMax(1,2,3);
        Assert.assertSame(3, max);
    }
    @Test
    public void check_max_number_is_true_when_numbers_are_same() {
        TestMaximum t = new TestMaximum();
        Integer max = t.findMax(1,1,1);
        Assert.assertSame(1, max);
    }
   }