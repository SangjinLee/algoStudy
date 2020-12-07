package leetcode.easy.no1370;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class IncreasingDecreasingString {
	public String sortString(String s) {
		String result_str = "";
		char[] resultChar = new char[s.length()];
		char[] arrChar = s.toCharArray();
		Arrays.sort(arrChar);
		ArrayList<Character> list = new ArrayList<Character>();
		for (char ch : arrChar) {
			list.add(ch);
		}
		int current_num = 0;
		while (list.size() > 0) {
			Collections.reverse(list);
			boolean isFirst = true;
			for (int i = list.size() - 1; i >= 0; i--) {
				if (isFirst || list.get(i) != resultChar[current_num - 1]) {
					resultChar[current_num] = list.get(i);
					list.remove(i);
					current_num++;
					isFirst = false;
				}
			}
		}
		for (char ch : resultChar) {
			result_str += ch;
		}
		return result_str;
	}
}
