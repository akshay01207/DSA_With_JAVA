/*
Selection Sort
Send Feedback
Provided with a random integer array/list(ARR) of size N, you have been required to sort this array using 'Selection Sort'.
 Note:
Change in the input array/list itself. You don't need to return or print the elements.
Input format :
First line contains an integer 'N' representing the size of the array/list.

Second line contains 'N' single space separated integers representing the elements in the array/list.
Output format :
For each test case, print the elements of the array/list in sorted order separated by a single space.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^3
Time Limit: 1 sec
Sample Input 1:
7
2 13 4 1 3 6 28
Sample Output 1:
1 2 3 4 6 13 28
Sample Input 2:
5
9 3 6 2 0
Sample Output 2:
0 2 3 6 9
 */

package com.sorting_algos;

public class SelectionSort {
	
public static void printArray(int[]arr){
    int n=arr.length;
    for(int i=0;i<n;i++){
        System.out.println(arr[i]);
    }
}
public static void selectionSort(int[] arr){
    int n=arr.length;
    for(int i=0;i<n-1;i++){
        //Insert element at ith position
        int min=Integer.MAX_VALUE;
        int minIndex=-1;
        for(int j=i;j<n;j++){
            //Finding the minimum element among j positions
            if(arr[j]<min){
                min=arr[j];
                minIndex=j;
            }
        }
        //Swap element at minIndex with the ith element
        int temp=arr[minIndex];
        arr[minIndex]=arr[i];
        arr[i]=temp;
    }
}
    
public static void main(String args[]) {
    int[] arr={1,6,4,8,0,3};
    selectionSort(arr);
    printArray(arr);
    }
}