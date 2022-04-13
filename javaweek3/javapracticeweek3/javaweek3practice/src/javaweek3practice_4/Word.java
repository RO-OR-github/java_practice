package javaweek3practice_4;

public class Word {
	private String en, ko;

	public Word(String en, String ko) {
		this.en = en;
		this.ko = ko;
	}

	public String getEn() {
		return en;
	}

	public String getKo() {
		return ko;
	}

	@Override
	public String toString() {
		return en+" : "+ko;
	}

	
}
