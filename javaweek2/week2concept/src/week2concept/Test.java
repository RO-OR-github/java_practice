package week2concept;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		double high,weigh;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("세로를 입력하세요 : ");
		high = sc.nextDouble();
		
		System.out.print("가로를 입력하세요 : ");
		weigh = sc.nextDouble();
		
		Rectangle rt = new Rectangle(high,weigh);
		System.out.println(rt.area());
		System.out.println(rt.perimeter());
		
		sc.close();
	}
	

}
