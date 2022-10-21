package fundamentals.operators;

import java.util.Scanner;

public class StringEquals {
	public static void main(String[] args) {
		System.out.println("2" == "2");
		
		String s1 = new String("2");
		System.out.println("2" == s1);
		System.out.println("2".equals(s1));
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type a number:");
		String s2 = sc.next();
		System.out.println("2" == s2.trim());
		System.out.println("2".equals(s2.trim()));
		
		sc.close();
	}
}