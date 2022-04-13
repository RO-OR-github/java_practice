package javaweek3practice_3;

import java.util.Scanner;

class DistanceComp{
	private static int i;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(">>생성하고자 하는 객체의 수를 입력하세요 : ");
		i= sc.nextInt();
		String na;
		int di;
    
		Distance [] ds = new Distance[i];
	
		for(int j = 0; j<i ; j++) {
			System.out.print("이름과 통학거리를 입력하세요 : ");
			na = sc.next();
			di = sc.nextInt();
			ds[j] = new Distance(na, di);
		}
		System.out.println(">>통학거리가 가장 긴 학생 : "+longdistance(ds).toString());
		System.out.println(">>통학거리가 가장 짧은 학생 : "+shortdistance(ds).toString());
	    System.out.println(">>통학거리가 가장 긴 학생과 짧은 학생의 차이는 "+(longdistance(ds).getDist()-shortdistance(ds).getDist())+" 입니다.");
		sc.close();

	}	
	public static Distance longdistance(Distance [] a) {
		Distance max = a[0];
		
		
		for(int j = 1; j < i; j++ ) {
			if(max.getDist() < a[j].getDist()) {
				max = a[j];
				
			}	
		}
		return max;
	}
	
	public static Distance shortdistance(Distance [] b) {
		Distance min = b[0];
		
		for(int j = 1; j < i; j++ ) {
			if(min.getDist() > b[j].getDist()) {
				min = b[j];
				
			}

		}
		return min;		
	}
}