package com.assignmentQus;

public class BitwiseOptional {
//	Bitwise Output
//	Send Feedback
//	Choose the correct output for the following code:
	public static void main (String[] args) {
	    int a=10,b=50;
	    a++;
	    --b;
	    int c=a--+b--;
	    System.out.println(++c);
	    System.out.println(a +" "+ b);
	}
	
	/*
	 a++,a=11.   --b,b=49.    
    c=a--+b--=11+49=60  
      a=10
      b=48
      print(++c)->print(61)
	 */


}
