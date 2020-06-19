package interview;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithNonRepCharacter {

	private static void longestSubstringWithNonRepCharacter(String s) {
		Set<Character> set = new HashSet();
		int count = 0, max = -99;
		int ans = -99;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (set.contains(c)) {
				set = new HashSet<>();
				count = 0;
			} else {

				set.add(s.charAt(i));
				count++;

				if (ans > count) {
					ans = count;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		longestSubstringWithNonRepCharacter("abcabcdeddfffff");
		/*
		Input: "abcabcbb"
		Output: 3 
		Explanation: The answer is "abc", with the length of 3.

		Input: "pwwkew"
		Output: 3

		pw
		wke
		kew



		Input: "bbbbbb"
		Output: 1

		ab 


		*/ 
		
		

	}

}
