package com.sachin;

public class CheckSoetedArray {    //this question is applicable for non decreasing array

	public static void main(String[] args) {
		int arr[]= {1,2,2,3,3,4,5};
		if(isArraySorted(arr)) 
			System.out.println("Array is sorted");
		else
			System.out.print("Array is not sorted");

	}
	public static boolean isArraySorted(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<arr[i-1]) {
				return false;
			}
		}
		return true;
	}

}


/*class Main{
    public static void main(String[] args){
        int[] arr={1,2,2,3,3,4,5,2};
       boolean ans= isArraySorted(arr);
       System.out.println(ans);
        
    } 
        public static boolean isArraySorted(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i]>=arr[i-1]){
               
            }
            else{
                return false;
            }
        }
        return true;
       
    }
}
		*/












