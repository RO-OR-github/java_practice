package java2conceptweek4_8;

public class CheckingAccount extends Account {
	private String cardNo;

	public CheckingAccount(String name, int money, String ccount, String cardNo) {
		super(name, money, ccount);
		this.cardNo = cardNo;
	}
	public void milater(int a) {
		super.add(a);
		System.out.println(">>��� ��<<\n"+super.toString()+"\nī���ȣ : "+cardNo);
	}
	public void molater(int b) {
		super.sub(b);
		System.out.println(">>���� ��<<\n"+super.toString()+"\nī���ȣ : "+cardNo);
	}
	public void pay(int c) {
		super.sub(c);
		System.out.println(">>����ī�� ��� ��<<\n"+super.toString()+"\nī���ȣ : "+cardNo);
	
	}
	@Override
	public String toString() {
		return ">>���� ��<<\n"+super.toString()+"\nī���ȣ : "+cardNo;
	}
	
	

}
