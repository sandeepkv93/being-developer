package producerconsumerbysynchronization;

import java.util.LinkedList;
import java.util.List;

public class Processor {
	private static final int LIMIT = 10;
	private List<Integer> list = new LinkedList<Integer>();
	private Object lock = new Object();
	public void produce() throws InterruptedException {
		int value = 0;
		while(true) {
			synchronized (lock) {
				while (list.size() == LIMIT) {
					lock.wait();
				}
				System.out.print("List Size: "+list.size());
				value = value+1;
				System.out.println("; Producer Produced Value: "+value);
				list.add(value);
				lock.notify();
			}
		}
	}
	
	public void consume() throws InterruptedException {
		while(true) {
			synchronized (lock) {
				while(list.size() == 0) {
					lock.wait();
				}
				System.out.print("List Size: "+list.size());
				int value = list.remove(0);
				System.out.println("; Consumer Consumed Value: "+value);
                lock.notify();
			}
			Thread.sleep(1000);
		}
	}
	
}
