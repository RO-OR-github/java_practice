package javaprojectweek4_3;

public class Melon extends Food {
	private String info;

	public Melon(int cal, int cost, int kg, String info) {
		super(cal,cost,kg);
		this.info = info;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "[" +super.toString()+"   ???۳???="+info+"]";
	}
	

}
