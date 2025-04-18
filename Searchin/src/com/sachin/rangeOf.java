package com.sachin;

public class rangeOf {

	public static void main(String[] args) {
		int[] num= {1,3,5,7,8,9,6,4,3};
		int target=10;
		int ans=rangeOfArray(num,target,1,6);
		System.out.println(ans);

	}
	public static int rangeOfArray(int[] arr,int target,int start, int end) {
		if(arr.length==0) {
			return -1;
		}
		for(int index=start;index<=end;index++) {
			if(target==arr[index]) {
				return index;
			}
		}
		return -1;
	}

}
