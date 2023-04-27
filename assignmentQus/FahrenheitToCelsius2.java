package com.basicJava;

import java.util.Scanner;

public class FahrenheitToCelsius2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temperature : ");
		temp=sc.nextFloat();
		
		temp= ((temp-32)*5)/9;
		
		System.out.println("calcous temp is "+ temp);
		

	}

}
