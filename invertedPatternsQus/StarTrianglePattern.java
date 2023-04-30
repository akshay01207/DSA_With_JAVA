
/*
 Code : Star Pattern
Send Feedback
Print the following pattern
Pattern for N = 4



The dots represent spaces.



Input Format :
N (Total no. of rows)
Output Format :
Pattern in N lines
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
   *
  *** 
 *****
Sample Input 2 :
4
Sample Output 2 :
    *
   *** 
  *****
 *******
 */
package com.invertedPatternsQus;

import java.util.Scanner;

public class StarTrianglePattern {
public static void main(String[] args) {
		
		int n;
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();

		int i=1;
		while(i<=n){
			int spaces=1;
			while(spaces<=n-i){
				System.out.print(' ');
				spaces++;
			}
			int stars=1;
			while(stars<=i){
				System.out.print('*');
				stars++;
			}
			int dec=i-1;
			while(dec>=1){
				System.out.print('*');
				dec--;
			}
			System.out.println();
			i++;
		}

		
	}

}
