package com.arrayintro;

public class ArrayOptional {
	public static void change(int input[]) {
		input[0] = 15;
	}

	public static void main(String args[]) {
		int arr[] = new int[5];
		change(arr);
		System.out.println(arr[0]);
	}
}

/*
 *####“arr” is a reference to the array, which contains address of the array. 
 *Hence we have passed this address to function “change”. Thus arr and input both refer
 * to the same array.
 * Hence the statement input[0] = 15 changes the value of element at index 0 of the array to 15.
 */
 
