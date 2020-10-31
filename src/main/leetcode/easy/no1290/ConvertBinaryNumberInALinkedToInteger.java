package leetcode.easy.no1290;

import java.util.ArrayList;
import java.util.List;

public class ConvertBinaryNumberInALinkedToInteger {
	public int getDecimalValue(ListNode head) {
		List<Boolean> list = new ArrayList<Boolean>();
        int result_val = 0;
        while(head != null) {
        	list.add(head.val == 1);
            head = head.next;
        }
        for(int i=0; i<list.size(); i++) {
        	if(list.get(i)) {
        		result_val = result_val + (int) (Math.pow(2, list.size()-(i+1)));
        	}
        }
        return result_val;
    }

	public class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
}
