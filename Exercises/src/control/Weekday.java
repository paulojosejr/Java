package control;

import java.util.Scanner;

public class Weekday {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Type a day of the week:");
		String weekday = sc.next();
		
		if(weekday.equalsIgnoreCase("sunday")) System.out.println("1");
		if(weekday.equalsIgnoreCase("monday")) System.out.println("2");
		if(weekday.equalsIgnoreCase("tuesday")) System.out.println("3");
		if(weekday.equalsIgnoreCase("wednesday")) System.out.println("4");
		if(weekday.equalsIgnoreCase("thursday")) System.out.println("5");
		if(weekday.equalsIgnoreCase("friday")) System.out.println("6");
		if(weekday.equalsIgnoreCase("saturday")) System.out.println("7");
		
		sc.close();
	}
}
