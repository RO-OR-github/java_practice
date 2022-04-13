package java2conceptweek4_8;

public class CheckingAccount extends Account {
	private String cardNo;

	public CheckingAccount(String name, int money, String ccount, String cardNo) {
		super(name, money, ccount);
		this.cardNo = cardNo;
	}
	public void milater(int a) {
		super.add(a);
		System.out.println(">>출금 후<<\n"+super.toString()+"\n카드번호 : "+cardNo);
	}
	public void molater(int b) {
		super.sub(b);
		System.out.println(">>예금 후<<\n"+super.toString()+"\n카드번호 : "+cardNo);
	}
	public void pay(int c) {
		super.sub(c);
		System.out.println(">>직불카드 사용 후<<\n"+super.toString()+"\n카드번호 : "+cardNo);
	
	}
	@Override
	public String toString() {
		return ">>예금 전<<\n"+super.toString()+"\n카드번호 : "+cardNo;
	}
	
	

}
