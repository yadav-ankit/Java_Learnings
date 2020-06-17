package interview.Real;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MinHeightTrees {

	// https://www.geeksforgeeks.org/roots-tree-gives-minimum-height/
	private static List<Integer> solve(int[][] arr, int n) {

		List<Integer> ans = new ArrayList<Integer>();
		int rows = arr.length;
		List adj[] = new LinkedList[n];
		int degree[] = new int[n];

		for (int i = 0; i < n; i++) {
			adj[i] = new LinkedList();
		}

		for (int i = 0; i < rows; i++) {
			int src = arr[i][0];
			int trg = arr[i][1];
			
			adj[src].add(trg);
			adj[trg].add(src);
			
			degree[src]++;
			degree[trg]++;
		}
		
		int V = n;
		
		LinkedList<Integer> q = new LinkedList<>();
		
		for(int i=0;i<n;i++) {
			if(degree[i] == 1) {
				q.add(i);
			}
		}
		
		while(V>2) {
			
			int size = q.size();
			while(size>0) {
				int x = q.poll();
				V--;
				
				Iterator<Integer> it =  adj[x].listIterator();
	            
	            while(it.hasNext()){
	                int ele = it.next();
	                degree[ele]--;
	                
	                if(degree[ele] == 1) {
	                	q.add(ele);
	                }
	            }
				size--;
			}
		}
		
		while(!q.isEmpty()) {
			int x = q.poll();
			ans.add(x);
		}

		return ans;
	}

	public static void main(String[] args) {

		int arr[][] = {{1,0},{1,2},{1,3} };
		int n = 4;
		List<Integer> list = solve(arr, n);
		
		list.stream().forEach(System.out::print);

	}

}
