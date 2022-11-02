package classDefinition;

public class TestDate {
	public static void main(String[] args) {
		FDate dt1 = new FDate();
		dt1.day = 1;
		dt1.month = 4;
		dt1.year = 1995;
		
		FDate dt2 = new FDate();
		dt2.day = 3;
		dt2.month = 6;
		dt2.year = 1996;
		
		
		System.out.printf("%d/%d/%d", dt1.day,dt1.month,dt1.year);
		System.out.printf("\n%d/%d/%d", dt2.day,dt2.month,dt2.year);
	}
}
