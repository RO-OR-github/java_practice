package javaweek6practice_3;

public class Rectangle implements IGraphics {
	private double length,width;
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	public double perimeter() {
		double al = (length + width)*2;
		return al;
	}
	public void draw() {
		System.out.println("Retangle Draw");
	}
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}
	
}
