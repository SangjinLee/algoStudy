package codility.lesson.lesson3;

import java.util.Arrays;

public class TapeEquilibrium {

	public int solution(int[] A) {
		int sumA = Arrays.stream(A).sum();
		int diff = 0;
		int min_diff = 0;

		for (int i = 0; i < A.length - 1; i++) {
			sumA -= A[i] * 2;
			diff = Math.abs(sumA);
			min_diff = (i == 0) ? diff : Math.min(Math.abs(sumA), min_diff);
		}

		return min_diff;
	}
}
