// 직원정보(직원번호, 직원이름, 담당부서)를 저장하기 위한 클래스

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
		System.out.println("직원 번호 :  " + getNum());
		System.out.println("직원 이름 :  " + getName());
		System.out.println("담당 부서 :   " +department);
	}
	

}
