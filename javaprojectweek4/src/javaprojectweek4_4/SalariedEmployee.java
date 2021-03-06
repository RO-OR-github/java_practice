package javaprojectweek4_4;

public class SalariedEmployee extends Person {
	private int month;

	public SalariedEmployee(String name, String num, int month) {
		super(name,num);
		this.month = month;
	}

	@Override
	public int computeSalary() {
		int year = month*12;
		return year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	@Override
	public String toString() {
		return super.toString()+", ?޿? : "+month+", ???? : "+computeSalary();
	}




}
