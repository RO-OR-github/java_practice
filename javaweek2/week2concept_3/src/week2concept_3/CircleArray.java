package week2concept_3;
import java.util.Scanner;

public class CircleArray {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Circle [] c = new Circle[5];
		
		for(int i=0; i< c.length; i++) {
			System.out.print("반지름을 입력하세요 : ");
			double rd = sc.nextDouble();
			c[i] = new Circle(rd); //배열로 객체를 만들어줌 하나씩 선언 생성 할것을 한번에
		}
		for(int i=0; i<5; i++) {
			c[i].printrd();
		}
		for(int i=0; i<5; i++) {
			System.out.println(i+1+"] Area: "+c[i].getArea());
		}
		sc.close();
	}

}
