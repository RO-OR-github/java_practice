package week7javapr_3;

public class Answer_3 {
	public static void run(Operation oper) {
		oper.cut();
		oper.wash();
		if (oper instanceof Hair) {//���˻�
			((Hair) oper).tint("brown");
		}
		else if (oper instanceof Fruit) {//���˻�
			((Fruit)oper).pack(10);
		}else {
			
		}
	}
	public static void main(String[] args) {
		Operation oper=null;
		oper=new Hair("�� �Ӹ�");
		run(oper);  //run �޼ҵ�� ���� �ۼ�
		oper=new Fruit("���");
		run(oper);  //run �޼ҵ�� ���� �ۼ�
	}

}
