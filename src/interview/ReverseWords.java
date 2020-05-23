package interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class ReverseWords {

	private static StringBuilder  reverse(StringBuilder stringBuilder) {
		int i=0,j=stringBuilder.length()-1;
		
		StringBuilder str = new StringBuilder(stringBuilder);
		while(i<j) {
			
			char a = str.charAt(i);
			char b = str.charAt(j);
			
			char c;
			
			c = a;
			a = b;
			b = c;
			
			str.setCharAt(i, a);
			str.setCharAt(j, b);
			
			i=i+1;
			j=j-1;
		}
		return str;
	}

	private static String reverseWords(String words) {
		
		StringBuilder revs = reverse(new StringBuilder(words));
		System.out.println(revs);
		StringBuilder ans = new StringBuilder();
		String temp = new String(revs);
		String x;
		String b = "";
		int start=-1;
		
		for(int i=0;i<temp.length();i++) {
			if(start<0) {
				start = i;
			}
			if(revs.charAt(i) == ' ' || i == temp.length()-1) {
				if(i== temp.length()-1) {
					x = temp.substring(start, i+1);
				}else {
					x = temp.substring(start, i);
				}
				
				ans = ans.append(' ');
				ans = ans.append(reverse(new StringBuilder(x)));
				start = -1;
			}
			
		}
		return ans.substring(1);
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		//String ans = reverseWords("ankit is best");

		//System.out.println(ans);
		//play("sas");
		
		//printDuplicateChars(bf.readLine());
		
		String arg[] = bf.readLine().split("\\s");
		
		int arr[] = new int[arg.length];
		
		for(int i=0;i<arg.length;i++) {
			arr[i] = Integer.parseInt(arg[i]);
		}
		// 3 5 2 8 7 1 9 4
		// Sum = 12
		sumGivenArray(arr,12);
	}
	
	private static void play(String words) {
		words = "ankit is best";
		StringBuilder temp = new StringBuilder(words);
		StringBuilder b = new StringBuilder();
		for(int i=0;i<temp.length();i++) {
			if(temp.charAt(i) == ' ') {
				temp = temp.delete(i, i+1);
			}
		}
		
		System.out.println(temp);
	}

	private static void printDuplicateChars(String word) {
		
		int hash[] = new int[200];
		
		for(int i=0;i<word.length();i++) {
			if(hash[word.charAt(i)]==1) {
				System.out.print(word.charAt(i));
			}
			
			hash[word.charAt(i)] = hash[word.charAt(i)] + 1;
		}
	}

	private static void sumGivenArray(int arr[],int sum) {
		
		sum = 12;
		Set<Integer> hash = new HashSet<Integer>();
		// 9 7 10 4 5
		for(int i=0;i<arr.length;i++) {
			
			if(hash.contains(arr[i])) {
				int diff = sum - arr[i];
				System.out.println(arr[i] + " + " + diff );
			}
			hash.add(sum-arr[i]);
		}
	}
}
