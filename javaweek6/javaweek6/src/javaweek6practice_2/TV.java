package javaweek6practice_2;

public class TV implements RemoteControl  {
	public void turnOn() {
		System.out.println("TV�� �մϴ�");
	}
	public void turnOff() {
		System.out.println("TV�� ���ϴ�");
	}
	public void setVolume(int volume) {
		System.out.println("----- TV �ҷ��� "+volume+"���� �մϴ�. -----");
		System.out.println("���� TV �ҷ�: "+volume);
	}
	
	public void setMute(boolean mute) {
		if(mute) {
			System.out.println("----- TV �ҷ��� ���� ���� �մϴ�. -----");
			System.out.println("���� ó���մϴ�.");
		} else {
			System.out.println("���� �����մϴ�.");
		}
	}

}