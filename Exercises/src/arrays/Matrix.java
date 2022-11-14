package arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many students?");
		int numberOfStudents = sc.nextInt();
		
		System.out.println("How many grades per student?");
		int numberOfGrades = sc.nextInt();
		
		double[][] grades = new double [numberOfStudents][numberOfGrades];
		
		double total = 0;
		for (int i = 0; i < grades.length; i++) {
			for (int j = 0; j < grades[i].length; j++) {
				System.out.printf("Type the %d student %d grade: ", i + 1, j + 1);
				
				grades[i][j] = sc.nextDouble();
				total += grades[i][j];
			}
		}
		
		double avg = total / (numberOfStudents * numberOfGrades);
		System.out.println("The average is: " + avg);
		
		for(double[] allGrades: grades) {
			System.out.println(Arrays.toString(allGrades));
		}
		
		sc.close();
	}
}
