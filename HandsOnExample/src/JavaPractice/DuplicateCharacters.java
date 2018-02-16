package JavaPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateCharacters {
	void duplicate(String s) {
		System.out.println("Method started");
		int i=1;
		Map<Character,Integer> map = new HashMap();
		char[] ch= s.toCharArray();
		for(Character c:ch) {
			if(map.containsKey(c)) {
				System.out.println("character is "+c);
				//int var= (Integer)map.get(c)+1;
				System.out.println(map.get(c)+1);
				map.put(c, 2);
			}
			else 
			map.put(c, i);
		}
		for(Entry ed:map.entrySet()){
			System.out.println(ed.getKey()+""+ed.getValue());
		}
		for(Entry e:map.entrySet()) {
			if((Integer)e.getValue()>1) {
				System.out.println("The duplicate character is "+e.getKey());
			}
		}
	}

	public static void main(String[] args) {
		String s="india";
		DuplicateCharacters dc = new DuplicateCharacters();
		dc.duplicate(s);
	}

}
