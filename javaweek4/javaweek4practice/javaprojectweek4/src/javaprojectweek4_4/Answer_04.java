package javaprojectweek4_4;

import java.util.Scanner;

public class Answer_04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean flag = true;
		Person person=null;
		while (flag) {
			System.out.print("1: Salaried ��ü ����, 2: Hour ��ü ���� 3. ���� --> ");
			int menu = in.nextInt();

			switch (menu) {
			case 1:
				System.out.println("�̸�, ���, �޿��� �Է��ϼ���");
				person = new SalariedEmployee(in.next(), in.next(), in.nextInt());
				break;
			case 2:
				System.out.println("�̸�, ���, �ð����ӱ�, �ð��� �Է��ϼ���");
				person= new HourEmployee(in.next(), in.next(), in.nextInt(), in.nextInt());
				break;
			case 3:
				flag = false;
				break;
			default:
				System.out.println("�߸��� �Է��Դϴ�");
			}
			System.out.println(person);
		}
		in.close();
		System.out.println("���α׷��� �����մϴ�");
	}
}