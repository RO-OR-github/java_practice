package javaweek6practice_4;

public class Person implements IComparable {
	private String name;
	private double height;
	
	
	public Person(String name, double height) {
		this.name = name;
		this.height = height;
	}


	public int compareo(Object other) {

		if(height>((Person) other).getHeight())
			return 1;
		else if(height==((Person) other).getHeight())
			return 0;
		else
			return -1;
	}
	
	
	public double getHeight() {
		return height;
	}



	@Override
	public String toString() {
		return "Person [name=" + name + ", height=" + height + "]";
	}
	
	
}
