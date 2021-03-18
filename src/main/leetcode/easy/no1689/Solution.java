package leetcode.easy.no1689;

class Solution {
    public int minPartitions(String n) {
        String[] strArray = n.split("");
        int max_num = 0;
        for(String s : strArray) {
            int s_num = Integer.parseInt(s);
	        if(max_num < s_num) {
                max_num = s_num;
            }
        }
        return max_num;
    }
}
