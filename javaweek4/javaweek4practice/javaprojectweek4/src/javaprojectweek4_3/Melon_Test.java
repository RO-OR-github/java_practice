package javaprojectweek4_3;

public class Melon_Test {
	public static void main(String[] args) {
		Melon m1 = new Melon(500, 2500, 21, "HALLYM_farm");
		Melon m2 = new Melon(250, 2000, 10, "Software_farm");
		
		System.out.println("m1 ��ü����"+m1.toString());
		System.out.println("m2 ��ü����"+m2.toString());
		System.out.println();
		System.out.println();
		System.out.println(">>m2 ��ü�� cost�� ���۳�� ���� ���� ��");
		m2.setInfo("Java_farm");
		System.out.println(m2.toString());
		System.out.println();
		System.out.println();
		System.out.println("m1 : �߷�>>"+m1.getKg());
	}

}
