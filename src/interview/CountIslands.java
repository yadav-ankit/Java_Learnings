package interview;

public class CountIslands {

	private static int rowTravel[] = {-1,1,0,0};
	private static int colTravel[] = {0,0,-1,1};
	
	private static boolean isSafe(int m, int n, int i, int j) {
		return (i >= 0 && j >= 0 && i < m && j < n);
	}

	private static boolean[][] bfs(char arr[][],boolean visited[][],int i,int j) {
	
		visited[i][j] = true;
		int m = arr.length;
		int n = arr[0].length;
		
		
		for(int k=0;k<4;k++) {
			if(isSafe(m,n,i+rowTravel[k],j+colTravel[k]) && arr[i+rowTravel[k]][j+colTravel[k]] == '1' && 
					!visited[i+rowTravel[k]][j+colTravel[k]]) {
				bfs(arr,visited,i+rowTravel[k],j+colTravel[k]);
			}
		}
		
		return visited;
	}

	public static int numIslands(char[][] arr) {

		int m = arr.length;
		
		if(m==0) {
			return 0;
		}
		
		int n = arr[0].length;
		int count = 0;
		boolean visited[][] = new boolean[m][n];
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				
				if(arr[i][j] == '1' && visited[i][j] == false) {
					bfs(arr,visited,i,j);
					count = count +1;
				}
			}
		}
		
		return count;
	}

	public static void main(String... args) {

		// String s =
		// "1000.50|abc|?|12334|VISA|MYR|2020-06-09T11:51:12+08:00|7137|CC|CCPS_001|IPC|9999999999";

		// String attributeArray[] = s.split("\\|");
		
		
		char arr[][] = {
				{'1','1','0','0','0'},
				{'1','1','0','0','0'},
				{'0','0','1','0','0'},
				{'0','0','0','1','1'}
		};
		
		System.out.println(numIslands(arr));

	}
}
