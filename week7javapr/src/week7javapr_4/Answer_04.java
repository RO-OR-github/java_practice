package week7javapr_4;

public class Answer_04 {
	public static void main(String[] args) {
		Func1 sub = (a, b) -> a - b;
		Func1 plus =  (a,b) -> a + b;
		Func1 mp =  (a,b) -> a * b;
		Func1 sq =  (a,b) -> (int)Math.pow(a,b);
		
		System.out.println(sub.calc(1, 2)+"\n"+plus.calc(1, 2)+"\n"+mp.calc(1, 2)+"\n"+sq.calc(1, 2));
	}
}
