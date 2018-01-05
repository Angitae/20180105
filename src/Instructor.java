// 강사 정보(강사번호, 강사이름, 강의과목)를 저장하기 위한 클래스
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
			System.out.println("강사 번호 :  " + getNum());
			System.out.println("강사 이름 :  " + getName());
			System.out.println("강사 과목 :   " + subject);
		}
		
}
