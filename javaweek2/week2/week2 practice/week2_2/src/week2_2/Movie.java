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
		
	}// �����ڴ� �ʱ�ȭ�� ���� �ʵ带 �ҷ��´�, �����ڸ� �������� ��� null��(default)
	
	void outprint() {
		System.out.println("��ȭ���� :"+ moviename);
		System.out.println("���� :"+ director);
		System.out.println("��ȭ���� : " +score);
		System.out.println("��ÿ��� : " +years);
	}
}
	


