package javaprojectweek4_2;

public class Magazine extends Book {
	private String date;
	

	public Magazine(String head, String dir, int page, String date) {
		super(head, dir, page);
		this.date = date;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	
	@Override
	public String toString() {
		return super.toString() +  "\n¹ß¸ÅÀÏ : " + date;
	}

}
