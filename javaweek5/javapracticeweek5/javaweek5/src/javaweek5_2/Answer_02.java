package javaweek5_2;

public class Answer_02  {
	public static void main(String[] args) {
		SmartPhone[] p = { new SmartPhone(), new SmartPhone("hallym", 20, 5, 8, true) };
		for (SmartPhone obj : p) {//��üp ���� �ϳ��� ���� obj�� �ְڴ�.
			System.out.println(obj); //��� �޾Ƽ� ���� �����Ǹ� ���ص���
			System.out.println("memory : " + obj.getMemory());
			System.out.println("Bluetooth : " + obj.isHasBluetooth());
			System.out.println();
		}
	}
}
