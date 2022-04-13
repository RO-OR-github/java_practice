package javaweek6practice_2;

public class SmartPhone implements RemoteControl  {
	public void turnOn() {
		System.out.println("SmartPhone을 켭니다");
	}
	public void turnOff() {
		System.out.println("SmartPhone을 끕니다");
	}
	public void setVolume(int volume) {
		System.out.println("----- SmartPhone 불륨을 "+volume+"으로 합니다. -----");
		System.out.println("현재 SmartPhone 불륨: "+volume);
	}
	
	public void setMute(boolean mute) {
		if(mute) {
			System.out.println("----- TVSmartPhone 불륨을 무음 으로 합니다. -----");
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}

}
