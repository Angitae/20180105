// ���� ����(�����ȣ, �����̸�, ���ǰ���)�� �����ϱ� ���� Ŭ����
public class Instructor extends Person{
		private String subject;
		public Instructor() {
			// TODO Auto-generated constructor stub
		}
		public Instructor(String num, String name, String subject) {
			super(num, name);
			this.subject = subject;
		}
		public String getSubject() {
			return subject;
		}
		public void setSubject(String subject) {
			this.subject = subject;
		}
		
		@ Override
		public void display(){
			System.out.println("���� ��ȣ :  " + getNum());
			System.out.println("���� �̸� :  " + getName());
			System.out.println("���� ���� :   " + subject);
		}
		
}
