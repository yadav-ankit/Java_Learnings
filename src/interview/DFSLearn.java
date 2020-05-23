package interview;

import java.io.*;
import java.util.*;

public class DFSLearn {

	private static void dfsUtil(List<Integer> adj[],boolean visited[],Integer ele) {
			System.out.print(ele + " ");
			visited[ele] = true;
		
			Iterator<Integer> it = adj[ele].listIterator();
			
			while(it.hasNext()) {
				Integer x = it.next();
				
				if(!visited[x]) {
					dfsUtil(adj, visited, x);
				}
			}
		
	}
	
	private static void dfs() throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bf.readLine());

		List<Integer> adj[] = new LinkedList[n];

		for (int i = 0; i < n; i++) {
			adj[i] = new LinkedList();
		}

		int t = Integer.parseInt(bf.readLine());

		while (t > 0) {

			String args[] = bf.readLine().split("\\s");
			Integer a = Integer.parseInt(args[0]);
			Integer b = Integer.parseInt(args[1]);
		
			adj[a].add(b);
			t = t-1;
		}

		System.out.println("Enter start node !!!!!");
		int start = Integer.parseInt(bf.readLine());

		boolean visited[] = new boolean[n];
		
		dfsUtil(adj,visited,start);	

	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		dfs();

	}

}
