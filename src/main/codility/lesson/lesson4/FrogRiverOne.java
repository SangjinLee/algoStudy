package codility.lesson.lesson4;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {

	public int solution(int X, int A[]) {

		Set<Integer> tSet = new HashSet<Integer>();
		for (int i = 0; i < A.length; i++) {
			if (A[i] <= X) {
				tSet.add(A[i]);
				if (tSet.size() == X)
					return i;
			}
		}

		return -1;
	}
}
