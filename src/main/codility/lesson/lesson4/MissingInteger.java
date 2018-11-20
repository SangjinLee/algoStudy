package codility.lesson.lesson4;

import java.util.Arrays;

public class MissingInteger {

	public int solution(int A[]) {
		int last_num = 1;
		Arrays.sort(A);

		for (int i : A) {
			if (i > 0 && i != (last_num - 1)) {
				if (i == last_num)
					last_num++;
				else
					break;
			}
		}
		return last_num;
	}
}
