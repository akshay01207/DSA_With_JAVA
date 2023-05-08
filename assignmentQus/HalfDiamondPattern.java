/*
 Half Diamond Pattern
Send Feedback
Write a program to print N number of rows for Half Diamond pattern using stars and numbers
Note : There are no spaces between the characters in a single line.


Input Format :
A single integer: N
Output Format :
Required Pattern
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
*
*1*
*121*
*12321*
*121*
*1*
*
Sample Input 2 :
 5
Sample Output 2 :
*
*1*
*121*
*12321*
*1234321*
*123454321*
*1234321*
*12321*
*121*
*1*
*
 */
package com.assignmentQus;
import java.util.Scanner;

public class HalfDiamondPattern {
	     public static void main(String[] args) {
	         Scanner sc = new Scanner(System.in);
	        int n=sc.nextInt();
	 		int i=1;
	 		System.out.println("*");
	 		while(i<=n) {
	 			int j=1;
	 			System.out.print("*");
	 			while(j<=i){
	 				System.out.print(j);
	 				j=j+1;

	 			}
	 			j=2;
	 			while(j<=i) {
	 				System.out.print(i-j+1);
	 				j=j+1;

	 			}
	 			System.out.print("*");
	 			System.out.println();
	 			i=i+1;

	 		}
	 		i=n-1;
	 		while(i>=1) {
	 			int j=1;
	 			System.out.print("*");
	 			while(j<=i){
	 				System.out.print(j);
	 				j=j+1;
	 			}
	 			j=n+i-1;
	 			while(j>n) {
	 				System.out.print(j-n);	
	 				j=j-1;
	 			}
	 			System.out.print("*");
	 			System.out.println();
	 			i=i-1;
	 		}
	 		System.out.println("*");
	         }
	         // Move to the next line
	     //     System.out.println();
	     // }
	 }