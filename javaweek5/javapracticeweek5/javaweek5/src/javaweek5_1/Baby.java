package javaweek5_1;

public class Baby extends Animal {
	public Baby(String type) {
		super(type);
	}
	
	public void run() {
		System.out.println(getType() + ":" +" ���ٴմϴ�.");
	}
	
	public void sound() {
		System.out.println(getType() + ":" +" �˾��̸� �մϴ�.");
	}

}


