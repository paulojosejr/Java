package control;

import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String typed = "";
		
		System.out.println("Type something or exit to end the program: ");
		
		while(!typed.equalsIgnoreCase("exit")) {
			System.out.print("You typed: ");
			typed = sc.nextLine();
		}
		
		sc.close();
	}
}
