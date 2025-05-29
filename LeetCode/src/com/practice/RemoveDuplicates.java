package com.practice;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n = sc.nextInt();

        System.out.println("Enter element of array: ");
        int[] arr = new int[n];

        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        // to sort array
        for (int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("After sort array: "+Arrays.toString(arr));

        System.out.println(Arrays.toString(arr));
        Solution1 s1 = new Solution1();
        int uniqueCount = s1.Duplicates(arr);

    }
}
class Solution1{
    public int Duplicates(int arr[]){
        int dupli = 0;
        for (int i=0;i<arr.length;i++){
            if(arr[dupli] !=  arr[i]){
                dupli++;
                arr[dupli] = arr[i];
            }
        }
        return dupli+1;
    }
}

