package week2; //이름을 만들때 java단어 하나로만 만들지 말것, 이것이 없거나 이름을 바꾸면 실행하는데 문제가 생김
// 한소스 안에 두가지 클래스가 있다면 pubㅣic을 main에 붙여 줘야 한다.

public class Shoes {
	private int size, cnt;  //필드에대한건 90프로 이상 정보은닉 수정은 하나의 통로로만 가능하게 private
	private String type;    //접근제한자 private 외부접근 못하게
	public Shoes(int size, int cnt, String type) { //생성자는 클래스이름과 같아야함
	//자료형과 더불어 변수도  //필드명과 매개변수 구분을 위해 this(현재의 나) 를 써준다. 
		this.size=size; //관례적으로 필드명과 매개변수 명을 같게 함
		this.cnt=cnt;
		this.type=type;
		//디폴트 생성자가 필요하면 선언 해줘야 한다.
		//생성자는 void라는 키워드를 쓰면 안된다.
	}
	//객체 내용을 문자열로 반환 tostring의 역할
	//객체내용 (현재 필드가 어떤값들을 가지고 있냐)
	public String toString() { //메소드 재정
		return "Shoes[size = " +size+ ", cnt= "+cnt+ ",type="+type+"]";
	}
	
	void sell(int num1) {
		cnt -= num1;
	}
	
	void add(int num2) {
		cnt += num2;
	}

	
	
	
	int getCnt() { //getter메소드
		return cnt;
	}
	
	

}
