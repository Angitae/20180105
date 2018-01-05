
public class InstanceTest {
	public static void main(String[] args) {
			// 부모 클래스 참조변수 = new 부모클래스();
		Member mem = new Member();
		// = > 가능 : 참조변수에 부모클래스의 인스턴스 정보 저장
		// = > 참조변수를 이용하여 부모 클래스의 인스턴스 필드 및 메소드 접근 가능
		mem.setId("aaa");
		mem.setPassword("1111");
		mem.setName("홍길동");
		mem.display();
		System.out.println("==========================");
		
		//자식 클래스 참조변수 = new 자식클래스();
		MemberEvent me = new MemberEvent();
		
		// = > 가능 : 참조변수에 부모클래스의 인스턴스 정보 및 자식클래스의 인스턴스 정보 저장
		// = > 참조변수를 이용하여 자식 클래스의 인스턴스 필드 및 메소드 사용하며
		//        없는 경우 부모클래스의 인스턴스 필드 및 메소드 사용
		
		me.setId("sss");
		me.setEmail("1234@naver.com");
		me.setName("이길동");
		me.setPassword( "54321");
		me.display();
		
//		MemberEvent m3 = new Member();
		// 위와같이는 안되는데 아래와 같이는 할 수 있다.
		// 자식 클래스로 생성된 인스턴스가 없으므로 자식 참조변수에 저장할 경우 에러 발생
	// 묵시적(자동)형변환 : 부모클래스의 메소드 호출시 오버라이드 선언된 메소드인경우 자동으로 자식클래스로 형변환되어
		Member e3 = new MemberEvent();
		e3.setId("ccc");
		e3.setPassword("3333");
		e3.setName("전우치");
//		e3.setEmail
		
		MemberEvent member = (MemberEvent)e3;
		// cast 연산자를 이용한 명시적 객체 형변환
		member.setEmail("dsdawa");
		member.setId("3333");
		member.setName("전우치");
		member.setPassword("123456");
		
		
				}
}


