package javaweek5_1;

public class Dog extends Animal{
	public Dog(String type) {
		super(type);
	}
	
	public void run() {
		System.out.println(getType() + ":" +" �� �߷� �ٴմϴ�..");
	}
	
	public void sound() {
		System.out.println(getType() + ":" +" �۸� �Ҹ��� ���ϴ�.");
	}

}
