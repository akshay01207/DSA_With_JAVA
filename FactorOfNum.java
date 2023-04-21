/*
 Write a program to print all the factors of a number other than 1 and the number itself.
Input Format :
A single integer, n
Output Format :
All the factors of n excluding 1 and the number itself
Constraints :
0 <= n <= 10,000
Sample Input 1 :
8
Sample Output 1 :
2 4
Sample Input 2 :
11
Sample Output 2 :



Explanation of Sample Output 2 :
No output as 11 is prime having factors as 1 and 11 only
 */


package com.assignmentQus;

import java.util.Scanner;

public class FactorOfNum {

	public static void main(String[] args) {
		
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		for(int i=2;i<num;i++)
			if(num%i==0) {
				System.out.println(i + " ");
			}
			


	}

}
