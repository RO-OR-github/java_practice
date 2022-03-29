package javaprojectweek4_2;


public class Answr_02 {
	public static void main(String[] args) {
		Magazine magazineA = new Magazine("잡지A", "기자A", 10, "2010년 2월 25일");
		Magazine magazineB = new Magazine("잡지B", "기자B",  20, "2010년 3월 8일");
                //제시된 결과처럼 출력될 수 있도록 완성 – 본인작성
		
		
		System.out.println(magazineA+"\n");
		
		System.out.println("---bookA 객체 저자 변경 후---");
		magazineA.setDir("기자변경");
		System.out.println(magazineA+"\n");
		
		System.out.println(magazineB+"\n");
		
		System.out.println("---bookB 객체 페이지 변경 후---");
		magazineB.setPage(50);
		System.out.println(magazineB+"\n");
		
		System.out.println("---bookB 객체 발매일 변경 후---");
		magazineB.setDate("2020년 8월 31일");
		System.out.println(magazineB+"\n");
	}
	
}
