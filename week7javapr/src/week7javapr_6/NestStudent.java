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
	
	void stdPrint() { // ��ü ���� ���
	    // �л� �̸� ���
	    // Subject ��ü�� subjectprint() �� ȣ���Ͽ� �������� ���
		System.out.println("====================================");
		System.out.println(stname+"�л��� ��������");
		su.subjectprint();
		
	}

	class Subject{
		String[] subcnt;
		public Subject() {};
	    public Subject(int num) { 
	          //�Ű������� ���� ����ŭ �迭�� �����ϰ� ���������� �Է� �޾� ����
	    	 subcnt = new String[num];
	    	 Scanner in = new Scanner(System.in);
	    	for(int i=0; i<num; i++) {
	    		System.out.print("��������("+(i+1)+") : ");
	    		subcnt[i]=in.nextLine();
	    	}
	    }
	    public void subjectprint() { 
	    	//�迭�� ����� �������� ���
	    	for(int k=0; k<subcnt.length; k++) {
	    		System.out.println(subcnt[k]);
	    	}
	    }

	}
}
