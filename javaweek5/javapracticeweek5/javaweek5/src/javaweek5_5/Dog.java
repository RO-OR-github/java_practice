package javaweek5_5;

public class Dog extends Animal {
	private static int count=0;
	private String type="������";
	
	
	public Dog() {
		count++;
	}
	public Dog(String dogname) {
		super(dogname);
		count++;
		
	}
	
	public String reaction(Animal dog) {
		return "�����ø���";
	}
	
	void sound() {
		System.out.println(" �۸�");
	}
	public static int getCountDog(){
		return count;	
	}
	
	@Override
	public String toString() {
		return super.toString()+type;
	}
}
