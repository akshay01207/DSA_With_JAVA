/*
 Code : Alpha Traingle Pattern

Print the following pattern for the given N number of rows.

Pattern for N = 3

A 
B C 
D E F 

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
D E F 
G H I J 
K L M N O 

Sample Input 2:
6
Sample Output 2:

A 
B C 
D E F 
G H I J 
K L M N O 
P Q R S T U 
 */

package com.patternsQus;

import java.util.Scanner;

public class AlphaTriangleAtoZPatteern {

	public static void main(String[] args) {

		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		int i = 1;
		int p = 1;
		while (i <= n) {
			int j = 1;

			while (j <= i) {
				char jthChar = (char) (p + 64);
				System.out.print(jthChar + " ");
				p++;
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
