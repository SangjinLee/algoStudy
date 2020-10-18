package no1486;

public class XORoperationInAnArray {
    public int xorOperation(int n, int start) {
    	int xor_value = start;
        for(int i=1; i<n; i++) {
        	xor_value = xor_value^(start+(2*i));
        }
        return xor_value;
    }
}
