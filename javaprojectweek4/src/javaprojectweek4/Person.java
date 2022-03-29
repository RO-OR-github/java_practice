package javaprojectweek4;

public class Person {
	private String name, ad, num;
	
	public Person() {
		this( "null", "null", "null");
	} //default

	public Person(String name, String ad) {
		this(name, ad, "null");
	}
	
	public Person(String name, String ad, String num) {
		this.name = name;
		this.ad = ad;
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "Person [name= "+name + ", ad=" + ad + ", num=" + num+"]";
	}


}
