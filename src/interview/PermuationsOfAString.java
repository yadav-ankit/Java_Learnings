package interview;

import java.io.*;
import java.util.*;
import java.lang.*;

public class PermuationsOfAString {

	private static void permute(String s , int l ,int r) {
		
		if(l == r) {
			System.out.println(s);
		}
		else
		for(int i=l;i<=r;i++) {
			
			s = swap(s,l,i);
			permute(s,l+1,r);
			s = swap(s,i,l);
		}
	}
	
	private static String swap(String s, int l, int r) {
		
		char c;
		char arr[] = s.toCharArray();
		
		c = arr[l];
		arr[l] = arr[r];
		arr[r] = c;
		
		return String.valueOf(arr);
	}

	public static void main(String[] args) {
	
		String word = "ANKIT";
		
		permute(word,0,word.length()-1);

	}

}
