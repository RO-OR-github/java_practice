package javaweek6practice_5;

public class Student extends Person implements IJob,IPin {
	private int enter;
	double pay;
	
	public Student() {
		this(0, 0);
	}
	public Student (int enter, int h) {
		this.enter = enter;
		num = enter + getPin();
		this.pay = getPay(h);
	}
	
	public double getPay(double hour) {
		pay=hour*7000;
		return pay;
	}
	
	public int getPin() {
		 int ran = (int)(Math.random() * 99);
		 return ran;
	}

	@Override
	public String toString() {
		return "Student [enter=" + enter + ", pay=" + pay + " num="+ num + "]";
	}
	
	
}
