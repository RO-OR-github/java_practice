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
	double getArea() {//�߻�Ŭ������ �Ű������� �����ϰ�
		double area = x*y/2;
		return area;
	}

}
