// Problem statement
// Given two string s and t, write a function to check if s contains all characters of t (in the same order as they are in string t).

// Return true or false.

// Do it recursively.

// E.g. : s = “abchjsgsuohhdhyrikkknddg” contains all characters of t=”coding” in the same order. So function will return true.

public class DoesSContainT {

	public static boolean doesSContainT(String s, String t) {
		if (t.length() == 0) {
			return true;
		}
		if (s.length() == 0) {
			return false;
		}

		if (s.charAt(0) == t.charAt(0)) {
			return doesSContainT(s.substring(1), t.substring(1));
		} else {
			return doesSContainT(s.substring(1), t);
		}
	}

	public static void main(String[] args) {
		System.out.println(doesSContainT("abchjsgsuohhdhyrikkknddg", "coding"));
		System.out.println(doesSContainT("abcde", "aeb"));
	}
}
