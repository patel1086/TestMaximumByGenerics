package com.bridgelabz.genericstest;
import java.util.*;
public class TestMaximum {
	//function for finding max number among three numbers using generics
	public static Integer findMax(Integer num1, Integer num2, Integer num3) {
        Integer max = num1;
        if (num2.compareTo(max) > 0)
            max = num2;
        if (num3.compareTo(max) > 0)
            max = num3;
        return max;
    }
	//function for finding max float number among three float numbers using generics
	public static Float findMax(Float num1, Float num2, Float num3) {
        Float max = num1;
        if (num2.compareTo(max) > 0)
            max = num2;
        if (num3.compareTo(max) > 0)
            max = num3;
        return max;
    }
	//function for finding max String among three string using generics
	public static String findMax(String str1, String str2, String str3) {
        String max = str1;
        if (str2.compareTo(max) > 0)
            max = str2;
        if (str3.compareTo(max) > 0)
            max = str3;
        return max;
    }
	public static void main(String[] args) {
        System.out.println("Welcome to Test Maximum");
        System.out.println("Max Integer among these value is: "+findMax(1,2,3));
        System.out.println("Max float among these value is: "+findMax(1.0f,2.0f,3.0f));
        System.out.println("Max String among these is: "+findMax("Apple", "Peach", "Banana"));
    }

}
