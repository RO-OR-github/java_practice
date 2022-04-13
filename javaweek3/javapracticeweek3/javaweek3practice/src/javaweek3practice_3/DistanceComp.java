package javaweek3practice_3;

import java.util.Scanner;

class DistanceComp{
	private static int i;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(">>�����ϰ��� �ϴ� ��ü�� ���� �Է��ϼ��� : ");
		i= sc.nextInt();
		String na;
		int di;
    
		Distance [] ds = new Distance[i];
	
		for(int j = 0; j<i ; j++) {
			System.out.print("�̸��� ���аŸ��� �Է��ϼ��� : ");
			na = sc.next();
			di = sc.nextInt();
			ds[j] = new Distance(na, di);
		}
		System.out.println(">>���аŸ��� ���� �� �л� : "+longdistance(ds).toString());
		System.out.println(">>���аŸ��� ���� ª�� �л� : "+shortdistance(ds).toString());
	    System.out.println(">>���аŸ��� ���� �� �л��� ª�� �л��� ���̴� "+(longdistance(ds).getDist()-shortdistance(ds).getDist())+" �Դϴ�.");
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