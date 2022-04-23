package week7javapr_3;

public class Hair implements Operation {
	private String type;
	
	public Hair() {}
	public Hair(String type) {
		this.type = type;
	}
	
	public void cut() {
		System.out.println(type +"를 자르다.");
	};
	
	public void wash() {
		System.out.println(type +"를 감다.");
	};
	
	public void tint(String color) {
		System.out.println(type +"를 "+color+" 색으로 염색하다.");
	};
	


}
