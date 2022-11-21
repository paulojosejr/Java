package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Maps {
	public static void main(String[] args) {
		Map<Integer, String> users = new HashMap<>();
		
		users.put(1, "Robert");
		users.put(2, "Lucas");
		users.put(3, "Juliana");
		users.put(4, "Patrick");
		users.put(5, "Jon");
		users.put(6, "Rick");
		users.put(7, "Daryl");
		users.put(8, "Mack");
		
		System.out.println(users.size());
		System.out.println(users.isEmpty());
		
		System.out.println(users.keySet());
		System.out.println(users.values());
		System.out.println(users.entrySet());
		
		System.out.println(users.containsKey(5));
		System.out.println(users.containsValue("Juliana"));
		
		System.out.println(users.get(2));
		
		for(int key: users.keySet()) {
			System.out.println(key);
		}
		
		for(String value: users.values()) {
			System.out.println(value);
		}
		
		for(Entry<Integer, String> user: users.entrySet()) {
			System.out.print(user.getKey() + " : ");
			System.out.println(user.getValue());
		}
	}
}
