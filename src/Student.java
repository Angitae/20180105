// �л�����(��ȣ, �̸�, ��������)�� �����ϱ� ���� Ŭ���� 
// �л���ȣ, �л��̸��� ���� ������ person Ŭ������ ��ӹ޾� ����Ѵ�.

public class Student extends Person{
		private String course;
		public Student() {
			// TODO Auto-generated constructor stub
		}
		
		public Student(String num, String name, String course) {
			super(num, name);
			this.course = course;
		}

		public String getCourse() {
			return course;
		}

		public void setCourse(String course) {
			this.course = course;
		}
		
		public void display(){
			System.out.println("�л� ��ȣ :  " + getNum());
			System.out.println("�л� �̸� :  " + getName());
			System.out.println("���� ����:   " + course);
		}
		
		
}
