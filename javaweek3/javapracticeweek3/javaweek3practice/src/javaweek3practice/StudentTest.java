package javaweek3practice;

//��ü �迭 ���
public class StudentTest {
	public static void main(String[] args) {
		Student[] std=new Student[2]; //���� ������� 3������ �����ϴ� ��üx
		std[0]=new Student();
		std[1]=new Student("daniel",80.3);
	
		
//		System.out.println(Student.getcnt());//�ν��Ͻ��� �ƴ� ��������� ���� Ŭ�����̸��� �ٿ� ȣ��
		System.out.println(">>��ü ���� ��<<");
		for(Student s : std) //�ε��� ���ʰ� ��ü ���� ���� ���� //�迭 ���
			System.out.println(s.toString());
		System.out.println();
		
		System.out.println(">>anonymous�̸��� ���� ���� ��<<");
		std[0].setName("benny");
		std[0].setScore(100.0);
		
	System.out.println(std[0]); //�ڿ�toString�� �����ص� �޼ҵ尡 ��������ִٸ� �ڵ����� ȣ��
		System.out.println();
		
		System.out.println(">>daniel ���� ���� ��<<");
		std[1].setScore(60.7);
		System.out.println(std[1]);
		
		
		
		
		
	}

}