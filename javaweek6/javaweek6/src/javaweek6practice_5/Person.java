package javaweek6practice_5;

public class Person {
	private String name;
	private int age;
	protected int num;
	
	public Person() {
		this("anonymous",0);
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	
}
