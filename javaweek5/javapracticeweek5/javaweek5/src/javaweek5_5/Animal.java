package javaweek5_5;

public abstract class Animal {
	private String name;
	
	public Animal() {
		this("Anonymous");
	}

	public Animal(String name) {
		this.name = name;
	
		
	}
	
	abstract String reaction(Animal ani);
	
	abstract void sound();

	@Override
	public String toString() {
		return name;
	}
	
	
	
}
