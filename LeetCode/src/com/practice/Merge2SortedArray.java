package com.practice;

import java.util.Arrays;
import java.util.Scanner;

class MergeArray {
    public void merge(int[] nums1, int m, int[] nums2, int n){
        int idx = m+n-1;
        int i = m-1;
        int j = n-1;

        while (i >= 0 && j>= 0){
            if (nums1[i] >= nums2[j]){
                nums1[idx--] = nums1[i--];
            }else {
                nums1[idx--] = nums2[j--];
            }
        }
        while (j >= 0){
            nums1[idx--] = nums2[j--];
        }

    }

}
public class Merge2SortedArray {
    public static void main(String[] args) {

        MergeArray arr = new MergeArray();
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int n = 3;
        int m = 0;

        arr.merge(nums1, m, nums2, n);
//        System.out.println("merge sorted array: ");
//        for (int num : nums1){
//            System.out.println(num + " ");
//        }
        System.out.println("Merged array: " + Arrays.toString(nums1));
    }
}
