
public class InstanceTest {
	public static void main(String[] args) {
			// �θ� Ŭ���� �������� = new �θ�Ŭ����();
		Member mem = new Member();
		// = > ���� : ���������� �θ�Ŭ������ �ν��Ͻ� ���� ����
		// = > ���������� �̿��Ͽ� �θ� Ŭ������ �ν��Ͻ� �ʵ� �� �޼ҵ� ���� ����
		mem.setId("aaa");
		mem.setPassword("1111");
		mem.setName("ȫ�浿");
		mem.display();
		System.out.println("==========================");
		
		//�ڽ� Ŭ���� �������� = new �ڽ�Ŭ����();
		MemberEvent me = new MemberEvent();
		
		// = > ���� : ���������� �θ�Ŭ������ �ν��Ͻ� ���� �� �ڽ�Ŭ������ �ν��Ͻ� ���� ����
		// = > ���������� �̿��Ͽ� �ڽ� Ŭ������ �ν��Ͻ� �ʵ� �� �޼ҵ� ����ϸ�
		//        ���� ��� �θ�Ŭ������ �ν��Ͻ� �ʵ� �� �޼ҵ� ���
		
		me.setId("sss");
		me.setEmail("1234@naver.com");
		me.setName("�̱浿");
		me.setPassword( "54321");
		me.display();
		
//		MemberEvent m3 = new Member();
		// ���Ͱ��̴� �ȵǴµ� �Ʒ��� ���̴� �� �� �ִ�.
		// �ڽ� Ŭ������ ������ �ν��Ͻ��� �����Ƿ� �ڽ� ���������� ������ ��� ���� �߻�
	// ������(�ڵ�)����ȯ : �θ�Ŭ������ �޼ҵ� ȣ��� �������̵� ����� �޼ҵ��ΰ�� �ڵ����� �ڽ�Ŭ������ ����ȯ�Ǿ�
		Member e3 = new MemberEvent();
		e3.setId("ccc");
		e3.setPassword("3333");
		e3.setName("����ġ");
//		e3.setEmail
		
		MemberEvent member = (MemberEvent)e3;
		// cast �����ڸ� �̿��� ����� ��ü ����ȯ
		member.setEmail("dsdawa");
		member.setId("3333");
		member.setName("����ġ");
		member.setPassword("123456");
		
		
				}
}


