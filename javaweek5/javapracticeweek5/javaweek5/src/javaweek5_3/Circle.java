package javaweek5_3;

public class Circle extends Shape {
	private double pi;
	private int r;
	
	public Circle() {}
	public Circle(String fig, int r, double pi) {
		super(fig);
		this.r=r;
		this.pi=pi;
	}
	@Override
	double getArea() {//�߻�Ŭ������ �Ű������� �����ϰ�
		double area = r*r*pi;
		return area;
	}

}
