
//이벤트 관련 멤버정보(아이디,비밀번호,이름,이메일)를 저장하기 위한 클래스
// => Member 클래스(아이디,비밀번호,이름)를 상속받아 작성 : 상속 받은 필드와 메소드 사용 
public class MemberEvent extends Member{
	
	private String email;
	
	public MemberEvent() {
		// TODO Auto-generated constructor stub
	}

	public MemberEvent(String id, String password, String name, String email) {
		super();
		setId(id);
		setPassword(password);
		setName(name);
		this.email = email;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
//	public void displayEvent() {
///*		System.out.println("아이디 : " + getId());
//		System.out.println("비밀번호 : " + getPassword());
//		System.out.println("이름 : " + getName());*/
//		
//		display();
//		System.out.println("이메일 : " + email);		
//	}
	
	
	// 메소드 오버라이드
	// 상속관계의 클래스에서 부모클래스의 메소드를 대신할 메소드를 자식클래스에서 재선언한다. 
	// 부모클래스의 메소드 머릿부를 자식클래스에서 동일하게 선언
	// 부모클랫의 메소드는 숨겨진다.(Hide Method)

	
	// @Override -->  annotation : 오버라이드 표현(API 문서) 및 제약
	@Override
	public void display() {
		// 부모클래스의 숨겨진 메소드를 호출할 때 super 키워드를 이용한다. 
		super.display();
		System.out.println("이메일 :  "+ email);
	}
}