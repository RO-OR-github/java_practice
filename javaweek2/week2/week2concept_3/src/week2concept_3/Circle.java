package week2concept_3;

public class Circle {
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
				
	}
	
	public void printrd() {
		System.out.printf("radius = %.2f\n",radius);
	}
	
	public double getArea() { 
		return 3.14*radius*radius;
		}

}

