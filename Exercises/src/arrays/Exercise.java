package arrays;

import java.util.Arrays;

public class Exercise {
	public static void main(String[] args) {
	
		double[] studentGradeA = new double[4];
		studentGradeA[0] = 7.9;
		studentGradeA[1] = 6;
		studentGradeA[2] = 6.6;
		studentGradeA[3] = 8.6;
		
		System.out.println(Arrays.toString(studentGradeA));
		
		double totalStudentA = 0;
		for(int i = 0; i < studentGradeA.length; i++) {
			totalStudentA += studentGradeA[i];
		}
		System.out.println("Average: " + totalStudentA / studentGradeA.length);
		
		double [] studentGradeB = {8.5, 7.7, 9.6, 3.5};
		System.out.println(Arrays.toString(studentGradeB));
		
		double totalStudentB = 0;
		for (int i = 0; i < studentGradeB.length; i++) {
			totalStudentB += studentGradeB[i];	
		}
		System.out.println("Average: " + totalStudentB / studentGradeB.length);
	}
}
