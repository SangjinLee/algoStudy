package leetcode.easy.no1304;

public class FindnUniqueIntegersSum {
    public int[] sumZero(int n) {
        int result[] = new int[n];
        if(n > 0) {
            for(int i=0; i<n; i+=2) {
                if((i+1) >= n) {
                    result[n-1] = 0;
                } else {
                    result[i] = (i+1);
                    result[i+1] = -(i+1);
                }
            }
        }
        return result;
    }
}
