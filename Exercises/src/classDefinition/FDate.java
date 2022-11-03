package classDefinition;

public class FDate {
	int day;
	int month;
	int year;
	
	String FormatedDate() {
		//return day + "/" + month + "/" + year;
		return String.format("%d/%d/%d", day, month, year);
	}
	
	void printFormatedDate() {
		System.out.println(FormatedDate());
	}
}
