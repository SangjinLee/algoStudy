package codility.lesson.lesson1;

public class BinaryGap {

	public int solution(final int num) {
		int result_value = 0;
		int current_num = num;
		int gap_cnt = 0;
		boolean gap_flag = false;

		while (current_num > 0) {
			if (current_num % 2 == 1) {
				if (gap_cnt == 0) {
					gap_flag = true;
				} else {
					if (result_value < gap_cnt) {
						result_value = gap_cnt;
					}
					gap_cnt = 0;
				}
			} else {
				if (gap_flag) {
					gap_cnt++;
				}
			}
			current_num = current_num / 2;
		}
		return result_value;
	}
}
