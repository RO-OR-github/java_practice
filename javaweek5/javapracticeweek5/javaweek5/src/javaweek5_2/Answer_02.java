package javaweek5_2;

public class Answer_02  {
	public static void main(String[] args) {
		SmartPhone[] p = { new SmartPhone(), new SmartPhone("hallym", 20, 5, 8, true) };
		for (SmartPhone obj : p) {//객체p 에서 하나씩 빼서 obj에 넣겠다.
			System.out.println(obj); //상속 받아서 따로 재정의를 안해도됨
			System.out.println("memory : " + obj.getMemory());
			System.out.println("Bluetooth : " + obj.isHasBluetooth());
			System.out.println();
		}
	}
}

