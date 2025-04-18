package com.sachin;
import java.util.*;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr= {1,3,5,7,9,8};
		reverseArray(arr);
		System.out.println(Arrays.toString(arr));

	}
	public static void reverseArray(int[] arr) {
		int left=0;
		int right=arr.length-1;
		while(left<right) {
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			
			left++;
			right--;
			}
	}

}
