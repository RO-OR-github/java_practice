package week2concept;

public class Rectangle {
	private double wh,hh;
	public Rectangle(double wh, double hh) {
		this.wh = wh;
		this.hh = hh;
		
	}
	double area() {
		double ar = wh*hh;
		return ar;
	}
	double perimeter() {
		double pr =wh+hh;
		return pr;
		
	}

}
