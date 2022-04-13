package javaweek5_3;

public class Triangle extends Shape {
	private int x,y;
	
	public Triangle() {}
	public Triangle(String fig, int x, int y) {
		super(fig);
		this.x=x;
		this.y=y;
	}
	@Override
	double getArea() {//추상클래스라도 매개변수는 동일하게
		double area = x*y/2;
		return area;
	}

}
