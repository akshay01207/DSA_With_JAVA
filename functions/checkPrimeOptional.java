package com.functions;

public class checkPrimeOptional {
	
	public static boolean isPrime(int x)
	{
	    for(int i=2;i<x/2;i++)
	    {
	        if(x%i==0)
	        return false;
	    }
	    return true;

	}
	public static void main (String[] args) {
	    System.out.print(isPrime(47));
	}
	//The loop would execute for i=2 to 22. And 47 is not divisible by any of them.

}
