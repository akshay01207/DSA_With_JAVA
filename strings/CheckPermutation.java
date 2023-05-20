/*
 Check Permutation
Send Feedback
For a given two strings, 'str1' and 'str2', check whether they are a permutation of each other or not.
Permutations of each other
Two strings are said to be a permutation of each other when either of the string's characters can be rearranged so that it becomes identical to the other one.

Example: 
str1= "sinrtg" 
str2 = "string"

The character of the first string(str1) can be rearranged to form str2 and hence we can say that the given strings are a permutation of each other.
Input Format:
The first line of input contains a string without any leading and trailing spaces, representing the first string 'str1'.

The second line of input contains a string without any leading and trailing spaces, representing the second string 'str2'.
Note:
All the characters in the input strings would be in lower case.
Output Format:
The only line of output prints either 'true' or 'false', denoting whether the two strings are a permutation of each other or not.

You are not required to print anything. It has already been taken care of. Just implement the function. 
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 second
Sample Input 1:
abcde
baedc
Sample Output 1:
true
 */

package com.strings;

import java.util.*;
import java.io.*;
import java.util.Scanner;

public class CheckPermutation {

	static boolean isPermutation(String input1, String input2) {
		
		char[] a = input1.toCharArray();
		char[] b = input2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		String str = new String(a);
		String str1 = new String(b);
		if (str.equals(str1)) {
			return true;
		}
		return false;
	}

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		String input1 = sc.nextLine();
		String input2 = sc.nextLine();
		boolean answer = isPermutation(input1, input2);
		if (answer) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}
