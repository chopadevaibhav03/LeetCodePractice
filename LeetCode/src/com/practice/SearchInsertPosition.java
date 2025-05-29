package com.practice;

import java.util.Arrays;
import java.util.Scanner;

public class SearchInsertPosition {
    /*
    LINER SEARCH APPROACH

     static  int searchInsert(int []arr,int target){

        for (int i=0;i<arr.length;i++){
            if (arr[i] >= target){
                return i;
            }
        }

        return arr.length;
    }
    */

    // USING Binary Search

    static int searchInsert(int[]arr,int target){
        int low = 0;
        int high = arr.length-1;
        int position = arr.length;

        while (low <= high){
            int mid = low + (high-low)/2;
            if (arr[mid] == target){
                return mid;
            }
            if (arr[mid] > target){
                position = mid;
                high = mid-1;
            }else {
                low = mid+1;
            }
        }
        return position;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of an Array:");
        int n = sc.nextInt();

        int[] arr = new int [n];
        System.out.println("Enter element in array: ");
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        System.out.println("Enter Target Value: ");
        int target = sc.nextInt();

    int result = searchInsert(arr,target);
    System.out.println("Targeted index:  "+result);

    }
}
