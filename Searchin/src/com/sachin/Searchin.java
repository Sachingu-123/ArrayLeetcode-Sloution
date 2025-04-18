package com.sachin;

public class Searchin {

	public static void main(String[] args) {
		int[] num= {1,13,15,6,8,9,5,4,3};
		int target=5;
		int ans=linearSearch(num, target);
		System.out.println(ans);

	}
	public static int linearSearch(int arr[],int target) {
		if(arr.length==0) {
			return -1;
		}
		for(int index=0;index<arr.length;index++) {
			int element=arr[index];
			if(element==target) {
				return index;
			}
		}
		return -1;
	}

}
