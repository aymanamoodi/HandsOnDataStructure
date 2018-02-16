package JavaPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StringUnique {
	static boolean uniqueCharacter(String s) {
		if (s.length() > 128)
			return false;
		else {
			boolean[] arr = new boolean[128];
			for (int i = 0; i < s.length(); i++) {
				int val = s.charAt(i);
				if (arr[val] == true)
					return false;
				else
					arr[val] = true;
			}
		}
		return true;
	}

	static boolean permutation(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;
		char[] array1 = s1.toCharArray();
		char[] array2 = s2.toCharArray();
		Arrays.sort(array1);
		Arrays.sort(array2);

		String s3 = new String(array1);
		String s4 = new String(array2);
		if (s3.equals(s4))
			return true;
		return false;
	}

	static String ascii(String s) {
		int spaceIndex = 0;
		if (s.length() == 0)
			return "String is empty";
		else {
			char[] a = s.toCharArray();
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == ' ')
					spaceIndex++;
			}
			spaceIndex = spaceIndex * 2;
			for (int i = s.length() - 1 + spaceIndex; i >= 0; i--) {

			}

		}
		return s;

	}

	static void palindrome(String s) {

		int numberOfCharacter = 0;
		Map<Character, Integer> map = new HashMap();
		char[] a = s.toCharArray();
		for (Character w : a) {
			if (w != ' ') {
				if (map.containsKey(w)) {
					int i = map.get(w);
					i++;
					map.put(w, i);
				} else
					map.put(w, 1);
			} else {
				map.put(' ', 0);
			}
		}
		for (Entry e : map.entrySet()) {
			System.out.println("the key is " + e.getKey() + " " + e.getValue());
			if ((int) e.getValue() % 2 == 1) {
				numberOfCharacter++;
			}
		}
		if (numberOfCharacter > 1) {
			System.out.println("It is not a palindrome");
		} else
			System.out.println("it is a palindrome");
	}

	static boolean sameLength(String s, String t) {
		int difference = 0;
		char[] a = s.toCharArray();
		char[] b = t.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if (a[i] != b[i])
				difference++;
		}
		if (difference > 1)
			return false;
		return true;
	}

	static boolean differenceLength(String s, String t) {
		int index1 = 0;
		int index2 = 0;
		int difference = 0;
		char a[] = s.toCharArray();
		char b[] = t.toCharArray();
		while (index1 <= s.length() && index2 < t.length()) {
			if (a[index1] != b[index2]) {
				difference++;
				index1++;
			} else {
				index1++;
				index2++;
			}
		}
		if (difference > 1)
			return false;
		return true;
	}

	static void characterDifference(String s, String t) {
		if (s.length() == t.length()) {
			System.out.println(sameLength(s, t));
		}
		if (s.length() > t.length()) {
			System.out.println(differenceLength(s, t));
		}
		if (s.length() < t.length()) {
			System.out.println(differenceLength(t, s));
		}
	}

	static String compressString(String s) {
		String s1 = "";
		System.out.println(s);
		Map<Character, Integer> map = new HashMap();
		char a[] = s.toCharArray();
		for (char w : a) {
			System.out.println("the character is " + w);
			if (map.containsKey(w)) {
				System.out.println(map.get(w));
				int value = map.get(w);
				value++;
				map.put(w, value);
			} else
				map.put(w, 1);
		}
		for (Entry e : map.entrySet()) {
			System.out.println("inside");
			s1 = s1 + e.getKey() + e.getValue();
		}
		System.out.println(s1);
		return s1;
	}

	static void transpose(int[][] matrix) {

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (matrix[i][j] == 0) {
					for (int x = i; x < 8 - i; x++) {
						matrix[x][j] = 0;
					}
					for (int y = j; y < 8 - j; y++) {
						matrix[i][y] = 0;
					}
				}

			}
		}

	}

	static void matrixDisplay(int[][] matrix) {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.print(matrix[i][j]+" ");
			}
		}
	}
	
	static void reversal(String s,String t) {
		if(s.length()==0||t.length()==0) {
			System.out.println("String is empty");
		}
		else {
			s=s+s;
			System.out.println(s.contains(t));
		
		}
	}

	public static void main(String[] args) {
		String s = "ayman";
		// System.out.println(uniqueCharacter(s));
		// palindrome("tactcoapapa ");
		// characterDifference("ple","paale");
		//System.out.println(compressString("ab"));
		int matrix[][] = { { 1, 0, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
//transpose(matrix);
//matrixDisplay(matrix);
reversal("ayman","aym");
	}

}
