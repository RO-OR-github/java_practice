package javaweek5_5;

public class Cat extends Animal {
	private String type="绊剧捞";
	
	public Cat() {}
	public Cat(String catname) {
		super(catname);
	}
	
	public String reaction(Animal cat) {
		return "部府郴府绊";
	}
	
	void sound() {
		System.out.println(" 具~克");
	}
	
	@Override
	public String toString() {
		return super.toString()+type;
	}
	
}