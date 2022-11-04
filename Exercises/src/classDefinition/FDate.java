package classDefinition;

public class FDate {
	int day;
	int month;
	int year;
	
	FDate() {
		day = 1;
		month = 1;
		year = 1970;
	}
	
	FDate(int fDay, int fMonth, int fYear){
		day = fDay;
		month = fMonth;
		year = fYear;
	}
				
	String FormatedDate() {
		//return day + "/" + month + "/" + year;
		return String.format("%d/%d/%d", day, month, year);
	}
	
	void printFormatedDate() {
		System.out.println(FormatedDate());
	}
}
