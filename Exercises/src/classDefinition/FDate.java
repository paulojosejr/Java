  package classDefinition;

public class FDate {
	int day;
	int month;
	int year;
	
	FDate() {
		this(1, 1, 1970);
	}
	
	FDate(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
				
	String formatedDate() {
		final String format = "%d/%d/%d";
		return String.format(format, day, month, year);
	}
	
	void printFormatedDate() {
		System.out.println(this.formatedDate());
	}
}
