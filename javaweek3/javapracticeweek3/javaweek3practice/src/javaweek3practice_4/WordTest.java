package javaweek3practice_4;

import java.util.Scanner;

public class WordTest {
	public static void main(String[] args) {
		String enw, knw, inp;
		boolean beq=true;
		Scanner sc = new Scanner(System.in);
		Word[] wd = new Word[7];

		// 입력 받은 값으로 객체 배열 초기화
		for (int i = 0; i < wd.length; i++) {
			System.out.print((i + 1) + " : 영단어와 뜻을 입력하세요 >>>>>>>");
			enw = sc.next();
			knw = sc.next();

			wd[i] = new Word(enw, knw);

		}
		// 입력 기능
		while (true) {
			System.out.println("찾고자 하는 단어를 입력하세요. 종료(f) >>");
			inp = sc.next();
			// f일경우 while문 종료
			if (inp.equals("f")) {
				System.out.println("프로그램 종료");
				break;
				// 단어비교 및 문자열 반환
			} else {
				
				// wd객체 배열 값을 하나하나 비교 후 같은 값이 나오면, toString 안나오면 해당단어가 없습니다.
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
					System.out.println("해당 단어가 없습니다.");
			}
		}
		sc.close();
	}
}