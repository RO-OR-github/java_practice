package week2_4;

import java.util.Scanner;

public class ActiveCellPhone {
	public static void main(String[] args) {
		String pnum;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("��ȭ��ȣ�� �Է��ϼ��� : ");
		pnum=sc.next();
		
		CellPhone cp = new CellPhone(pnum);
		cp.powerToggle();
		cp.powerToggle();
		cp.powerToggle();
		System.out.println(cp.getCount());
		System.out.println(cp.toString());
		
		sc.close();
	}

}
