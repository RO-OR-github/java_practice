package javaprojectweek4_2;

public class Book {
	//Book Ŭ������ ����, ��������, ����
	private String head, dir;
	private int page;
	
	public Book() {} //�ƹ��͵� �Է� ���� �ʾ����� �� ��� �ؼ� default�����ڸ� ������ָ� ����.
	
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
		return "å�̸� : "+getHead()+
				"\n�������� : "+getPage()+
				"\n���� : "+getDir();
	}
	
}
