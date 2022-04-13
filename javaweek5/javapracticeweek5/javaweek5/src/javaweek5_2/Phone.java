package javaweek5_2;

abstract class Phone {
	private String maker;
	private int type, price;
	
	public Phone() {
		this("None",0,0);
	} //디폴트생성자로 호출할때는 부모, 자식 모두  있어야함
	public Phone(String maker, int type, int price) {
		this.maker = maker;
		this.type = type;
		this.price = price;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	@Override //tostring은 재정의가 되야한다.
	public String toString() {
		return "maker=" + maker + "\ntype=" + type + "\nprice=" + price;
	}
	

}// 추상 클래스 안에 무조건 추상 메소드가 있지는 않지만 만약 있다면 무조건 상속 재정의적어줘야 한다.
