
//��� ����(���̵�,��й�ȣ,�̸�)�� �����ϱ� ���� Ŭ����
public class Member {
	private String id;
	private String password;
	private String name;
	
	//ctrl+space
	public Member() {
		// TODO Auto-generated constructor stub
	}
	//alt+shift+s -> o
	public Member(String id, String password, String name) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
	}
	//alt+shift+s -> r
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println("���̵� : " + id);
		System.out.println("��й�ȣ : " + password);
		System.out.println("�̸� : " + name);
	}
}
