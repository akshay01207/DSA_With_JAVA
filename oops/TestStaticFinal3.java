package com.oops;

class TestStaticFinal3{
	
	    static int a = 10; 
	    int b = 20; 
	    static void fun1() 
	    { 
	        a = 20;                             //Line 1
	        b = 10;                             //Line 2
	        fun2();                             //Line 3
	        System.out.print(this.b);           //Line 4
	    } 
	    void fun2() 
	    {     
	        System.out.println("from m2"); 
	    }
	}
	class MCQ3{    
	    public static void main(String[] args) 
	    { 
	    	TestStaticFinal3.fun1(); 
	    } 
	} 


/*
Line 2: static functions cannot use non-static variables.

Line 3: Static function cannot call non-static function.

Line 4:this or super keyword cannot be used inside a static function.
*/


