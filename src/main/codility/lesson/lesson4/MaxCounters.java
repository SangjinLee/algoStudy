package codility.lesson.lesson4;

public class MaxCounters {

	public int[] solution(int N, int A[]) {
		int[] rdata = new int[N];
		int last_max_num = 0, current_max_num = 0;

		for (int i = 0; i < A.length; i++) {
			if (1 <= A[i] && A[i] <= N) {
				if (rdata[A[i] - 1] < last_max_num) {
					rdata[A[i] - 1] = last_max_num;
				}
				current_max_num = Math.max(++rdata[A[i] - 1], current_max_num);
			} else if (A[i] == N + 1) {
				last_max_num = current_max_num;
			}
		}

		for (int i = 0; i < rdata.length; i++) {
			if (last_max_num > rdata[i]) {
				rdata[i] = last_max_num;
			}
		}
		return rdata;
	}
}
