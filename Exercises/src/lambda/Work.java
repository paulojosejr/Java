package lambda;

public class Work implements Runnable{

	public void run() {
		for(int i = 0 ; i < 100; i++) {
			System.out.println("Work #01");
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				
			}
		}
	}
}
