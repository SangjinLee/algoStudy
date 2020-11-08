package leetcode.easy.no1309;

public class DecryptStringFromAlphabet {
	public String freqAlphabets(String s) {
		String return_str = "";
		char add_char;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) != '#') {
				add_char = (char) (s.charAt(i) + 48);
			} else {
				add_char = (char) (Integer.parseInt(s.substring(i - 2, i)) + 96);
				i -= 2;
			}
			return_str = add_char + return_str;
		}
		return return_str;
	}
}
