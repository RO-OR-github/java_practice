package week7javapr_3;

public class Hair implements Operation {
	private String type;
	
	public Hair() {}
	public Hair(String type) {
		this.type = type;
	}
	
	public void cut() {
		System.out.println(type +"�� �ڸ���.");
	};
	
	public void wash() {
		System.out.println(type +"�� ����.");
	};
	
	public void tint(String color) {
		System.out.println(type +"�� "+color+" ������ �����ϴ�.");
	};
	


}
