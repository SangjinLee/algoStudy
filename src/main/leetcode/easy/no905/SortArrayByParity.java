package leetcode.easy.no905;

import java.util.ArrayList;

public class SortArrayByParity {
	public int[] sortArrayByParity(int[] A) {
        int[] return_arr = new int[A.length];
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int num : A) {
        	if(num%2 == 0){
        		al.add(0, num);
        	} else {
        		al.add(num);
        	}
        }
        for(int i=0; i<al.size(); i++) {
        	return_arr[i] = al.get(i);
        }
        return return_arr;
    }
}
