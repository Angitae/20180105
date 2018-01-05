
public class MemberMain {
	public static void main(String[] args) {
		Member member1 = new Member();
		
		member1.setId("abc");
		member1.setPassword("1234");
		member1.setName("È«±æµ¿");
		
		member1.display();
		
		System.out.println("-------------------");
		Member member2 = new Member("xyz","5678","ÀÓ²©Á¤");
		member2.display();
	}
}
