package com.revature.tier1;

public class SumOverArray {
	int arr[] = {1,2,3,5};
	public static int IterateAndSum(int[] arr) {
		int i;
		int sum = 0;
		System.out.println("length is" +arr.length);
		for (i=0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("total is:" +sum);
		return sum;
	}}
