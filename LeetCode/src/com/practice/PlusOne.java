package com.practice;

import java.util.Arrays;
import java.util.Scanner;

public class PlusOne {
    public int[]arr (int[] digits){
        for(int i = digits.length-1;i>=0;--i){
            digits[i] ++;
            digits[i] %= 10;
            if (digits[i] != 0){
                return digits;
            }
        }

        int[] result = new int[digits.length+1];
        result[0] = 1;

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Arrays: ");
        int n = sc.nextInt();

        System.out.println("Enter element in Array: ");
        int[] plusOne = new int[n];
        for (int i=0;i<plusOne.length;i++){
            plusOne[i] = sc.nextInt();
        }

        PlusOne obj = new PlusOne();
        int[] result = obj.arr(plusOne);
        System.out.println("Result after plus one: "+Arrays.toString(result));
       }
}
