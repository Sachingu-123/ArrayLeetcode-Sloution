package com.sachin;

public class SwapTwoNumber {

	public static void main(String[] args) {
		int[] a= {10};
		int[] b= {20};
		System.out.println(a[0]+" "+b[0]);
		swap(a,b);
		System.out.println(a[0]+" "+b[0]);
	}
	public static void swap(int[] c,int[] d) {
		int temp=c[0];
		c[0]=d[0];
		d[0]=temp;
	}

}
