package javaweek5_5;

public class Cat extends Animal {
	private String type="�����";
	
	public Cat() {}
	public Cat(String catname) {
		super(catname);
	}
	
	public String reaction(Animal cat) {
		return "����������";
	}
	
	void sound() {
		System.out.println(" ��~��");
	}
	
	@Override
	public String toString() {
		return super.toString()+type;
	}
	
}