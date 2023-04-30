/*
 *Code : Triangle of Numbers
Send Feedback
Print the following pattern for the given number of rows.
Pattern for N = 4



The dots represent spaces.



Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints :
0 <= N <= 50
Sample Input 1:
5
Sample Output 1:

    1
   232
  34543
 4567654
567898765
Sample Input 2:
4
Sample Output 2:
           1
         232
       34543
     4567654
 */


package com.invertedPatternsQus;


import java.util.Scanner;
public class NumTrianglePattern {


	public static void main(String args[])
    {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
         
        int i, j, num = 1, gap;
 
        gap = n - 1;
 
        for ( j = 1 ; j <= n ; j++ )
        {
        num = j;
         
        for ( i = 1 ; i <= gap ; i++ )
            System.out.print(" ");
         
        gap --;
         
        for ( i = 1 ; i <= j ; i++ )
        {
            System.out.print(num);
            num++;
        }
        num--;
        num--;
        for ( i = 1 ; i < j ; i++)
        {
            System.out.print(num);
            num--;
        }
        System.out.println();
        }
    }
}