/*
Code : Triangle Number Pattern
Send Feedback
Print the following pattern for the given N number of rows.
Pattern for N = 4

1 
2 3 
3 4 5 
4 5 6 7 

Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 50
Sample Input 1:
5
Sample Output 1:

1 
2 3 
3 4 5 
4 5 6 7 
5 6 7 8 9 
 */

package com.patternsQus;

import java.util.Scanner;

public class PatternTriangle04 {

	public static void main(String[] args) {

		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		

		int i = 1;
		
		while (i <= n) {
			int j = 1;
			int p=i;
			while (j <= i) {
				System.out.print(p +" ");
				p++;
				j++;
			}
			System.out.println();
			i++;
		}

	}
}
