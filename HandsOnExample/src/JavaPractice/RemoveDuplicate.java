package JavaPractice;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RemoveDuplicate {
	public String remove(String s) {
		int i = 1;
		char[] c = s.toCharArray();
		// char[] d = new char[10];
		Set<Character> d = new HashSet();
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		for (Character ch : c) {
			if (m.containsKey(ch)) {
				int w = m.get(ch);
				w++;
				m.put(ch, w);
			} else {
				m.put(ch, i);
			}
		}
		for (Character ch : c) {
			for (Entry e : m.entrySet()) {
				if ((Integer) e.getValue() == 1)
					d.add((Character) e.getKey());
			}
		}
		for(Character f:d) {
			System.out.print(f);
		}

		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "mohammed";
		RemoveDuplicate rd = new RemoveDuplicate();
		String sw = rd.remove(s);
		System.out.println(s);

	}

}
