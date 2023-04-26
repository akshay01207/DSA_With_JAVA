/*
 n=5
 
5 
5 4 
5 4 3 
5 4 3 2 
5 4 3 2 1 
 */


package com.patternsQus;

import java.util.Scanner;

public class ReverseTriangle {
	public static void main(String[] args) {

	int n;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();

	int rows = n;
	while(rows>0)
	{
		int col = n - rows + 1;
		int num = n;
		while (col > 0) {
			System.out.print(num + " ");
			num--;
			col--;
		}
		System.out.println();
		rows--;
	}
}}