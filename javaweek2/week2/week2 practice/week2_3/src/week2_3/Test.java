package week2_3;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);

		int pw1 = (int)(Math.random()*9000)+1000;
		int pw2 = (int)(Math.random()*9000)+1000;
		
		System.out.print("아이디를 입력 하세요 >>> ");
		String name1 = sc.next();
		System.out.println("첫번째 객체 생성 완료");
		
		System.out.print("아이디를 입력 하세요 >>> "); 
		String name2 = sc.next();
		
		System.out.println("두번째 객체 생성 완료\n");	
		
		Info in1 = new Info(name1,pw1);
		Info in2 = new Info(name2,pw2);
		
		
		System.out.println("첫번째 객체의 아이디와 비밀번호 출력");
		in1.display();
		
		System.out.println("첫번째 객체의 아이디와 비밀번호 출력");
		in2.display();
		
		sc.close();		
	}

}
