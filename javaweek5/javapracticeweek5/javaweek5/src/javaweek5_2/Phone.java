package javaweek5_2;

abstract class Phone {
	private String maker;
	private int type, price;
	
	public Phone() {
		this("None",0,0);
	} //����Ʈ�����ڷ� ȣ���Ҷ��� �θ�, �ڽ� ���  �־����
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
	@Override //tostring�� �����ǰ� �Ǿ��Ѵ�.
	public String toString() {
		return "maker=" + maker + "\ntype=" + type + "\nprice=" + price;
	}
	

}// �߻� Ŭ���� �ȿ� ������ �߻� �޼ҵ尡 ������ ������ ���� �ִٸ� ������ ��� ������������� �Ѵ�.
