//�п� �����ڿ�(�л�, ����, ����)�� �����Ͽ� �����ϱ� ���� ���α׷�

public class AcademyMain {
/*	// �޼ҵ� �����ε�
	public static void process(Student student){
		// �л� ������ ���޹޾� ó���ϱ� ���� �޼ҵ�
		System.out.println("hello student");
	}
	public static void process(Instructor instructor){
		// ���� ������ ���޹޾� ó���ϱ� ���� �޼ҵ�
		System.out.println("hello instructor");
	}
	public static void process(Staff staff){
		// ���� ������ ���޹޾� ó���ϱ� ���� �޼ҵ�
		System.out.println("hello staff");
	}*/
	public static void process(Person person){
		// ���� ������ ���޹޾� ó���ϱ� ���� �޼ҵ�
		System.out.println("hello person");
	}
	
	
	
	public static void main(String[] args) {
//		Student  students[] = new Student[300];
//		Instructor instructors[] = new Instructor[100];
//		Staff staffs[] = new Staff[30];
//		 �̰� ��� �θ� Ŭ���� �̿��Ѵ�. 

		// �л�, ����, ���������� �����ϱ� ���� �迭 
		// Persont Ŭ������ Student, Instructor, Staff Ŭ������ �θ��.
		Person persons[] = new Person[5];
		
		persons[0] =new Student("stu001", "��ȣ��", "�ڹ����");
		persons[1] = new Instructor("inst001", "�Ӳ���", "�ڹ� ����");
		persons[2] = new Staff("sta001", "������" , "��");
		persons[3] = new Student("stu001", "����", "����Ŭ���");
		persons[4] = new Staff("sta002", "������", "������");
		
/*		for(int i = 0; i< 5; i++){
			persons[i].display();
		}*/
		 for(Person person:persons){
		if( person instanceof Student)
			System.out.println("=====<�л� ����>====");
			// instanceof  ������ : ���������� ���� ������ Ŭ������ ��� true ��ȯ 
		if( person instanceof Instructor)
		System.out.println("=====<���� ����>====");
		if( person instanceof Staff)
			System.out.println("=====<���� ����>====");
		person.display();
	}
		// ������ ��ü ����ȯ�� ���� Person Ŭ������ �޼ҵ尡 �ƴ� 
		// �ڽ�Ŭ������ �������̵� ����� �޼ҵ� ȣ��
		// �θ� Ŭ������ ���������� ����� �ڽ�Ŭ������ �ν��Ͻ��� 
		// ���� �ٸ� �ڽ�Ŭ������ �޼ҵ尡 ȣ��ȴ�. 
		// -> �������̵忡 ���� ������ 
		 
		 // �Ķ���Ϳ� ���޵Ǵ� ������ ���� �ٸ� �޼ҵ尡 ȣ��ȴ�. 
		 // -> �޼ҵ� �����ε忡 ���� ������
		 process(new Student());
		 process(new Instructor());
		 process(new Staff());
	}
}
