package com.functions;

import java.util.Scanner;

public class FahrenheitToCelsiusTable {
	
	public static int printFahrenheitTable(int start, int end, int step) {

		 int i,C = 0;
        for(i=start;i<=end;i=i+step){
            C=((i-32)*5)/9;
            System.out.println(i+"\t"+C);
        }
		return C;
		
	}

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		int result = printFahrenheitTable(20, 30, 3);
		System.out.println(result);
	}

}
