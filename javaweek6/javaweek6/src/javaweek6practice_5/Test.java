package javaweek6practice_5;

public class Test {
	public static void main(String[] args) {
		Person[] prr = new Person[6];
		
		prr[0] = new Person();
		prr[1] = new Person("benny", 20); 
		prr[2] = new Student();
		prr[3] = new Student(2015,3) ;
		prr[4] = new Staff();
		prr[5] = new Staff(8);
		
		for(int i=0; i<prr.length; i++) {
			System.out.println(prr[i]);
		}
		
	}
}
