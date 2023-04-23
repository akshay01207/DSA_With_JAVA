package com.patternsQus;

import java.util.Scanner;

public class PatternSq01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=n) {
				System.out.print("* ");
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
