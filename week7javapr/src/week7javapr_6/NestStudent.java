package week7javapr_6;
import java.util.Scanner;

public class NestStudent {
	private String stname;
	private Subject su;
		
	public NestStudent(String stname, int cnt) {
		this.stname = stname;
		System.out.println(stname+"==>");
		su =new Subject(cnt);
	}
	
	void stdPrint() { // 객체 내용 출력
	    // 학생 이름 출력
	    // Subject 객체의 subjectprint() 를 호출하여 수강과목 출력
		System.out.println("====================================");
		System.out.println(stname+"학생의 수강과목");
		su.subjectprint();
		
	}

	class Subject{
		String[] subcnt;
		public Subject() {};
	    public Subject(int num) { 
	          //매개변수로 받은 값만큼 배열을 생성하고 수강과목을 입력 받아 저장
	    	 subcnt = new String[num];
	    	 Scanner in = new Scanner(System.in);
	    	for(int i=0; i<num; i++) {
	    		System.out.print("수강과목("+(i+1)+") : ");
	    		subcnt[i]=in.nextLine();
	    	}
	    }
	    public void subjectprint() { 
	    	//배열에 저장된 수강과목 출력
	    	for(int k=0; k<subcnt.length; k++) {
	    		System.out.println(subcnt[k]);
	    	}
	    }

	}
}
