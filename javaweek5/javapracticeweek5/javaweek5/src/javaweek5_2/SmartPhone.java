package javaweek5_2;

public class SmartPhone extends Phone{ //��� ���� ���ֱ�
	private int memory;
	private boolean hasBluetooth;
	
	public SmartPhone() {//����Ʈ ������
		
	}
	public SmartPhone(String maker, int type, int price, int memory, boolean hasBluetooth) {
		super(maker, type, price);
		this.memory = memory;
		this.hasBluetooth = hasBluetooth;
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	public boolean isHasBluetooth() {//boolean getter
		return hasBluetooth;
	}
	public void setHasBluetooth(boolean hasBluetooth) {
		this.hasBluetooth = hasBluetooth;
	}

	
	
}