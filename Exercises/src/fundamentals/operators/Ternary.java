package fundamentals.operators;

public class Ternary {
	public static void main(String[] args) {
		
		double average = 5.9;
		
		String result = average >= 7.0 ? "passed" : average >= 5.0 ? "in retake" : "failed";
		
		System.out.println("The student is: " + result);
	}
}
