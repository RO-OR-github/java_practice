package week7javapr_2;
import java.util.Scanner; 

public class Answer_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��⸦ �����ϼ���");
		System.out.print("1: MP3 2:CDPlay 3: WindowMediaPlay >>");
		String instru = sc.next();
		
		Media md = new Media() {
			
			void play(String instru) {
				if(instru.equals("1")) {
					System.out.println("MP3�� ����մϴ�.");
				}else if(instru.equals("2")) {
					System.out.println("CDPlay�� ����մϴ�.");
				}else if(instru.equals("3")) {
					System.out.println("WindowMediaPlay�� ����մϴ�.");
				}else {
					System.out.println("�߸��Է��ϼ̽��ϴ�.");
				}
			}
			
			void stop(String instru) {
				if(instru.equals("1")) {
					System.out.println("MP3�� �����մϴ�.");
				}else if(instru.equals("2")) {
					System.out.println("CDPlay�� �����մϴ�.");
				}else if(instru.equals("3")) {
					System.out.println("WindowMediaPlay�� �����մϴ�.");
				}else {
					System.out.println("�߸��Է��ϼ̽��ϴ�.");
				}
			}
		};
		
		md.play(instru);
		md.stop(instru);
		
		sc.close();
	}
}
