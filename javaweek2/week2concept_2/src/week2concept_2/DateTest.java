package week2concept_2;
import java.util.Scanner;

public class DateTest {
	public static void main(String[] args) {
	    int dayt,montht,yeart;
	    boolean i,y;
	    Scanner sc = new Scanner(System.in);
	    
	    //�� �Է�
	    System.out.print("���� �Է��ϼ��� : ");
	    dayt=sc.nextInt();
	    while(i=true)
	        if(1<=dayt&&dayt<=31) {
	        	break;
	        }else {
	    	    System.out.print("�ùٸ��� �Է��ϼ��� : ");
	    	    dayt=sc.nextInt();
	        }
	    
	    //�� �Է�
	    System.out.print("���� �Է��ϼ��� : ");
	    montht=sc.nextInt();
	    while(i=true)
	        if(1<=montht&&montht<=12) {
	        	break;
	        }else {
	    	    System.out.print("�ùٸ��� �Է��ϼ��� : ");
	    	    montht=sc.nextInt();
	        }
	    
	    //�� �Է�
	    System.out.print("���� �Է��ϼ��� : ");
	    yeart=sc.nextInt();
	    while(i=true)
	        if(0<=yeart) {
	        	i=true;
	        	break;
	        }else{
	    	    System.out.print("�ùٸ��� �Է��ϼ��� : ");
	    	    yeart=sc.nextInt();
	        }
	    
	    //��� ���� �Է�
	    System.out.print("����� �ΰ���? ������ true �ƴϸ� false : ");
	    y=sc.nextBoolean();
	    
	    //��ü ����,���� �� ȣ��
	    Date dt = new Date(dayt,yeart,montht);
	    dt.print1(y);
	    dt.print2(y);
	    
	    sc.close();
	}

}