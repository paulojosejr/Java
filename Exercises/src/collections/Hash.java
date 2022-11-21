package collections;

import java.util.HashSet;

public class Hash {
	public static void main(String[] args) {
		HashSet<User> users = new HashSet<>();
		
		users.add(new User("Juliana"));
		users.add(new User("Lucas"));
		users.add(new User("Junia"));
		users.add(new User("Paulo"));
		
		System.out.println(users.contains(new User("Paulo")));
		System.out.println(users.contains(new User("Junia")));
		System.out.println(users.contains(new User("Leon")));
	}
}
