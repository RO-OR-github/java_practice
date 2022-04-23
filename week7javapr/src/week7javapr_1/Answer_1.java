package week7javapr_1;

public class Answer_1 {
	public static void main(String[] args) {
		//�씡紐� 援ы쁽 媛앹껜
		Action ac = new Action() {
			public void move() {
				System.out.println("�븞�뀞");
			}
		};
		 //�엺�떎�떇 援ы쁽
		Action rac = () -> {
			System.out.println("�븞�뀞 �븞�뀞");
		};
		
		//�씡紐� 援ы쁽 媛앹껜濡� 硫붿냼�뱶 �샇異� �� 蹂몄씤 �옉�꽦
		ac.move();
		
		//�엺�떎�떇�쑝濡� 硫붿냼�뱶 �샇異� �� 蹂몄씤�옉�꽦
		rac.move();
	
	}

}
