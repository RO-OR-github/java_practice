package javaweek6practice_3;

public class ShapeTest {
	public static void main(String[] args) {
		IGraphics re1 = new Rectangle(12.3,3.4);
		IGraphics re2 = new Rectangle(20.3,5.6);
		IGraphics cr1 = new Circle(12.3);
		
		re1.draw();
		System.out.println(re1);
		System.out.println("둘레 : "+String.format("%.2f",re1.perimeter()));
		System.out.println("");
		
		re2.draw();
		System.out.println(re2);
		System.out.println("둘레 : "+re2.perimeter());
		System.out.println("");
		
		cr1.draw();
		System.out.println(cr1);
		System.out.println("둘레 : "+String.format("%.2f",cr1.perimeter()));
		System.out.println("");
	}
}
