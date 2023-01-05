package lambda;

public class Threads {
	public static void main(String[] args) {
		
		Runnable work1 = new Work();
		Runnable work2 = new Runnable() {

			public void run() {
				for(int i = 0 ; i < 100; i++) {
					System.out.println("Work #02");
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						
					}
				}
			}
		};
		
		Runnable work3 = Threads::work3;
		
		Thread w1 = new Thread(work1);
		Thread w2 = new Thread(work2);
		Thread w3 = new Thread(work3);
		
		w1.start();
		w2.start();
		w3.start();
		
	}
	
	static void work3() {
		for(int i = 0 ; i < 100; i++) {
			System.out.println("Work #03");
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				
			}
		}
	}
}
