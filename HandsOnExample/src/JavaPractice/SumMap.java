package JavaPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SumMap {

	public boolean sumUp(int[] a, int sum) {
		Map<Integer, String> m = new HashMap();
		for (Integer i : a) {
			m.put(i, "x");
		}
		for (Entry<Integer, String> e : m.entrySet()) {
			int temp = sum - e.getKey();
			 if(m.containsKey(temp))
				 return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 4, 3, 2, 5, 0 };
		SumMap s = new SumMap();
		boolean b = s.sumUp(arr, 1);
		System.out.println(b);

	}

}
