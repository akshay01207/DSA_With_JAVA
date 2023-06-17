package com.oops;

class TestStaticFinal2{
	
	    static int a = 10; 
	    static int b; 
	    static void fun(){ 
	        b = a * 4; 
	    } 
	} 
	class MCQ2{
	   public static void main(String[] args) 
	    { 
		   TestStaticFinal2 t=new TestStaticFinal2();
	      t.fun();
	      System.out.print(TestStaticFinal2.a+TestStaticFinal2.b);
	    } 
	} 


