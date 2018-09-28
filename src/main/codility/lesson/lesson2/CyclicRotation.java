package codility.lesson.lesson2;

public class CyclicRotation {

	public int[] solution(final int[] A, final int K) {
		int A_length = A.length;

		if (A_length < 2) {
			return A;
		}
		else {
			int[] rv = new int[A_length];
			int K_value = K % A_length;
			int cnt = 0;

			for (int a : A) {
				rv[(cnt + K_value < A_length) ? (cnt + K_value) : (cnt + K_value - A_length)] = a;
				cnt++;
			}
			return rv;
		}
	}
}
