package javaprojectweek4_4;

public class Person {
	private String name,num;
	
	public Person(String name, String num) {
		super();
		this.name = name;
		this.num = num;
	}
	
	public int computeSalary() {
		int a=12;
		int b=123123;
		return a*b;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "이름 : "+name+", 사번 : "+num;
	}

}
