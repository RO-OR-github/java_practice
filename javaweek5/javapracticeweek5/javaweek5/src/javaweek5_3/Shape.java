package javaweek5_3;

abstract class Shape {
	private String fig;
	
	public Shape(){}
	public Shape(String fig) {
		this.fig = fig;
	}

	abstract double getArea();
	public String getName() {
		return fig;
	}
}
