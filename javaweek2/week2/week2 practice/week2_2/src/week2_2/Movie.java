package week2_2;

public class Movie {
	private String moviename, director;
	private double score;
	private int years;
	
	public Movie(String moviename, String director,double score, int years) {
		this.moviename=moviename;
		this.director=director;
		this.score=score;
		this.years=years;
		
	}// 생성자는 초기화를 위해 필드를 불러온다, 생성자를 쓰지않을 경우 null값(default)
	
	void outprint() {
		System.out.println("영화제목 :"+ moviename);
		System.out.println("감독 :"+ director);
		System.out.println("영화평점 : " +score);
		System.out.println("출시연도 : " +years);
	}
}
	



