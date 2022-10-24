package control;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Type your average: ");
		double average = sc.nextDouble();
		
		if(average <= 20 && average >= 10.0) {
			System.out.println("Approved!");
			System.out.println("Congratulations!");
		}
		
		if(average < 10 && average >= 7) System.out.println("Failed, you need to do the Retake test.");
		
		if(average < 7 && average >= 0) System.out.println("Failed.");
		
		sc.close();
	}
}
