package week7javapr_2;
import java.util.Scanner; 

public class Answer_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("기기를 선택하세요");
		System.out.print("1: MP3 2:CDPlay 3: WindowMediaPlay >>");
		String instru = sc.next();
		
		Media md = new Media() {
			
			void play(String instru) {
				if(instru.equals("1")) {
					System.out.println("MP3를 재생합니다.");
				}else if(instru.equals("2")) {
					System.out.println("CDPlay를 재생합니다.");
				}else if(instru.equals("3")) {
					System.out.println("WindowMediaPlay를 재생합니다.");
				}else {
					System.out.println("잘못입력하셨습니다.");
				}
			}
			
			void stop(String instru) {
				if(instru.equals("1")) {
					System.out.println("MP3를 중지합니다.");
				}else if(instru.equals("2")) {
					System.out.println("CDPlay를 중지합니다.");
				}else if(instru.equals("3")) {
					System.out.println("WindowMediaPlay를 중지합니다.");
				}else {
					System.out.println("잘못입력하셨습니다.");
				}
			}
		};
		
		md.play(instru);
		md.stop(instru);
		
		sc.close();
	}
}
