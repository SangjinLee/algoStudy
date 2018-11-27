package lesson5;

public class PassingCars {

	public int solution(int[] A) {
		int count = 0, one_count = 0;

		for (int i : A) {
			if (i == 1)
				one_count++;
		}
		for (int i = 0; i < A.length; i++) {
			if (A[i] == 0) {
				count += one_count;
				if (count > 1000000000) {
					return -1;
				}
			} else {
				one_count--;
			}
		}
		return count;
	}
}