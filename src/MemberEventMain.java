
public class MemberEventMain {
	public static void main(String[] args) {
		
		//�ڽ�Ŭ������ �����ڷ� �ν��Ͻ��� ������ ��� �θ�Ŭ������
		//�����ڰ� ���� ȣ��Ǿ� �θ�Ŭ������ �ν��Ͻ��� �޸𸮿� ����
		//���� �� �� �ڽ� Ŭ������ �����ڰ� ȣ��Ǿ� �ڽ� Ŭ������ �ν��Ͻ� ����
		// => �⺻������ �θ� Ŭ������ �⺻ ������ ȣ��
		//�ڽ�Ŭ������ ������ ���������� �ڽ�Ŭ���� �ν��Ͻ��� �ʵ�
		//�Ǵ� �޼ҵ带 ����� �� ������ �ʵ� �Ǵ� �޼ҵ尡 ��������
		//���� ��� �θ� Ŭ�����ν��Ͻ��� �ʵ� �Ǵ� �޼ҵ� ���
		MemberEvent member1 = new MemberEvent();
		
		member1.setId("abc");
		member1.setPassword("1234");
		member1.setName("ȫ�浿");
		member1.setEmail("abc@daum.net");
		
		member1.display();
		
		MemberEvent member2 = new MemberEvent("xyz", "5678", "�Ӳ���", "xyz@naver.com");
	}
}
