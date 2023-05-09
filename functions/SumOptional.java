package com.functions;

public class SumOptional {
	public static int sum(int a, int b) {
		System.out.print("int sum ");
		return a + b;
	}

	public static double sum(double a, double b) {
		System.out.print("float sum ");
		return a + b;
	}

	public static void main(String[] args) {
		System.out.print(sum(5, 4));
		System.out.print(sum(5.0, 4.0));
	}
// sum(5,4) would call the 1st Function and sum (5.0,4.0) would call 2nd Function
  //int sum 9float sum 9.0
}
