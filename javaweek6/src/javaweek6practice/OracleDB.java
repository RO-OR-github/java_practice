package javaweek6practice;

public class OracleDB implements DataAccessObject {
	//�����۾� ��üȭ�۾�(������), �������̽��� �����Ϸ��� �ڵ����� public ���������ڸ� ����
	//�׷��� ������ �Ҷ� ������ �ܰ��� default�� ��������
	//��Ӱ� ���� �۾��� ���ÿ� �Ҷ��� ����� ���� ���ش�.
	public void select() {
		System.out.println("Oracle DB���� �˻�");
	}
	public void insert() {
		System.out.println("Oracle DB���� ����");
	}
	public void update() {
		System.out.println("Oracle DB���� ����");
	}
	public void delete() {
		System.out.println("Oracle DB���� ����");
    }
}