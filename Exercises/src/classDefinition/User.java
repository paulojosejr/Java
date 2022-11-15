package classDefinition;

public class User {
	String name;
	String email;
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof User) {
			User another = (User) obj;
			
			boolean sameName = another.name.equals(this.name);
			boolean sameEmail = another.email.equals(this.email);
			
			return sameName && sameEmail;
		}else {
			return false;
		}
	}
}
