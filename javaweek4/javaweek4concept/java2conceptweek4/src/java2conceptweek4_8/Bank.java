package java2conceptweek4_8;

public class Bank {
	public static void main(String[] args) {
		
		CheckingAccount ba = new CheckingAccount("ȫ�浿",100000,"111-22-3333","55-66-77-88");
		
		System.out.println(ba.toString());
		ba.milater(100000);
		ba.pay(40000);
		
	}
	
	
	
}
