package week7javapr_3;

public class Fruit implements Operation {
	private String type;
	
	public Fruit() {}
	public Fruit(String type) {
		this.type = type;
	}
	
	public void cut() {
		System.out.println(type +"�� �ڸ���.");
	};
	
	public void wash() {
		System.out.println(type +"�� ����.");
	};
	
	public void pack(int cnt) {
		System.out.println(type+"�� "+cnt+"�� �����ϴ�.");
	}
}
