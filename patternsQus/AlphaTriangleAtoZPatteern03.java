/*
 Code : Alpha Pattern

Print the following pattern for the given N number of rows.

Pattern for N = 3

A 
B C 
C D E 
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 26

Sample Input 1:
5
Sample Output 1:

A 
B C 
C D E 
D E F G 
E F G H I 

Sample Input 2:
6
Sample Output 2:

A 
B C 
C D E 
D E F G 
E F G H I 
F G H I J K 
 */

package com.patternsQus;

import java.util.Scanner;

public class AlphaTriangleAtoZPatteern03 {

	public static void main(String[] args) {
	
	int n;
	Scanner sc = new Scanner(System.in);
	n=sc.nextInt();

	int i = 1;
	while(i<=n)
	{
		int j = 1;
		int p=i;
		while (j <= i) {
			char jthChar = (char) ('A' + p -1);
			System.out.print(jthChar + " ");
			p++;
			j++;
		}
		System.out.println();
		i++;
	}

}

}
