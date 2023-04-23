/*
n= 5

1 1 1 1 1 
2 2 2 2 2 
3 3 3 3 3 
4 4 4 4 4 
5 5 5 5 5 
 */

package com.patternsQus;

import java.util.Scanner;

public class PatternSq2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=n) {
				System.out.print(i +" ");
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
