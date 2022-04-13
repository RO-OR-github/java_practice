package javaprojectweek4_4;

public class HourEmployee extends Person {
	private int hoursl,hour;

	public HourEmployee(String name, String num, int hoursl, int hour) {
		super(name,num);
		this.hoursl = hoursl;
		this.hour = hour;
	}

	@Override
	public int computeSalary() {
		int money = hour*hoursl;
		return money;
	}

	public int getHoursl() {
		return hoursl;
	}

	public void setHoursl(int hoursl) {
		this.hoursl = hoursl;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	@Override
	public String toString() {
		return super.toString()+", 시간당임금 : "+hoursl+", 일한시간 : "+hour+", 금액 : "+computeSalary();
	}





}
