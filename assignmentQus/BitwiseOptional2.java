package com.assignmentQus;

public class BitwiseOptional2 {
	
//	Choose the correct output of the following code:
		public static void main (String[] args) {
		    int a=10,b=20;
		    int c=a&b;
		    System.out.print(c);
		    int d=a|b;
		    System.out.print(d);
		    int e=a^b;
		    System.out.print(e);
		    int f=c+d+e;
		    System.out.print(~f);
		}
/*
c=10&20=0.
d=10|20=30. 
e=10^20=30.
f=0+30+30=60.
 ~f=-61.
*/

}
