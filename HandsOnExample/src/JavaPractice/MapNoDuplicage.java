package JavaPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapNoDuplicage {
	String g="";
	public String duplicate(String s) {
		if(s.equals(null))
			return "";
		int i=1;
		Set<Character> set = new HashSet();
		char[] charArray =s.toCharArray();
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(Character c:charArray) {
			if(map.containsKey(c)) {
				int temp=map.get(c);
				temp++;
				map.put(c, temp); 
			}
			else {
				map.put(c, i);
			}
		}
		for(Entry e:map.entrySet()) {
		set.add((Character)e.getKey());
		}
		for(Character cd:set) {
			g= g+cd;
			//System.out.println(cd);
		}
		return g;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ayman";
		
		MapNoDuplicage m =new MapNoDuplicage();
		s= m.duplicate(s);
		System.out.println(s);

	}

}
