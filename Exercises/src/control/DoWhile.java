package control;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String text = "";
		do {
			System.out.println("You have to find the magic words.");
			System.out.println("Wanna Leave?");
			text = sc.nextLine();
		}while(!text.equalsIgnoreCase("Please"));

		sc.close();
	}
}
