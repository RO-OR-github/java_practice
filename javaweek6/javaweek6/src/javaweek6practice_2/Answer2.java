package javaweek6practice_2;

public class Answer2 {
	public static void main(String[] args) {
		RemoteControl tv = new TV();
		RemoteControl sm = new SmartPhone();
		
		tv.turnOn();
		tv.setVolume(10);
		tv.setMute(true);
		
		sm.turnOn();
		sm.setVolume(50);
		RemoteControl.changeBattery();
	}
}