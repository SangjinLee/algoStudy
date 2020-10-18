package leetcode.easy.no1470;

public class ShuffleTheArray {
	public int[] shuffle(int[] nums, int n) {
	    int result_nums[] = new int[nums.length];
	    for(int i=0; i<n; i++) {
	    	result_nums[i*2] = nums[i];
	    	result_nums[(i*2)+1] = nums[n+i];
	    }
	    return result_nums;   
	}
}
