package arrays;

public class ForEach {
	public static void main(String[] args) {
		double [] grades = {9.5, 9.3, 9.9, 3.5};
		
		for(double grade : grades) {
			System.out.print(grade + " ");
		}
	}
}
