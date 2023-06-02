package map;

import java.util.HashMap;

public class TestClass01_01 {
	public static void main(String[] args) {
		HashMap<String, String> hmap = new HashMap<>();
		
		hmap.put("아메리카노", "2000");
		hmap.put("라떼", "3000");
		
		String str = hmap.get("아메리카노");
		System.out.println(str);
		
	
		System.out.println(hmap.containsValue(str));
		System.out.println(hmap.containsKey("아메리카노"));
		
		hmap.remove("라떼");
		System.out.println(hmap);
	}

}
