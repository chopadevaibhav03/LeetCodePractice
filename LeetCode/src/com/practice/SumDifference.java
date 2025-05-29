package com.practice;

import java.util.Scanner;

public class SumDifference {
    public  int differenceOfSums(int n , int m){

        int sum = n/m;
        int num2 = m*sum*(sum+1)/2;
        int num1 = n*(n+1)/2 - num2;
        return num1-num2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number: ");
        int n = sc.nextInt();

        System.out.println("Enter 2nd number: ");
        int m = sc.nextInt();

        SumDifference sd = new SumDifference();
        int ans = sd.differenceOfSums(n,m);
        System.out.println("The difference between two number sum is: "+ans);


    }
}
