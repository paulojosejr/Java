package fundamentals;

import java.util.Scanner;

public class ConversionChallenge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type your first salary: ");
		String s1 = sc.nextLine().replaceAll(",",".");
		System.out.println("Type your second salary: ");
		String s2 = sc.nextLine().replaceAll(",",".");
		System.out.println("Type your third salary: ");
		String s3 = sc.nextLine().replaceAll(",",".");
		
		Double avg = ((Double.parseDouble(s1) + Double.parseDouble(s2) + Double.parseDouble(s3)) / 3);
		System.out.println("The average salary is: " + avg);
		sc.close();
	}
}
