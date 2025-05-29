package com.practice;
/*
        27. Remove Element
        Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
Return k.
         */
import java.util.Arrays;
import java.util.Scanner;

public class RemoveElements {

    public  static  int removeElement(int[] arr,int val){
            int num = 0;
            for (int i=0;i<arr.length;i++){
                if (arr[i] != val){
                    arr[num] = arr[i];
                    num++;
                }
            }
            return num;
    }
    public static void main(String[] args) {

        int[] arr = {3,2,2,1,5,2,9};
        int val = 2;
        int result = removeElement(arr,val);
        System.out.println(result);
        System.out.println(Arrays.toString(arr));
    }
}
