package codility.lesson.lesson4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PermCheck {

	public int solution(int[] A) {
		Arrays.sort(A);
		return (!isDuplication(A) && A[A.length - 1] == A.length) ? 1 : 0;
	}

	public boolean isDuplication(int[] A) {
		Set<Integer> tSet = new HashSet<Integer>();
		for (int a : A) {
			if (!tSet.add(a)) {
				return true;
			}
		}
		return false;
	}
}
