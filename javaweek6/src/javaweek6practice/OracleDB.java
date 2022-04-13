package javaweek6practice;

public class OracleDB implements DataAccessObject {
	//구현작업 구체화작업(재정의), 인터페이스는 컴파일러가 자동으로 public 접근제어자를 붙임
	//그래서 재정의 할때 더높은 단계인 default는 오류가남
	//상속과 구현 작업을 동시에 할때는 상속을 먼저 써준다.
	public void select() {
		System.out.println("Oracle DB에서 검색");
	}
	public void insert() {
		System.out.println("Oracle DB에서 삽입");
	}
	public void update() {
		System.out.println("Oracle DB에서 수정");
	}
	public void delete() {
		System.out.println("Oracle DB에서 삭제");
    }
}