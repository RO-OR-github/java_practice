package javaweek3practice;

public class Student {
	private String name;
	private double score;
	private String grade;
//	private static int cnt; �� �� �ҷ��Դ��� ���߿� ���� ���
	
	public Student() {
		this("anonymous", 0.0);
	}
	//�ʵ忡 �����ϴ� ���� �ٸ����� ���� �����ڵ��� ������ �����Ǿ�����
	//�����ε��� ������ȣ���� ���ش�.
	//�ʱ�ȭ ���� ������ ���� �ϱ�����
    public Student(String name, double score) {
		this.name = name;
		this.score = score;
		grade=method();
        
	}

	//float�� ����ȯ�� ���־�� �ϱ⶧���� �ַ� double�� ���
	@Override //��Ŭ�� source���� �̸̹������ �޼ҵ� ���
	public String toString() {
		return "Student [�̸�=" + name + ", ����=" + score + ", ���=" + method() + "]";
	}
	
	//��� ���޼ҵ� �ۼ�, ĸ��ȭ
    String method() {
		if(score<70)
			return "F";
		else if(score>=70 && score<75) 
			return "C";
		else if(score>=75 && score<80)
	    	return "B";
	    else if(score>=80 && score<90)
	    	return "B+";
	    else if(score>=90 && score<95)
	    	return "A";
	    else
	    	return "A+";
					
	}
	//getter ,setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		if(score <0)
			return; //��ȿ���˻� ����������
		this.score = score;
	}
	
	
}