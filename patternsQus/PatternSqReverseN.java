/*
n= 5

5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1 

 */

package com.patternsQus;

import java.util.Scanner;

public class PatternSqReverseN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=n) {
				System.out.print(n-j+1 + " ");
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
