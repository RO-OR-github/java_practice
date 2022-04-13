package week2concept_2;
import java.util.Scanner;

public class DateTest {
	public static void main(String[] args) {
	    int dayt,montht,yeart;
	    boolean i,y;
	    Scanner sc = new Scanner(System.in);
	    
	    //일 입력
	    System.out.print("일을 입력하세요 : ");
	    dayt=sc.nextInt();
	    while(i=true)
	        if(1<=dayt&&dayt<=31) {
	        	break;
	        }else {
	    	    System.out.print("올바르게 입력하세요 : ");
	    	    dayt=sc.nextInt();
	        }
	    
	    //월 입력
	    System.out.print("월을 입력하세요 : ");
	    montht=sc.nextInt();
	    while(i=true)
	        if(1<=montht&&montht<=12) {
	        	break;
	        }else {
	    	    System.out.print("올바르게 입력하세요 : ");
	    	    montht=sc.nextInt();
	        }
	    
	    //년 입력
	    System.out.print("년을 입력하세요 : ");
	    yeart=sc.nextInt();
	    while(i=true)
	        if(0<=yeart) {
	        	i=true;
	        	break;
	        }else{
	    	    System.out.print("올바르게 입력하세요 : ");
	    	    yeart=sc.nextInt();
	        }
	    
	    //기원 전후 입력
	    System.out.print("기원전 인가요? 맞으면 true 아니면 false : ");
	    y=sc.nextBoolean();
	    
	    //객체 선언,생성 및 호출
	    Date dt = new Date(dayt,yeart,montht);
	    dt.print1(y);
	    dt.print2(y);
	    
	    sc.close();
	}

}
