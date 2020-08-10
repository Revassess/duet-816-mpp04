package com.revature.tier1;

public class SumOverArray {

	int arr[] = { 1,2,3, 4 };
	public static int IterateAndSum(int[] arr) {
		int i;
		int sum = 0;
		for (i=0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum);
		return sum;
	}
}
