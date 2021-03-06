package javaweek3practice;

public class Student {
	private String name;
	private double score;
	private String grade;
//	private static int cnt; 몇 번 불려왔는지 나중에 셀때 사용
	
	public Student() {
		this("anonymous", 0.0);
	}
	//필드에 대입하는 값은 다르지만 같은 생성자들이 여러번 생성되었을때
	//오버로딩된 생성자호출을 해준다.
	//초기화 값을 가독성 좋게 하기위해
    public Student(String name, double score) {
		this.name = name;
		this.score = score;
		grade=method();
        
	}

	//float는 형변환을 해주어야 하기때문에 주로 double을 사용
	@Override //우클릭 source에서 이미만들어진 메소드 사용
	public String toString() {
		return "Student [이름=" + name + ", 성적=" + score + ", 등급=" + method() + "]";
	}
	
	//등급 계산메소드 작성, 캡슐화
    String method() {
		if(score<70)
			return "F";
		else if(score>=70 && score<75) 
			return "C";
		else if(score>=75 && score<80)
	    	return "B";
	    else if(score>=80 && score<90)
	    	return "B+";
	    else if(score>=90 && score<95)
	    	return "A";
	    else
	    	return "A+";
					
	}
	//getter ,setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		if(score <0)
			return; //유효성검사 돌려보내라
		this.score = score;
	}
	
	
}
