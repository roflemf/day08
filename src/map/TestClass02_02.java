package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class TestClass02_02 {
	public static void main(String[] args) {
		HashMap<String, String> hmap  = new HashMap<>();
		
		
		hmap.put("아메리카노", "2000");
		hmap.put("라떼", "3000");
		hmap.put("고구마라떼", "4000");
		
		
		System.out.println(hmap.keySet());
		System.out.println(hmap.values());
		
		
		Set<String> key = hmap.keySet();
		Iterator<String> it = key.iterator();
		
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str + "의 가격은 " + hmap.get(str));
		}
	}

}
