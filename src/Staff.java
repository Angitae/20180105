// ��������(������ȣ, �����̸�, ���μ�)�� �����ϱ� ���� Ŭ����

public class Staff extends Person {
	private String department;
	
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Staff(String num, String name, String department) {
		super(num, name);
		this.department = department;
	}

	public Staff() {
		// TODO Auto-generated constructor stub
	}
	public void display(){
		System.out.println("���� ��ȣ :  " + getNum());
		System.out.println("���� �̸� :  " + getName());
		System.out.println("��� �μ� :   " +department);
	}
	

}
