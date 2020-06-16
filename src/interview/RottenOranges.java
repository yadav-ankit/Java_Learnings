package interview;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {

	private static boolean isSafe(int m, int n, int i, int j, int arr[][]) {
		return (i >= 0 && j >= 0 && i < m && j < n && arr[i][j] != 0);
	}

	public static int bfs(int arr[][]) {

		Queue<Q> qu = new LinkedList<Q>();
		int m = arr.length;
		int count = 0;
		if (m == 0) {
			return 0;
		}

		int n = arr[0].length;
		boolean startingFound = false;
		boolean visited[][] = new boolean[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i][j] == 2 && visited[i][j] == false) {
					Q q = new Q(i, j);
					startingFound = true;
					visited[i][j] = true;
					qu.add(q);
					break;
				}
				if (startingFound == true) {
					break;
				}
			}
		}

		boolean countIncrment = true;
		while (!qu.isEmpty()) {
			int size = qu.size();
			countIncrment = false;
			while (size > 0) {
				int i, j;
				Q temp = qu.poll();

				i = temp.i;
				j = temp.j;
				/*
				 * { { 2, 1, 1 }, { 1, 1, 0 }, { 0, 1, 1 }
				 * 
				 * };
				 */

				// i+1,j
				if (isSafe(m, n, i + 1, j, arr) && (arr[i + 1][j] == 1 || arr[i + 1][j] == 2)
						&& visited[i + 1][j] == false) {
					visited[i + 1][j] = true;
					if (arr[i + 1][j] == 1) {
						countIncrment = true;
					}
					Q q = new Q(i + 1, j);
					qu.add(q);
					arr[i + 1][j] = 2;
				}

				// i-1,j
				if (isSafe(m, n, i - 1, j, arr) && (arr[i - 1][j] == 1 || arr[i - 1][j] == 2)
						&& visited[i - 1][j] == false) {
					visited[i - 1][j] = true;
					if (arr[i - 1][j] == 1) {
						countIncrment = true;
					}
					Q q = new Q(i - 1, j);
					qu.add(q);
					arr[i - 1][j] = 2;
				}

				// i,j+1
				if (isSafe(m, n, i, j + 1, arr) && (arr[i][j + 1] == 1 || arr[i][j + 1] == 2)
						&& visited[i][j + 1] == false) {
					visited[i][j + 1] = true;
					if (arr[i][j + 1] == 1) {
						countIncrment = true;
					}
					Q q = new Q(i, j + 1);
					qu.add(q);
					arr[i][j + 1] = 2;
				}

				// i,j-1
				if (isSafe(m, n, i, j - 1, arr) && (arr[i][j - 1] == 1 || arr[i][j - 1] == 2)
						&& visited[i][j - 1] == false) {
					visited[i][j - 1] = true;
					
					if (arr[i][j - 1] == 1) {
						countIncrment = true;
					}
					Q q = new Q(i, j - 1);
					qu.add(q);
					arr[i][j - 1] = 2;
				}
				size--;
			}
			if(countIncrment == true) {
				count = count + 1;
			}
			
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i][j] == 1) {
					return -1;
				}
			}
		}
		if (count > 0 && countIncrment == true) {
			return count - 1;
		} else {
			return count;
		}

	}

	public static void main(String... args) throws Exception {

		int arr[][] = { { 2, 1, 1 }, { 1, 1, 0 }, { 0, 1, 1 }};

		System.out.println(bfs(arr));
	}
}

class Q {

	int i;
	int j;

	public Q(int a, int b) {
		this.i = a;
		this.j = b;
	}
}
