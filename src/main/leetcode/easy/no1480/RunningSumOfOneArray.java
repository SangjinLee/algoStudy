package leetcode.easy.no1480;

public class RunningSumOfOneArray {
	public int[] runningSum(int[] nums) {
	    int result_nums[] = new int[nums.length];
	    for(int i=0; i<nums.length; i++) {
	    	for(int j=0; j<=i; j++) {
	    		result_nums[i] = result_nums[i] + nums[j];
	    	}
	    }
		return result_nums;
	}
}
