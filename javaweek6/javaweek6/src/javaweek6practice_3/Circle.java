package javaweek6practice_3;

public class Circle implements IGraphics {
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	public double perimeter() {
		double rl = radius*2*3.14;
		return rl;
	}
	public void draw() {
		System.out.println("Retangle Draw");
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
}

