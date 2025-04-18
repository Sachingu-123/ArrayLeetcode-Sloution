package com.sachin;

public class minOfArray {
		public static void main(String[] args) {
			int[] arr= {1,3,5,7,8,9,5,3,-2};
			System.out.println(min(arr));	
			}
		public static int min(int arr[]) {
			if(arr.length==0) {
				return -1;
			}
			int ans=arr[0];
			for(int i=0;i<arr.length;i++) {
				if(arr[i]<ans) {
					ans=arr[i];
				}
			}
			return ans;
		}
}

