package java2conceptweek4_5;

public class Test {
	public static void main(String args[]) {
		ClassA aa = new ClassA();
		ClassB bb = new ClassB();
		ClassA ab = new ClassB();
		ClassB.methodFour(0);
		ClassA.methodFour(0);
		aa.methodTwo(0);
		bb.methodTwo(0);
		ab.methodTwo(0);
	}
}

class ClassA {
	public void methodOne(int i) {
	}

	public void methodTwo(int i) {
		System.out.println("A2");
	}

	public void methodThree(int i) {
	}

	public static void methodFour(int i) {
		System.out.println("A4");
	}
}

class ClassB extends ClassA {
	public void methodOne(int i) {
	}

	public void methodTwo(int i) {
		System.out.println("B2");
	}

	public void methodThree(int i) {
	}

	public static void methodFour(int i) {
		System.out.println("B4");
	}
}
