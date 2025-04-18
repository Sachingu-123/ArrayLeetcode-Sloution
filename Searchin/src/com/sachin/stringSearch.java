package com.sachin;

public class stringSearch {

	public static void main(String[] args) {
		String name="Sachin";
		char target='s';
		boolean ans=strngSearch(name,target);
		System.out.print(ans);
	}
	public static boolean strngSearch(String str,char target) {
		if(str.length()==0) {
			return false;
		}
		for(int i=0;i<str.length();i++) {
			if(target==str.charAt(i)) {
				return true;
			}
		}
		return false;
	}

}
