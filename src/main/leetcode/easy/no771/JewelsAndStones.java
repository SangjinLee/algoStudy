package leetcode.easy.no771;

public class JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
    	int jewel_count = 0;
    	for(int i=0; i<J.length(); i++) {
    		System.out.println(J.charAt(i));
    		for(int j=0; j<S.length(); j++) {
    			if(J.charAt(i) == S.charAt(j)) {
    				jewel_count++;
    			}
    		}
    	}
    	return jewel_count;
    }
}
