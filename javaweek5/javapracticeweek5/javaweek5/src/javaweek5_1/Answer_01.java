package javaweek5_1;

public class Answer_01 {
	public static void play(Animal ani) { //Animal�Ű������� baby dog ���� ó��  ���, �޼ҵ� ������ �϶�
		ani.run();
		ani.sound();
	}//�޼ҵ� �������

	public static void main(String[] args) {
		Animal animal = new Baby("�Ż���");
		play(animal); //Baby��ü
		animal = new Dog("������");
		play(animal); //Dog��ü
	}
}//������
