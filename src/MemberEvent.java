
//�̺�Ʈ ���� �������(���̵�,��й�ȣ,�̸�,�̸���)�� �����ϱ� ���� Ŭ����
// => Member Ŭ����(���̵�,��й�ȣ,�̸�)�� ��ӹ޾� �ۼ� : ��� ���� �ʵ�� �޼ҵ� ��� 
public class MemberEvent extends Member{
	
	private String email;
	
	public MemberEvent() {
		// TODO Auto-generated constructor stub
	}

	public MemberEvent(String id, String password, String name, String email) {
		super();
		setId(id);
		setPassword(password);
		setName(name);
		this.email = email;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
//	public void displayEvent() {
///*		System.out.println("���̵� : " + getId());
//		System.out.println("��й�ȣ : " + getPassword());
//		System.out.println("�̸� : " + getName());*/
//		
//		display();
//		System.out.println("�̸��� : " + email);		
//	}
	
	
	// �޼ҵ� �������̵�
	// ��Ӱ����� Ŭ�������� �θ�Ŭ������ �޼ҵ带 ����� �޼ҵ带 �ڽ�Ŭ�������� �缱���Ѵ�. 
	// �θ�Ŭ������ �޼ҵ� �Ӹ��θ� �ڽ�Ŭ�������� �����ϰ� ����
	// �θ�Ŭ���� �޼ҵ�� ��������.(Hide Method)

	
	// @Override -->  annotation : �������̵� ǥ��(API ����) �� ����
	@Override
	public void display() {
		// �θ�Ŭ������ ������ �޼ҵ带 ȣ���� �� super Ű���带 �̿��Ѵ�. 
		super.display();
		System.out.println("�̸��� :  "+ email);
	}
}