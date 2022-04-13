package javaweek5_1;

public class Answer_01 {
	public static void play(Animal ani) { //Animal매개변수로 baby dog 전부 처리  상속, 메소드 재정의 일때
		ani.run();
		ani.sound();
	}//메소드 만들어줌

	public static void main(String[] args) {
		Animal animal = new Baby("신생아");
		play(animal); //Baby객체
		animal = new Dog("강아지");
		play(animal); //Dog객체
	}
}//다형성
