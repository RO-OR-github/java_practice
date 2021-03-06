package week2_4;


/*4.	다음의 내용을 클래스(CellPhone)로 작성하시오.
- 핸드폰에는 폰 번호와 현재 전원의 상태를 저장하고 있다. 
- 폰이 처음 생성될 때는 폰 번호를 저장하고, 현재의 전원 상태를 on상태(true)로 한다. 
- 기능으로는 전원 버튼을 누를 때 마다 현재의 전원 상태를 토글(on(true)/off(false)) 한다. 
- 현재 객체 상태를 문자열로 리턴한다.
- telNum, power, getCount(), toString(), powerToggle()
*/

public class CellPhone {
	private String telNum;
	private boolean power=true;
	private int Count=0;

	
	public CellPhone(String telNum) {
		 this.telNum = telNum;
	}
	public String toString() {
		if(power=power) {
		    return "폰 번호 : "+telNum+"\n전원 : on"; 
	    }else {
		    return "폰 번호 : "+telNum+"\n전원 : off";
	    }
	}
	void powerToggle(){
		++Count;
		if(Count%2<=0) {
			power = true;
			System.out.println("전원이 켜졌습니다.");		
		}else {
			power = false;
			System.out.println("전원이 꺼졌습니다.");
		}
	}
	int getCount() {
		return Count;
	}

		
	
		
}



 


