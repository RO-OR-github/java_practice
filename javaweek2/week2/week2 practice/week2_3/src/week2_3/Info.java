package week2_3;

public class Info {
	private String id;
	private int pass;
	
	public Info(String id, int pass) {
		 this.id = id;
		 this.pass = pass;
		
	}
	
	void display() {
		System.out.println("id :"+id+"      password :"+pass);

	}
}

