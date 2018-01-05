// 인적자원에 관련된 정보를 저장하는 클래스가 반드시 상속받아야한다.
public class Person {
	private String num;
	private String name;public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(String num, String name) {
		super();
		this.num = num;
		this.name = name;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void display(){
		System.out.println(" 번호 : "+  num);
		System.out.println(" 이름 : "+  name);
	}
}
