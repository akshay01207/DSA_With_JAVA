/*
Code : Triangle Number Pattern
Send Feedback
Print the following pattern for the given N number of rows.
Pattern for N = 4

1
23
456
78910

Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 50
Sample Input 1:
5
Sample Output 1:
4
Sample Output 1:
1
23
456
78910
11121314
 */

package com.patternsQus;

import java.util.Scanner;

public class PatternTriangle03 {

	public static void main(String[] args) {

		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int p=1;

		int i = 1;
		while (i <= n) {
			int j = 1;
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
