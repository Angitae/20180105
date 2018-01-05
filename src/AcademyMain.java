//학원 인적자원(학생, 직원, 강사)을 저장하여 관리하기 위한 프로그램

public class AcademyMain {
/*	// 메소드 오버로드
	public static void process(Student student){
		// 학생 정보를 전달받아 처리하기 위한 메소드
		System.out.println("hello student");
	}
	public static void process(Instructor instructor){
		// 강사 정보를 전달받아 처리하기 위한 메소드
		System.out.println("hello instructor");
	}
	public static void process(Staff staff){
		// 직원 정보를 전달받아 처리하기 위한 메소드
		System.out.println("hello staff");
	}*/
	public static void process(Person person){
		// 강사 정보를 전달받아 처리하기 위한 메소드
		System.out.println("hello person");
	}
	
	
	
	public static void main(String[] args) {
//		Student  students[] = new Student[300];
//		Instructor instructors[] = new Instructor[100];
//		Staff staffs[] = new Staff[30];
//		 이거 대신 부모 클래스 이용한다. 

		// 학생, 강사, 직원정보를 저장하기 위한 배열 
		// Persont 클래스는 Student, Instructor, Staff 클래스의 부모라서.
		Person persons[] = new Person[5];
		
		persons[0] =new Student("stu001", "이호준", "자바취업");
		persons[1] = new Instructor("inst001", "임꺽정", "자바 과목");
		persons[2] = new Staff("sta001", "춘향이" , "비서");
		persons[3] = new Student("stu001", "장길산", "오라클취업");
		persons[4] = new Staff("sta002", "일지매", "영업부");
		
/*		for(int i = 0; i< 5; i++){
			persons[i].display();
		}*/
		 for(Person person:persons){
		if( person instanceof Student)
			System.out.println("=====<학생 정보>====");
			// instanceof  연산자 : 참조변수로 참조 가능한 클래스인 경우 true 반환 
		if( person instanceof Instructor)
		System.out.println("=====<강사 정보>====");
		if( person instanceof Staff)
			System.out.println("=====<직원 정보>====");
		person.display();
	}
		// 묵시적 객체 형변환에 의해 Person 클래스의 메소드가 아닌 
		// 자식클래스의 오버라이드 선언된 메소드 호출
		// 부모 클래스의 참조변수에 저장된 자식클래스의 인스턴스에 
		// 따라 다른 자식클래스의 메소드가 호출된다. 
		// -> 오버라이드에 의한 다형성 
		 
		 // 파라메터에 전달되는 정보에 따라 다른 메소드가 호출된다. 
		 // -> 메소드 오버로드에 의한 다형성
		 process(new Student());
		 process(new Instructor());
		 process(new Staff());
	}
}
