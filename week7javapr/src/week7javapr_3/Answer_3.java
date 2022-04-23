package week7javapr_3;

public class Answer_3 {
	public static void run(Operation oper) {
		oper.cut();
		oper.wash();
		if (oper instanceof Hair) {//형검사
			((Hair) oper).tint("brown");
		}
		else if (oper instanceof Fruit) {//형검사
			((Fruit)oper).pack(10);
		}else {
			
		}
	}
	public static void main(String[] args) {
		Operation oper=null;
		oper=new Hair("긴 머리");
		run(oper);  //run 메소드는 본인 작성
		oper=new Fruit("사과");
		run(oper);  //run 메소드는 본인 작성
	}

}
