package javaweek3practice_2;

import java.util.Scanner;

public class DogTest {
	public static void main(String[] args) {
		String dcolor;
		boolean i = true;
		Scanner sc = new Scanner(System.in);
		Dog[] md =new Dog[5];
		
		md[0] = new Dog(5, "Red");
		md[1] = new Dog(6, 8,"Orange");
		md[2] = new Dog(7, "Yellow");
		md[3] = new Dog(8, 6,"Green");
		md[4] = new Dog(9, "Blue");
		
		
	
		System.out.print("Red, Orange, Yellow, Green, Blue 중에 색깔을 입력하세요 : ");
		dcolor = sc.nextLine();
				
		while(i==true) {
			switch (dcolor) {
			
	    	case "Red": System.out.println(md[0].barking());
	    				System.out.println(md[0].hungry());
	    				System.out.println(md[0].sleeping());
	    				System.out.println(md[0].getFood());
	    				System.out.println(md[0]);
	    				i = false;
	    				break;
	    				
	    	case "Orange": System.out.println(md[1].barking());
	    				System.out.println(md[1].hungry());
	    				System.out.println(md[1].sleeping());
	    				System.out.println(md[1].getFood());
	    				System.out.println(md[1]);
	    				i = false;	    				
	    				break;
	    				
	    	case "Yellow": System.out.println(md[2].barking());
	    				System.out.println(md[2].hungry());
	    				System.out.println(md[2].sleeping());
	    				System.out.println(md[2].getFood());
	    				System.out.println(md[2]);
	    				i = false;
	    				break;
	    				
	    	case "Green": System.out.println(md[3].barking());
	    				System.out.println(md[3].hungry());
	    				System.out.println(md[3].sleeping());
						System.out.println(md[3].getFood());
						System.out.println(md[3]);
	    				i = false;
	    				break;
	    				
	    	case "Blue": System.out.println(md[4].barking());
	    				System.out.println(md[4].hungry());
	    				System.out.println(md[4].sleeping());
						System.out.println(md[4].getFood());
						System.out.println(md[4]);
	    				i = false;
	    				break;
	    				
	    	default : System.out.print("잘못 입력하셨습니다. 다시 입력하세요 : ");
	    				dcolor = sc.nextLine();
	    				i = true;
	    				break;
			}
			
		}
		
		sc.close();
	}

}
