package week2_3;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);

		int pw1 = (int)(Math.random()*9000)+1000;
		int pw2 = (int)(Math.random()*9000)+1000;
		
		System.out.print("���̵� �Է� �ϼ��� >>> ");
		String name1 = sc.next();
		System.out.println("ù��° ��ü ���� �Ϸ�");
		
		System.out.print("���̵� �Է� �ϼ��� >>> "); 
		String name2 = sc.next();
		
		System.out.println("�ι�° ��ü ���� �Ϸ�\n");	
		
		Info in1 = new Info(name1,pw1);
		Info in2 = new Info(name2,pw2);
		
		
		System.out.println("ù��° ��ü�� ���̵�� ��й�ȣ ���");
		in1.display();
		
		System.out.println("ù��° ��ü�� ���̵�� ��й�ȣ ���");
		in2.display();
		
		sc.close();		
	}

}