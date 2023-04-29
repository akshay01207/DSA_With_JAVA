/*
 Code : Interesting Alphabets
Send Feedback
Print the following pattern for the given number of rows.
Pattern for N = 5
E
DE
CDE
BCDE
ABCDE
Input format :
N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 26
Sample Input 1:
8
Sample Output 1:
H
GH
FGH
EFGH
DEFGH
CDEFGH
BCDEFGH
ABCDEFGH
Sample Input 2:
7
Sample Output 2:
G
FG
EFG
DEFG
CDEFG
BCDEFG
ABCDEFG
 */

package com.patternsQus;

import java.util.Scanner;

public class AlphaTriangleReversePatteern04 {

	public static void main(String[] args) {
	
	int n;
	Scanner sc = new Scanner(System.in);
	n=sc.nextInt();

	int i = n;
	while(i>=1)
	{
		int j = i;
//		int p=i;
		while (j <= n) {
			char jthChar = (char) ('A' + j -1);
			System.out.print(jthChar + " ");
//			p++;
			j++;
		}
		System.out.println();
		i--;
	}

}

}
