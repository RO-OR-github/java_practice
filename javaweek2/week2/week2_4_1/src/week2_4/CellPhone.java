package week2_4;


/*4.	������ ������ Ŭ����(CellPhone)�� �ۼ��Ͻÿ�.
- �ڵ������� �� ��ȣ�� ���� ������ ���¸� �����ϰ� �ִ�. 
- ���� ó�� ������ ���� �� ��ȣ�� �����ϰ�, ������ ���� ���¸� on����(true)�� �Ѵ�. 
- ������δ� ���� ��ư�� ���� �� ���� ������ ���� ���¸� ���(on(true)/off(false)) �Ѵ�. 
- ���� ��ü ���¸� ���ڿ��� �����Ѵ�.
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
		    return "�� ��ȣ : "+telNum+"\n���� : on"; 
	    }else {
		    return "�� ��ȣ : "+telNum+"\n���� : off";
	    }
	}
	void powerToggle(){
		++Count;
		if(Count%2<=0) {
			power = true;
			System.out.println("������ �������ϴ�.");		
		}else {
			power = false;
			System.out.println("������ �������ϴ�.");
		}
	}
	int getCount() {
		return Count;
	}

		
	
		
}



 


