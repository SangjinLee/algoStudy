package codility.lesson.lesson3;

import java.util.Arrays;

public class PermMissingElem {

	public int solution(int A[]) {
		int[] a = A;
		Arrays.sort(a);

		for(int i=1; i<=a.length; i++) {
			if(a[i-1] != i)
				return i;
		}
		return a.length+1;	
	}
}
