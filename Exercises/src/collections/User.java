package collections;

import java.util.Objects;

public class User {
	String name;
	
	User(String name){
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "My name is " + this.name + ".";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(name, other.name);
	}
}
