package javaweek5_4;

public class Test {
	public static void main(String[] args) {
		Fruit [] fary = new Fruit [4];
		
		fary[0] = new Fruit();
		fary[1] = new Apple();
		fary[2] = new Grape();
		fary[3] = new Pear();
		
		for(int i=0; i<4; i++) {
			System.out.println(fary[i].me());
		}
	}

}
