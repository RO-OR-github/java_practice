package week7javapr_5;

class Calculator {
	Control cal;
	
	//매개변수의 다형성
	public void setControl(Control cal) {
			this.cal = cal;
	}
	
	void compute(int a, int b) {
		cal.run(a, b);
	}

	static interface Control{
		void run(int a, int b); // public abstract 생략 즉, 추상메소드
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