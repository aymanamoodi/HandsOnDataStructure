package JavaPractice;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap();
		map.put(100, "Ayman");
		map.put(101, "aaquib");
		map.put(103, "wasay");
		for(Map.Entry m :map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
