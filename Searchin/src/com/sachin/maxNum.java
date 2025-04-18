package com.sachin;

public class maxNum {

	public static void main(String[] args) {
		int[] arr= {2,4,7,9,5,0,10,999};
	int ans=maxNumber(arr);
	System.out.println(ans);

	}
	public static int maxNumber(int arr[]) {
		if(arr.length==0) {
			return -1;
			
		}
		int ans=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>ans) {
				ans=arr[i];
			}
		}
		return ans;
	}

}
