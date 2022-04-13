package java2conceptweek4_8;

public class Account {
	private String name, ccount;
	private int money;

	public Account(String name, int money, String ccount) {
		this.name = name;
		this.money = money;
		this.ccount = ccount;
	}
	
	public void add(int nm) {
		money = money + nm;
		
	}
	
	public void sub(int nm) {
		money = money - nm;
		
	}

	@Override
	public String toString() {
		return "°èÁÂ¹øÈ£ : " + ccount + "\n¿¹±İÁÖ : " + name + "\nÀÜ¾× : " + money;   
	}
	
	

}
