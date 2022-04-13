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
			return "�ù���";
		}else {
			--food;
			return "�۸�";
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
		System.out.print("������ ������ �Է��ϼ��� : ");
		df=sc.nextInt();

		while(true){
			if(df>0){
				food += df;
				break;
			}else if(df==0){
				break;
			}else{
				System.out.print("0�� �̻� �ּ���. �ٽ� �Է��ϼ��� : ");
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
		// TODO �ڵ� ������ �޼ҵ� ����
		return "Dog [����=" + age + ", ����=" + color + ", ����=" + food + " ��ü ��=" +getTotal()+"]";
	}
	
	public int getTotal() {
		return total;
	}
	public int getFood() {
		return food;
	}	
	
	
	
}