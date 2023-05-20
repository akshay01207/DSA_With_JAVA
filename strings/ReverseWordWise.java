package com.strings;

public class ReverseWordWise {
	
	public static String reverseWordWise(String input) {
		// Write your code here
		int end = input.length() - 1; // Initialize the end index to the last character of the input
		int start, j;
		String result = "";
		String word = "";

		for (int i = input.length() - 1; i >= 0; i--) {
			if (input.charAt(i) == ' ') {
				start = i + 1; // Set the start index to the character after the space
				word = "";

				for (j = start; j <= end; j++) {
					word += input.charAt(j); // Append each character of the word
				}

				end = i - 1; // Update the end index for the next word
				result = result + word + " "; // Append the reversed word and a space to the result
			}
		}

		word = "";
		for (j = 0; j <= end; j++) {
			word = word + input.charAt(j); // Append each character of the last word
		}

		result += word; // Append the last word to the result
		return result;

}

	public static void main(String[] args) {
		String str= "Hey My name is Akshay!";
		String result=reverseWordWise(str);
		System.out.println(result);

	}

}
