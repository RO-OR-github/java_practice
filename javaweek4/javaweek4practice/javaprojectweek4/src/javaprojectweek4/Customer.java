package javaprojectweek4;

public class Customer extends Person {
	private int cusn;
	private int cusmile;

	public Customer(String name, String ad, int cusn, int cusmile){
		super(name, ad);
		this.cusn = cusn;
		this.cusmile = cusmile;
	}

	public Customer(int cusn, int cusmile) {
		super();
		this.cusn = cusn;
		this.cusmile = cusmile;
	}

	@Override
	public String toString() {
		return super.toString()+"\nCustomer [cusn=" + cusn + ", cusmile=" + cusmile + "]";
	}
	
	

}
