package week2; //�̸��� ���鶧 java�ܾ� �ϳ��θ� ������ ����, �̰��� ���ų� �̸��� �ٲٸ� �����ϴµ� ������ ����
// �Ѽҽ� �ȿ� �ΰ��� Ŭ������ �ִٸ� pub��ic�� main�� �ٿ� ��� �Ѵ�.

public class Shoes {
	private int size, cnt;  //�ʵ忡���Ѱ� 90���� �̻� �������� ������ �ϳ��� ��ηθ� �����ϰ� private
	private String type;    //���������� private �ܺ����� ���ϰ�
	public Shoes(int size, int cnt, String type) { //�����ڴ� Ŭ�����̸��� ���ƾ���
	//�ڷ����� ���Ҿ� ������  //�ʵ���� �Ű����� ������ ���� this(������ ��) �� ���ش�. 
		this.size=size; //���������� �ʵ���� �Ű����� ���� ���� ��
		this.cnt=cnt;
		this.type=type;
		//����Ʈ �����ڰ� �ʿ��ϸ� ���� ����� �Ѵ�.
		//�����ڴ� void��� Ű���带 ���� �ȵȴ�.
	}
	//��ü ������ ���ڿ��� ��ȯ tostring�� ����
	//��ü���� (���� �ʵ尡 ������� ������ �ֳ�)
	public String toString() { //�޼ҵ� ����
		return "Shoes[size = " +size+ ", cnt= "+cnt+ ",type="+type+"]";
	}
	
	void sell(int num1) {
		cnt -= num1;
	}
	
	void add(int num2) {
		cnt += num2;
	}

	
	
	
	int getCnt() { //getter�޼ҵ�
		return cnt;
	}
	
	

}