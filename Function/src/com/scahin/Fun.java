package com.scahin;

import java.util.Scanner;

public class Fun {
		public static void Display(int n,int r,int npr) {
			System.out.println(n+" "+"P "+r+" :"+npr);
		}
		public static void Display1(int n,int r,int ncr) {
			System.out.println(n+" "+"C "+r+" :"+ncr);
		}
		

	public static int fact(int n) {
		int rv=1;
		for(int i=1;i<=n;i++) {
			rv*=i;
		}
		return rv;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=sc.nextInt();
		int nFact=fact(n);
		int rFact=fact(r);
		int nmrFact=fact(n-r);
		int npr=nFact/(nmrFact);
		int ncr=nFact/(rFact*nmrFact);
		Display(n,r,npr);
		Display1(n,r,ncr);
		 sc.close();
	}

}
