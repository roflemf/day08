package random;

import java.util.Random;

public class TestClass01 {
	public static void main(String[] args) {
		
		for (int i = 0; i < 5 ; i ++) {
			double ran = Math.random();
			
			System.out.println(ran*3 + ", " + (int)(ran*3));
			System.out.println("=========");
			
			for (int j=0; j<5; j++) {
				int n = (int)(Math.random()*10 + 10);
				System.out.println(n);
			}
			
		}
		System.out.println("==============");
		for (int i =0; i <5 ; i++) {
			System.out.println((int)(Math.random()*4 + 10) );
		}
		
		System.out.println("==================");
		Random rand = new Random();
		for(int i =0; i<5; i++) {
									// 0~4
			System.out.println( rand.nextInt(5));
		}
		
		
	}

}
