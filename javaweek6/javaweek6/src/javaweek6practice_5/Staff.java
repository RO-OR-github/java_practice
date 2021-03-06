package javaweek6practice_5;

public class Staff extends Person implements IJob,IPin {
	private double pay;
	private int count = 1;
	
	public Staff() {
		this(0);
	}
	public Staff( double h) {
		
		pay = getPay(h);
		num = count +getPin();
		count++;
	}
	
	public double getPay(double hour) {
		pay=hour*8000;
		return pay;
	}
	
	public int getPin() {
		 int ran = (int)(Math.random() * 99);
		 return ran;
	}

	@Override
	public String toString() {
		return "Staff [pay=" + pay + " num=" + num +  "]";
	}
	
}
