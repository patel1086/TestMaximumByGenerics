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
    @Test
    public void first_string_max_return_first() {
        String max = TestMaximum.findMax("Peach", "Apple", "Banana");
        Assert.assertThat(max, CoreMatchers.equalTo("Peach"));
    }

    @Test
    public void second_string_max_return_second() {
        String max = TestMaximum.findMax("Apple", "Peach", "Banana");
        Assert.assertThat(max, CoreMatchers.equalTo("Peach"));
    }

    @Test
    public void third_string_max_return_third() {
        String max = TestMaximum.findMax("Apple", "Banana", "Peach");
        Assert.assertThat(max, CoreMatchers.equalTo("Peach"));
    }
    @Test
    public void any_type_return_max_float() {
        Float max = TestMaximum.findAnyMax(1.01f, 2.02f, 3.03f);
        Assert.assertThat(max, CoreMatchers.equalTo(3.03f));
    }
    @Test
    public void any_type_return_max_string() {
        String max = TestMaximum.findAnyMax("Apple", "Banana", "Peach");
        Assert.assertThat(max, CoreMatchers.equalTo("Peach"));
    }
    @Test
    public void any_type_return_maxt_integer() {
        Integer max = TestMaximum.findAnyMax(1, 2, 3);
        Assert.assertThat(max, CoreMatchers.equalTo(3));
    }
    @Test
    public void any_type_return_max_integer_by_generic_class() {
        Integer max = new TestMaximum<Integer>(1, 2, 3).findAnyMax();
        Assert.assertThat(max, CoreMatchers.equalTo(3));
    }
    @Test
    public void any_type_return_max_float_by_generic_class() {
        Float max = new TestMaximum<Float>(1.01f, 2.02f, 3.03f).findAnyMax();
        Assert.assertThat(max, CoreMatchers.equalTo(3.03F));
    }
    @Test
    public void any_type_return_max_string_by_generic_class() {
        String max = new TestMaximum<String>("Apple", "Banana", "Peach").findAnyMax();
        Assert.assertThat(max, CoreMatchers.equalTo("Peach"));
    }
   }