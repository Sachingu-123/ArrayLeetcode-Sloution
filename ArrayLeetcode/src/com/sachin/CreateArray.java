package com.sachin;
import java.util.Scanner;

public class CreateArray {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter the size of array:");
		int[] arr=new int[n];
		System.out.println("Array elements are ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array elements are ");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}

	}

}
