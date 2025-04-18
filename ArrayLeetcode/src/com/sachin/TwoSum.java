package com.sachin;
import java.util.*;
public class TwoSum {

	public static void main(String[] args) {
		int[] arr= {7,8,11,15,2};
		int target=9;
		int[] ans=twoSum(arr, target);
		System.out.println(Arrays.toString(ans));

	}
	public static int[] twoSum(int[] arr,int target) {
		int[] nums=new int[2];
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==target) {
					nums[0]=i;
					nums[1]=j;
					
					
				}
			}
		}
		return new int[]{-1, -1};
		
	}

}
