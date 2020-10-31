package leetcode.easy.no1295;

public class FindNumbersWithEvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        int result_count = 0;
        for(int i=0; i<nums.length; i++) {
            int num_length = (int)(Math.log10(nums[i])+1);
            if(num_length%2 == 0) {
                result_count++;
            }
        }
        return result_count;
    }
}
