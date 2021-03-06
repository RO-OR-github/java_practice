package javaweek3practice;

//객체 배열 사용
public class StudentTest {
	public static void main(String[] args) {
		Student[] std=new Student[2]; //참조 저장공간 3개생성 참조하는 객체x
		std[0]=new Student();
		std[1]=new Student("daniel",80.3);
	
		
//		System.out.println(Student.getcnt());//인스턴스가 아닌 정적멤버는 앞의 클래스이름을 붙여 호출
		System.out.println(">>객체 생성 후<<");
		for(Student s : std) //인덱스 사용않고 객체 원소 접근 가능 //배열 출력
			System.out.println(s.toString());
		System.out.println();
		
		System.out.println(">>anonymous이름과 성적 설정 후<<");
		std[0].setName("benny");
		std[0].setScore(100.0);
		
	System.out.println(std[0]); //뒤에toString을 생략해도 메소드가 만들어져있다면 자동으로 호출
		System.out.println();
		
		System.out.println(">>daniel 성적 변경 후<<");
		std[1].setScore(60.7);
		System.out.println(std[1]);
		
		
		
		
		
	}

}
