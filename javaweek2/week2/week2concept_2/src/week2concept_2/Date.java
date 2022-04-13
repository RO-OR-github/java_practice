package week2concept_2;

public class Date {
	private int day,year,month;
	public Date(int day, int year, int month) {
		this.day=day;
		this.year=year;
		this.month=month;
	}
	void print1(boolean yy) {
        if(yy==true) {
        	System.out.println("\"기원전 "+year+"."+month+"."+day+"\"");
        }else {
        	System.out.println("\"기원후 "+year+"."+month+"."+day+"\"");
        }
		
	}
	void print2(boolean yy) {
		 String em;
	        switch (month) {
	            case 1:  em = "January";
	                     break;
	            case 2:  em = "February";
	                     break;
	            case 3: em = "March";
	                     break;
	            case 4:  em = "April";
	                     break;
	            case 5:  em = "May";
	                     break;
	            case 6:  em = "June";
	                     break;
	            case 7:  em = "July";
	                     break;
	            case 8:  em = "August";
	                     break;
	            case 9:  em = "September";
	                     break;
	            case 10: em = "October";
	                     break;
	            case 11: em = "November";
	                     break;
	            case 12: em = "December";
	                     break;
	            default: em = "잘못입력하셨습니다.";
	                     break;
	        }
	        if(yy==true) {
	        	System.out.println("\""+em+" "+day+" BC"+year+"\"");
	        }else {
	        	System.out.println("\""+em+" "+day+" AD"+year+"\"");
	        }
	        
	}

}
