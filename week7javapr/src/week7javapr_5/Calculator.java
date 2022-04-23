package week7javapr_5;

class Calculator {
	Control cal;
	
	//�Ű������� ������
	public void setControl(Control cal) {
			this.cal = cal;
	}
	
	void compute(int a, int b) {
		cal.run(a, b);
	}

	static interface Control{
		void run(int a, int b); // public abstract ���� ��, �߻�޼ҵ�
	}
}
class Add implements Calculator.Control{
	public void run(int a, int b) {
		System.out.println(a+b);
	}
}

class Exp implements Calculator.Control{
	public void run(int a, int b) {
		System.out.println((int)Math.pow(a, b));
	}
}