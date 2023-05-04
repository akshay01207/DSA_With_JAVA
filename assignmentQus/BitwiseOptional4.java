package com.assignmentQus;

public class BitwiseOptional4 {
	public static void main (String[] args) {
	    int a=5;
	    a+=5+(++a)+(a++);
	    System.out.print(a); //22
/*
a=a+5+(++a)+(a++).  
=5+5+6+6
=22
	     */
	} 
}

