/*
 Reverse Char Pattern
Send Feedback
Print the following pattern for the given N number of rows.
Pattern for N = 5
E
ED
EDC
EDCB
EDCBA
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 50
Sample Input 1:
7

Sample Output 1:
G
GF
GFE
GFED
GFEDC
GFEDCB
GFEDCBA
Sample Input 1:
6
Sample Output 1:
F
FE
FED
FEDC
FEDCB
FEDCBA
 */

package com.patternsQus;

import java.util.Scanner;

public class AlphaTriangleReversePatteern05 {

	public static void main(String[] args) {

		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		int i = n;
		
		while (i >= 1) {
			int j = i;
			int p=n;
			while (j <= n) {
				char jthChar = (char) ('A' + p - 1);
//			System.out.print((char)(64+j));
				System.out.print(jthChar + " ");
				p--;
				j++;
			}
			System.out.println();
			i--;
		}

	}

}
