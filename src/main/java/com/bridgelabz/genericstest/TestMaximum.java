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

    public static void main(String[] args) {
        System.out.println("Welcome to Test Maximum");
        System.out.println("Max among these value is: "+findMax(1,2,3));
    }

}
