package week7javapr_3;

public class Fruit implements Operation {
	private String type;
	
	public Fruit() {}
	public Fruit(String type) {
		this.type = type;
	}
	
	public void cut() {
		System.out.println(type +"를 자르다.");
	};
	
	public void wash() {
		System.out.println(type +"를 감다.");
	};
	
	public void pack(int cnt) {
		System.out.println(type+"를 "+cnt+"개 포장하다.");
	}
}
