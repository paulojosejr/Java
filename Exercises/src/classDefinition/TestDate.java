package classDefinition;

public class TestDate {
	public static void main(String[] args) {
		FDate dt1 = new FDate();
		dt1.day = 12;
		dt1.month = 4;
		dt1.year = 1995;
		
		FDate dt2 = new FDate();
		dt2.day = 3;
		dt2.month = 6;
		dt2.year = 1996;
		
		dt1.printFormatedDate();
		dt2.printFormatedDate();
		
	}
}
