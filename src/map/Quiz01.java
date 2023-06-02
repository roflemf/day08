package map;

import java.awt.RenderingHints.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Quiz01 {
	public static void main(String[] args) {
		/*
		 1.메뉴등록 : 존재하는 메뉴면 존재하는 메뉴입니다.
		 2. 메뉴별 가격 보기 
		 	: 수정, 삭제 추가
		 	1. 메뉴 등록
		 	2. 메뉴별 가격보기
		 	3. 종료
		 	>>> 2
		 		1. 김밥 : 1500
		 		2. 라면 : 1000
		 		1.수정 2.삭제 3.나가기
		 		수정 : 없는 메뉴면 없다. 있으면 가격 수정 가능
		 		삭제 : 없는 메뉴면 없다. 있으면 삭제 가능
		 		>>>
		 3. 종료 
		 >>>
		 */
		Scanner sc = new Scanner(System.in); 
		HashMap<String, String> hmap = new HashMap<>();
		String menu = "", price = null;
		//
		boolean willContinue = true;

	
		while(willContinue) {
			System.out.println("1. 메뉴등록");
			System.out.println("2. 메뉴별 가격 보기");
			System.out.println("3. 종료");
			System.out.print(">>> : ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1: System.out.println("1. 메뉴등록"); 
					System.out.println("메뉴 이름 : ");
					menu = sc.next();
					
					if(hmap.containsKey(menu)) {
						System.out.println("이미 존재하는 메뉴입니다");
					}else {
						System.out.println("없는메뉴. 메뉴를 등록합니다.");
					
						System.out.println("메뉴 가격 : ");
						price = sc.next();
						hmap.put(menu, price);
					}
					
					
					System.out.println(hmap);
					
					break;
			case 2: System.out.println("2. 메뉴별 가격 보기"); 
					//System.out.println(hmap);
					Set<String> key = hmap.keySet();
					Iterator<String> it = key.iterator(); 
						while(it.hasNext()) {
							String temp = it.next();
							System.out.println(temp +": "+ hmap.get(temp)+"원");
						}
					System.out.println("1. 수정 2. 삭제 3. 나가기");
					System.out.println(">>> ");
					int menu2 = sc.nextInt();
			
					switch(menu2) {
					case 1: 
							//등록된 메뉴가 아무것도없으면 "메뉴가 없습니다"
							//메인메뉴로 돌아가기(break)
						
							if(menu.equals("")) {
								System.out.println("메뉴가 없습니다");
								break;
							}else {
							System.out.print("수정할 메뉴 선택 : ");
							//System.out.println(hmap);
							//hmap.replace("키", "원래값", "수정할값");
							String str = sc.next();
							//입력받은 수정할메뉴가 존재하지않는 메뉴면 예외처리
							
							System.out.print("바꿀 금액 임력: ");
							String str2 = sc.next();
							
							hmap.replace(str, hmap.get(str), str2);
							System.out.println(hmap);}
							break;
							
					case 2: System.out.println("삭제할 메뉴 입력 : ");
							//삭제할 메뉴가 없으면 예외처리
							if(menu.equals("")) {
								System.out.println("메뉴가 없습니다");
							}else {
							String str3 = sc.next();
							hmap.remove(str3);
							System.out.println(hmap);}
							break;
					case 3:
							break;
					}
	
					break;
			case 3: System.out.println("3. 종료");
					willContinue = false;
					//혹은 return;
			
			}

			
			
		}
		
		
	}

	
	

}
