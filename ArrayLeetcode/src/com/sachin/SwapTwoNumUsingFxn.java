package com.sachin;

public class SwapTwoNumUsingFxn {

	public static void main(String[] args) {
//		int a=10;
//		int b=20;
//		System.out.println(a+" "+b);
//		swap(a,b);
//		System.out.println(a+" "+b);   //value wont be change due to pass by value.
											
		int[] a= {10,20};
		System.out.println(a[0]+" "+a[1]);
		swap1(a);
		System.out.println(a[0]+" "+a[1]);
	}
	public static void swap(int a,int b) {
		int temp=a;
		a=b;
		b=temp;
//		System.out.println(a+" "+b);
	}
	public static void swap1(int[] a) {
		int temp=a[0];
		a[0]=a[1];
		a[1]=temp;
	}

}
