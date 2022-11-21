package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
	public static void main(String[] args) {
		Queue<String>queue = new LinkedList<>();
		
		queue.add("Jack");
		queue.offer("Peter");
		queue.offer("Daniel");
		queue.offer("Mat");
		queue.offer("Daryl");
		queue.offer("Mario");
		
		System.out.println(queue.peek());
		System.out.println(queue.element());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.size());
	}

}
