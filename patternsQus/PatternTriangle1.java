/*
Code : Triangle Number Pattern
Send Feedback
Print the following pattern for the given N number of rows.
Pattern for N = 4

*
**
***
****
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 50
Sample Input 1:
5
Sample Output 1:

*
**
***
****
*****

 */

package com.patternsQus;

import java.util.Scanner;

public class PatternTriangle1 {

	public static void main(String[] args) {
		
		/*
		 for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
		 */

		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		int i =1;
		while (i <= n) {
			int j = n;
			while (j >= n-i+1) {
				System.out.print(j);
				j--;
			}
			System.out.println();
			i++;
		}

	}
}
