package map;

import java.util.HashMap;
import java.util.Scanner;

public class TestClass03_03 {
	
	public static void main(String[] args) {
		HashMap<String, String> hmap =  new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("전화번호 : ");
		String num = sc.next();
		
		
		hmap.put(name, num);
		
		System.out.println(hmap);
		
		System.out.println("전화번호를 찾을 이름 : ");
		String name2 = sc.next();
		
		if(hmap.containsKey(name2)) {
			System.out.println(hmap.get(name2));
		}else {
			System.out.println("없는 이름입니다");
		}
		
		
	}

}
