package starting;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum_BackTracking {
//https://leetcode.com/problems/combination-sum/submissions/
	List<List<Integer>> ans = new ArrayList();

	private List<List<Integer>> fun(int arr[], int start, int target, List<Integer> temp, int sum) {
		if (sum == target) {
			ans.add(new ArrayList(temp));
			return ans;
		}

		for (int i = start; i < arr.length; i++) {
			if (sum + arr[i] <= target) {
				temp.add(arr[i]);
				fun(arr, i, target, temp, sum + arr[i]);
				temp.remove(temp.size() - 1);
			}
		}
		return ans;
	}

	public List<List<Integer>> combinationSum(int[] arr, int target) {

		List<Integer> temp = new ArrayList();
		return fun(arr, 0, target, temp, 0);
	}

	public static void main(String[] args) {
		CombinationSum_BackTracking t = new CombinationSum_BackTracking();

		t.ans = t.combinationSum(new int[] { 2, 3, 5 }, 8);

		System.out.println(t.ans.size());

		for (List<Integer> list : t.ans) {
			for (Integer ele : list) {
				System.out.print(ele + " ");
			}
			System.out.print("\n");
		}

	}

}
