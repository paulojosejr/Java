package fundamentals;

public class PointNotation {
	public static void main(String[] args) {
		String s = "Good morning X";
		s = s.replace("X", "Lady");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);
		
		String y = "Good morning X".replace("X", "Jhon").toUpperCase().concat("!!!");
		System.out.println(y);
	}
}
