package javaconceptweek6;

public class IControllTest {
	public static void main(String[] args) {
		IControll ic = new IControll() {
			public void play() {
				System.out.println("play");
			}
			public void stop() {
				System.out.println("stop");
			}

		};
		ic.play();
		ic.stop();
	}
	
}