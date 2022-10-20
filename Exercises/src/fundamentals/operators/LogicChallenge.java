package fundamentals.operators;

public class LogicChallenge {
	public static void main(String[] args) {
		Boolean work1 = false;
		Boolean work2 = false;
		
		if(work1 && work2) System.out.println("You were approved in both works, contratulations.");
		if(work1 ^ work2) System.out.println("You were approved in one work.");
		if(!work1 && !work2) System.out.println("Unfortunately you didn't get any work, try again");
	}
}
