package javaweek3practice_2;

import java.util.Scanner;

public class Dog {
	private int age, food;
	private static int total = 0;
	private String color;
    
	public Dog(int age, String color) {
		this(age,0,color);
		
		
	}

	public Dog(int age, int food, String color) {
		this.age = age;
		this.color = color;
		this.food = food;
		++total;
	}


	public String barking() {
		if(food==0) {
			return "시무룩";
		}else {
			--food;
			return "멍멍";
		}
	}
	
	public boolean hungry() {
		if(food<=1) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean sleeping() {
		int df;
		Scanner sc = new Scanner(System.in);
		System.out.print("간식의 수량을 입력하세요 : ");
		df=sc.nextInt();

		while(true){
			if(df>0){
				food += df;
				break;
			}else if(df==0){
				break;
			}else{
				System.out.print("0개 이상만 주세요. 다시 입력하세요 : ");
				df=sc.nextInt();
			}	
		}
		sc.close();
		if(df==0)
			return true;
		else
			return false;
	}
	
	@Override
	public String toString() {
		// TODO 자동 생성된 메소드 스텁
		return "Dog [나이=" + age + ", 색깔=" + color + ", 간식=" + food + " 객체 수=" +getTotal()+"]";
	}
	
	public int getTotal() {
		return total;
	}
	public int getFood() {
		return food;
	}	
	
	
	
}
