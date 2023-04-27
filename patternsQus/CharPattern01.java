package com.patternsQus;

import java.util.Scanner;

public class CharPattern01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=n) {
				char jthChar= (char)('A'+j-1);
				System.out.print(jthChar + " ");
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
