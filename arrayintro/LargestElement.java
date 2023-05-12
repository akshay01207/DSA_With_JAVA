package com.arrayintro;

import java.util.Scanner;

public class LargestElement {
	
	public static int[] takeInput() {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]= new int[n];
		
		System.out.println("Enter the all Elements : ");
		
		for(int i=0;i<n;i++) {
			
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	
	public static int LargestElement(int arr[]) {
		
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>max) {
			max=arr[i];
		}
	}
	return max;
}

	public static void main(String[] args) {
		
		int[] arr= takeInput();
		int large=LargestElement(arr);
		
		System.out.println("The largest Element is : " +large);
		

	}
	
}
