package javaweek3practice_4;

import java.util.Scanner;

public class WordTest {
	public static void main(String[] args) {
		String enw, knw, inp;
		boolean beq=true;
		Scanner sc = new Scanner(System.in);
		Word[] wd = new Word[7];

		// �Է� ���� ������ ��ü �迭 �ʱ�ȭ
		for (int i = 0; i < wd.length; i++) {
			System.out.print((i + 1) + " : ���ܾ�� ���� �Է��ϼ��� >>>>>>>");
			enw = sc.next();
			knw = sc.next();

			wd[i] = new Word(enw, knw);

		}
		// �Է� ���
		while (true) {
			System.out.println("ã���� �ϴ� �ܾ �Է��ϼ���. ����(f) >>");
			inp = sc.next();
			// f�ϰ�� while�� ����
			if (inp.equals("f")) {
				System.out.println("���α׷� ����");
				break;
				// �ܾ�� �� ���ڿ� ��ȯ
			} else {
				
				// wd��ü �迭 ���� �ϳ��ϳ� �� �� ���� ���� ������, toString �ȳ����� �ش�ܾ �����ϴ�.
				for (int j = 0; j < wd.length; j++) {
					String eq = wd[j].getEn();
					if (eq.equals(inp)) {
						System.out.println(wd[j].toString());
						beq = true;
						break;
					}else {
						beq = false;
					}
				}
				if(beq == false)
					System.out.println("�ش� �ܾ �����ϴ�.");
			}
		}
		sc.close();
	}
}