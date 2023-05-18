package com.advanced_arrays;

public class PushZerosToEnd {

    public static void pushAllZerosToEnd(int[] arr) {
        int nonZero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[nonZero];
                arr[nonZero] = arr[i];
                arr[i] = temp;
                nonZero++;
            }
        }
    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 0, 5, 0, 0, 6, 8};
        int n = arr.length;
        pushAllZerosToEnd(arr);
        printArray(arr);
    }
}
