package week7javapr_6;

public class Answer_06 {
	public static void main(String[] args) {
		NestStudent obj[] = { new NestStudent("ȫ�浿", 2), new NestStudent("�Ӳ���", 3),new NestStudent("��û��", 1) };
		for (NestStudent ns : obj)
			ns.stdPrint();
	}

}
