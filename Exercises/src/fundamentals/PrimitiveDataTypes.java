package fundamentals;

public class PrimitiveDataTypes {
	public static void main(String[] args) {
		//integer
		byte yearsOfComprany = 12;
		short numberOfFlights = 542;
		int id = 56789;
		long accumulatedPoints = 3_234_845_223L;
		
		//real
		float salary = 11_445.44F;
		double accumulatedSales = 3_991_797_103.01;
		
		boolean isOnVacation = false;
		
		char status = 'A';
		
		System.out.println("Employee ID: " + id);
		System.out.println("Marcos has " + yearsOfComprany + "years of comprany");
		System.out.println("Flights: " + numberOfFlights);
		System.out.println("Accumulated Points: " + accumulatedPoints);
		System.out.println("Salary: " + salary);
		System.out.println("Is on Vacation: " + isOnVacation);
		System.out.println("Status: " + status);
		System.out.println("Accumulated Sales" + accumulatedSales);
	}
}
