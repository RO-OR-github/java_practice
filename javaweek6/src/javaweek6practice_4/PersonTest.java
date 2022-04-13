package javaweek6practice_4;

public class PersonTest {
	public static Person getMaximum(Person[] arry) {
		Person max = arry[0];
		for(int i =0; i<arry.length; i++ ) {
			if(max.compareo(arry[i])==-1) {
				max=arry[i];
			}
				
		}
		return max;
		
	}
	
	public static void main(String[] args) {
		
		Person[] arr = new Person[3];
		
		arr[0]=new Person("Benny",180.0);
		arr[1]=new Person("Daniel",178.0);
		arr[2]=new Person("joon",188.0);
		
		for(int i=0; i<arr.length; i++)
		    System.out.println(arr[i].toString());
		
		System.out.println("가장 키 큰 : "+getMaximum(arr));
		
										
	}
}
