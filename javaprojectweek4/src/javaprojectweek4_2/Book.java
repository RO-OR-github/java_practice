package javaprojectweek4_2;

public class Book {
	//Book 클래스는 제목, 페이지수, 저자
	private String head, dir;
	private int page;
	
	public Book() {} //아무것도 입력 받지 않았을때 를 대비 해서 default생성자를 만들어주면 좋다.
	
	public Book(String head, String dir, int page) {
		this.head = head;
		this.dir = dir;
		this.page = page;
		
	}

	public String getHead() {
		return head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	public String getDir() {
		return dir;
	}

	public void setDir(String dir) {
		this.dir = dir;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	@Override
	public String toString() {
		return "책이름 : "+getHead()+
				"\n페이지수 : "+getPage()+
				"\n저자 : "+getDir();
	}
	
}
