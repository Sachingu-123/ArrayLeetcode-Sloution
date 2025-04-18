package com.sachin;

public class SLargestSsmallest {
	    public static void main(String[] args){
	        int[] arr={7,-7,-9,70,77,67,80,9};
	       int ans=secLargest(arr);
	      int ans1=sSmallest(arr);
	       System.out.println(ans+" "+ans1);  
	    }
	    public static int secLargest(int arr[]){
	        int largest=arr[0];
	        int slargest=-1;
	        for(int i=1;i<arr.length;i++){
	            if(arr[i]>largest){
	                
	                slargest=largest;
	                largest=arr[i];
	                
	            }
	            else if( arr[i]>slargest && arr[i]!=largest ){
	                slargest=arr[i];
	            }
	        }
	        return slargest;
	       
	    }
	    public static int sSmallest(int[] arr){
	       int smallest=arr[0];
	       int secSamllest=Integer.MAX_VALUE;
	       for(int i=1;i<arr.length;i++){
	           if(arr[i]<smallest){
	               
	               secSamllest=smallest;
	                smallest=arr[i];
	                
	           }
	           else if(arr[i]!=smallest && arr[i]<smallest){
	               secSamllest=arr[i];
	           }
	       }
	       return secSamllest;
	}
}
