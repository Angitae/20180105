// �����ڿ��� ���õ� ������ �����ϴ� Ŭ������ �ݵ�� ��ӹ޾ƾ��Ѵ�.
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
		System.out.println(" ��ȣ : "+  num);
		System.out.println(" �̸� : "+  name);
	}
}
