package javaweek5_1;

abstract class Animal {
	private String type; // À¯Çü

	public Animal(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	abstract void run();

	abstract void sound();
}

