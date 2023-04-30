/*
 Code : Mirror Image Number Pattern
Send Feedback
Print the following pattern for the given N number of rows.
Pattern for N = 4




The dots represent spaces.


Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 50
Sample Input 1:
3
Sample Output 1:
      1 
    12
  123
Sample Input 2:
4
Sample Output 2:
      1 
    12
  123
1234
 
 */

package com.invertedPatternsQus;

import java.util.Scanner;

public class MirrorNumPattern {
	
public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		 while( i<=n ){
           int num = 1;
           int j =1;
           while( j <= n - i ){
               System.out.print(" ");
             j++;
           }
           while(j<=n){
               System.out.print(num);
               num++;
               j++;
           }
           System.out.println();
           i++;
       }

		
	}

}
