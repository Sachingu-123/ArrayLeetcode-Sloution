package com.sachin;

import java.util.Arrays;

public class ReverseArrayWithoutExtraArray {

	public static void main(String[] args) {
		int[] arr= {1,3,5,7,9,7,5,3};
		System.out.println(Arrays.toString(arr));
//		print(arr);

	}
	public static void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
