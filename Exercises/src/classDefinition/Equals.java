package classDefinition;

public class Equals {
	public static void main(String[] args) {
		User u1 = new User();
		u1.name = "Rui Costa";
		u1.email = "rui.costa@mail.com";
		
		User u2 = new User();
		u2.name = "Rui Costa";
		u2.email = "rui.costa@mail.com";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
	}
}
