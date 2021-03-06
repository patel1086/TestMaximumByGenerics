package com.bridgelabz.genericstest;
import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class TestMaximum<T extends Comparable<T>> {
	T num1;
    T num2;
    T num3;
    public TestMaximum(T num1, T num2, T num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public TestMaximum() {
    }
	//function for finding max number among three numbers 
	public static Integer findMax(Integer num1, Integer num2, Integer num3) {
        Integer max = num1;
        if (num2.compareTo(max) > 0)
            max = num2;
        if (num3.compareTo(max) > 0)
            max = num3;
        return max;
    }
	//function for finding max float number among three float numbers
	public static Float findMax(Float num1, Float num2, Float num3) {
        Float max = num1;
        if (num2.compareTo(max) > 0)
            max = num2;
        if (num3.compareTo(max) > 0)
            max = num3;
        return max;
    }
	//function for finding max String among three string 
	public static String findMax(String str1, String str2, String str3) {
        String max = str1;
        if (str2.compareTo(max) > 0)
            max = str2;
        if (str3.compareTo(max) > 0)
            max = str3;
        return max;
    }
	//function for finding max String among three string using generics 
	public static  <T extends Comparable<T>> T findAnyMax(T num1, T num2, T num3) {
	        T max = num1;
	        if (num2.compareTo(max) > 0)
	            max = num2;
	        if (num3.compareTo(max) > 0)
	            max = num3;
	        printMax(num1,num2,num3, max);
	        return max;
	}
	//Max of any type by creating generic class and method
	public T findAnyMax() {
        return TestMaximum.findAnyMax(num1, num2, num3);
    } 
	//Generic Method to find maximum of more than three variables of any type
	public static <T extends Comparable<T>> T findAnyMax(T... elements) {
	        List<T> list = (List<T>) Arrays.asList(elements).stream().sorted().collect(Collectors.toList());
	        printMax(list.get(elements.length - 1));
	        return list.get(elements.length - 1);
	    }
	//Method for printing max of three variables of any type
    public static <T> void printMax(T var1, T var2, T var3, T max) {
        System.out.println("The maximum in among " + var1 + "," + var2 + "," + var3 + " is " + max);
    }

    //Method for printing max of three or more variables of any type
    public static <T> void printMax(T max) {
        System.out.println("The maximum among the list of variables provided is: " + max);
    }
	public static void main(String[] args) {
        System.out.println("Welcome to Test Maximum");
        System.out.println("Max Integer among these value is: "+findMax(1,2,3));
        System.out.println("Max float among these value is: "+findMax(1.0f,2.0f,3.0f));
        System.out.println("Max String among these is: "+findMax("Apple", "Peach", "Banana"));
        System.out.println("Max String among these is: "+findAnyMax("Apple", "Peach", "Banana"));
        System.out.println("Max Integer by creating Generic class: "+new TestMaximum<Integer>(1, 2, 3).findAnyMax());
        System.out.println("Max Integer by creating Generic class for more than three variable: "+findAnyMax(1,2,3,4));
    }
}
