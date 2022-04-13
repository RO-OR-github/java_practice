package javaweek6practice_4;

public class PersonTest {
//	public static Person getMaximum(Person[] arr) {
//
//		for(int i =0; i<arr.length; i++ ) {
//			while(arr[i].compareo(arr[i])==1) {
//			}
//				
//		}
//		
//	}
	
	public static void main(String[] args) {
		
		IComparable[] arr = new Person[3];
		
		arr[0]=new Person("Benny",180.0);
		arr[1]=new Person("Daniel",178.0);
		arr[2]=new Person("joon",188.0);
		
//		System.out.println(arr[0].compareo(arr));
		for(int i=0; i<arr.length; i++)
		    System.out.println(arr[i].toString());
		
										
	}
}
