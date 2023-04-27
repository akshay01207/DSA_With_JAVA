/*
 Code : Alpha Pattern

Print the following pattern for the given N number of rows.

Pattern for N = 3

 A
 BB
 CCC
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 26

Sample Input 1:
7
Sample Output 1:

A
BB
CCC
DDDD
EEEEE
FFFFFF
GGGGGGG

Sample Input 2:
6
Sample Output 2:

A
BB
CCC
DDDD
EEEEE
FFFFFF
 */

package com.patternsQus;

import java.util.Scanner;

public class AlphaTrianglePatteern02 {

	public static void main(String[] args) {
	int n;

	Scanner sc = new Scanner(System.in);
	n=sc.nextInt();

	int i = 1;
	while(i<=n)
	{
		int j = 1;
		while (j <= i) {
			char jthChar = (char) ('A' + i - 1);
			System.out.print(jthChar + " ");
			j++;
		}
		System.out.println();
		i++;
	}

}

}
