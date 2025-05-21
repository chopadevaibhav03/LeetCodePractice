    package com.practice;

    import java.lang.reflect.Array;
    import java.util.Arrays;
    import java.util.Scanner;/*
    You are given a 0-indexed integer array nums of size 3 which can form the sides of a triangle.

    A triangle is called equilateral if it has all sides of equal length.
    A triangle is called isosceles if it has exactly two sides of equal length.
    A triangle is called scalene if all its sides are of different lengths.
    Return a string representing the type of triangle that can be formed or "none" if it cannot form a triangle.
     */

    class Solution {
        public String triangleType(int[] nums) {

            if(nums.length !=3)
                return "none";
            if(nums[0] == nums[1] && nums[0] == nums[2]){
                return "equilateral";
            }


            if(nums[0] == nums[1] || nums[0] == nums[2] || nums[1] == nums[2]){
                if(nums[0] + nums[1] > nums[2] && nums[0] + nums[2] > nums[1] && nums[1] + nums[2] > nums[0]){
                    return "isosceles";
                }
                return "none";
            }


            if(nums[0] + nums[1] > nums[2] && nums[0] + nums[2] > nums[1] && nums[1] + nums[2] > nums[0]) {
                return "scalene";
            }
            return "none";
        }
    }
    public class TypeOfTriangle {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter size of an array: ");
            int n =  sc.nextInt();

            System.out.println("Enter array element: ");
            int nums[] = new int[n];

            for (int i=0;i<nums.length;i++){
                nums[i] = sc.nextInt();
            }
            System.out.println(Arrays.toString(nums));

            Solution s = new Solution();
            System.out.println("Triangle type : "+s.triangleType(nums));
        }
    }


