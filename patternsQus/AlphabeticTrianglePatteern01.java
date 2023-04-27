/*
 Alphabetic triangle
Send Feedback
Print the following pattern for the given N number of rows.
Example:


Pattern N=3

A

A B

A B C


Input Format:


First line contains an integer n
Next n lines contain an Integer.


Output Format:


N rows with the pattern.


Constraints:


1<n<=1000

1<=a[i]<=26
Sample Input1:


3

5


Sample Output 1:


A

A B

A B C

A

A B

A B C

A B C D

A B C D E


Explanation for Sample case 1:


No explanation is required.


Sample Input2:


3

4

5

9


Sample Output 2:

A

A B

A B C

A

A B

A B C

A B C D

A

A B

A B C

A B C D

A B C D E

A

A B

A B C

A B C D

A B C D E

A B C D E F

A B C D E F G

A B C D E F G H

A B C D E F G H I
 */

package com.patternsQus;

import java.util.Scanner;

public class AlphabeticTrianglePatteern01 {

	public static void main(String[] args) {
	int n;

	Scanner sc = new Scanner(System.in);
	n=sc.nextInt();

	int i = 1;while(i<=n)
	{
		int j = 1;
		while (j <= i) {
			char jthChar = (char) ('A' + j - 1);
			System.out.print(jthChar + " ");
			j++;
		}
		System.out.println();
		i++;
	}

}

}
