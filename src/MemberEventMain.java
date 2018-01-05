
public class MemberEventMain {
	public static void main(String[] args) {
		
		//자식클래스의 생성자로 인스턴스를 생성할 경우 부모클래스의
		//생성자가 먼저 호출되어 부모클래스의 인스턴스를 메모리에 먼저
		//생성 한 후 자식 클래스의 생성자가 호출되어 자식 클래스의 인스턴스 생성
		// => 기본적으로 부모 클래스의 기본 생성자 호출
		//자식클래스로 생성된 참조변수는 자식클래스 인스턴스의 필드
		//또는 메소드를 사용할 수 있으며 필드 또는 메소드가 존재하지
		//않을 경우 부모 클래스인스턴스의 필드 또는 메소드 사용
		MemberEvent member1 = new MemberEvent();
		
		member1.setId("abc");
		member1.setPassword("1234");
		member1.setName("홍길동");
		member1.setEmail("abc@daum.net");
		
		member1.display();
		
		MemberEvent member2 = new MemberEvent("xyz", "5678", "임꺽정", "xyz@naver.com");
	}
}
