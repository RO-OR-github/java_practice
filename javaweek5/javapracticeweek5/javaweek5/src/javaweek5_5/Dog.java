package javaweek5_5;

public class Dog extends Animal {
	private static int count=0;
	private String type="碍酒瘤";
	
	
	public Dog() {
		count++;
	}
	public Dog(String dogname) {
		super(dogname);
		count++;
		
	}
	
	public String reaction(Animal dog) {
		return "部府棵府绊";
	}
	
	void sound() {
		System.out.println(" 港港");
	}
	public static int getCountDog(){
		return count;	
	}
	
	@Override
	public String toString() {
		return super.toString()+type;
	}
}
