package javaweek6practice_2;

public class SmartPhone implements RemoteControl  {
	public void turnOn() {
		System.out.println("SmartPhone�� �մϴ�");
	}
	public void turnOff() {
		System.out.println("SmartPhone�� ���ϴ�");
	}
	public void setVolume(int volume) {
		System.out.println("----- SmartPhone �ҷ��� "+volume+"���� �մϴ�. -----");
		System.out.println("���� SmartPhone �ҷ�: "+volume);
	}
	
	public void setMute(boolean mute) {
		if(mute) {
			System.out.println("----- TVSmartPhone �ҷ��� ���� ���� �մϴ�. -----");
			System.out.println("���� ó���մϴ�.");
		} else {
			System.out.println("���� �����մϴ�.");
		}
	}

}
