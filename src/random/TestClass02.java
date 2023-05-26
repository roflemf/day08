package random;

import java.util.Scanner;

public class TestClass02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String n1, n2;
		System.out.println("11문자열 입력");
		n1 = input.nextLine();  //next(); 공백을 구분자로 인식 (공백전까지만 문자로 인식)

		System.out.println("22문자열 입력");
		n2 = input.nextLine();  
		
		System.out.println( n1 );
		System.out.println( n2 );
	
	}
}
