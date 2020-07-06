package interview;

import java.util.Arrays;
import java.util.List;

public class DictionaryContains {

	public boolean wordBreak(String s, List<String> list) {

		if(s.length() == 0 || list.size() == 0) {
			return false;
		}
		int n = s.length();
		boolean dp[] = new boolean[n + 1];
		
		for(int i=1;i<=n;i++) {
			
			// search for prefix 0 to i-1
			if(dp[i] == false && list.contains(s.substring(0, i))) {
				dp[i] = true;
			}
			// traverse for i to j-1 or str.substr(i,j);
			if(dp[i] == true) {
				if(i==n) {
					return true;
				}
				for(int j=i+1;j<=n;j++) {
					if(dp[j] == false && list.contains(s.substring(i, j))){
						dp[j] = true;
					}
					if(j==n && dp[j] == true) {
						return true;
					}
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {

		DictionaryContains dc = new DictionaryContains();

		System.out.println(dc.wordBreak("catsandog", Arrays.asList("cats","and","dog","sand","cat")));
		
	//	System.out.println(Arrays.asList("apple","pen").contains("pn"));
	}

}
