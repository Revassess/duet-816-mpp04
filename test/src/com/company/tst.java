package com.company;

public class tst {


    public static int IterateAndSum(int[] arr) {
        int i;
        int sum = 0;
        for (i=0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
        return sum;
    }}

