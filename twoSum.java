package algoExpert;
import java.util.*;

public class twoSum {
	public static void main(String[] args) {
		
		int[] input = new int[] {1,4,6,7};
		int target = 5;
		System.out.println(Arrays.toString(twoNumberSum(input, target)));
		
	}

	public static int[] twoNumberSum(int[] array, int targetSum) {
	    // Write your code here.
	    Set<Integer> visitedSet = new HashSet<Integer>();
	    for (int num: array) {
	      if (visitedSet.contains(targetSum-num)) {
	        return new int[]{targetSum-num, num};
	      } else {
	        visitedSet.add(num);
	      }
	    }
	    return new int[0];
	  }
}
