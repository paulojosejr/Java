package fundamentals;

public class ArithmeticOpeatorsChallenge {
	public static void main(String[] args) {
		double a = Math.pow(6 * (3 + 2), 2) / (3 * 2);
		double b = Math.pow(((1 - 5) * (2 - 7)) / 2, 2);
		double c = Math.pow(10, 3);
		
		double result = Math.pow((a - b), 3) / c;
		
		System.out.println(result);
	}
}
