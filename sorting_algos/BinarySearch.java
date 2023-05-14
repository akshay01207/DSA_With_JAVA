/*
Code Binary Search
Send Feedback
You have been given a sorted(in ascending order) integer array/list('nums') of size N and an element 'target'. Your task is to return the index of the element 'target' in the array 'nums'. If the element is not present in the array/list, then return -1.
Example:
Input: ‘N’ = 7 ‘target’ = 3
‘A’ = [1, 3, 7, 9, 11, 12, 45]

Output: 1

Explanation: For nums = [1, 3, 7, 9, 11, 12, 45],
The index of element '3' is 1.
Hence, the answer is '1'.
Input format :
The first line contains an Integer 'N', which denotes the size of the array/list.

The second line contains 'N' single space-separated integers representing the elements in the array/list.

The third line contains the value of 'target' to be searched for in the array/list.
Output Format :
Return the index at which 'target' is present for each test case, -1 otherwise.
Constraints :
1 <= N <= 10^4
1 <= nums[i] <= 10^9
1 <= target <= 10^9
Time Limit: 1 sec
Sample Input 1:
7
1 3 7 9 11 12 45
3
Sample Output 1:
1
Explanation of sample output 1:
For nums = [1, 3, 7, 9, 11, 12, 45],
The index of element '3' is 1.
Hence, the answer is '1'.
Sample Input 2:
7
1 2 3 4 5 6 7
9
Sample Output 2:
-1
Explanation of sample output 2:
For nums = [1, 2, 3, 4, 5, 6, 7],
Element '9' doesn't exist.
Hence, the answer is '-1'.
 */

package com.sorting_algos;

public class BinarySearch {
	public static int binarySearch(int[] arr, int ele) {
		int s = 0;
		int e = arr.length - 1;
		while (s <= e) {
			int mid = (s + e) / 2;
			if (arr[mid] > ele) {
				e = mid - 1;
			} else if (arr[mid] < ele) {
				s = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

	public static void main(String args[]) {
		int[] arr = { 1, 4, 7, 10, 20, 35, 40 };
		int index = binarySearch(arr, 30);
		System.out.println("Index is " + index);
	}
}