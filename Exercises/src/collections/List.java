package collections;

import java.util.ArrayList;

public class List {
	public static void main(String[] args) {
		ArrayList <User> users = new ArrayList<>();
		
		User u1 = new User("Ana");
		users.add(u1);
		
		users.add(new User("Rick"));
		users.add(new User("Lucas"));
		users.add(new User("Marcos"));
		users.add(new User("Daryl"));
		users.add(new User("Jeff"));
		
		System.out.println("Bye :( " + users.get(3));
		
		users.remove(1);
		System.out.println(users.remove(new User ("Jeff")));
		
		for(User user: users) {
			System.out.println(user.name);
		}
	}
}
