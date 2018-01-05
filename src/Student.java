// 학생정보(번호, 이름, 수강과정)를 저장하기 위한 클래스 
// 학생번호, 학생이름에 대한 정보는 person 클래스를 상속받아 사용한다.

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
			System.out.println("학생 번호 :  " + getNum());
			System.out.println("학생 이름 :  " + getName());
			System.out.println("수강 과정:   " + course);
		}
		
		
}
