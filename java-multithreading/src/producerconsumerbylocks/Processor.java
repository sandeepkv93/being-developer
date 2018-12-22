package producerconsumerbylocks;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Processor {
	private static final int LIMIT = 10;
	private List<Integer> list = new LinkedList<Integer>();
	private Lock myLock = new ReentrantLock();
	private Condition condition = myLock.newCondition();
	public void produce() throws InterruptedException {
		int value = 0;
		while(true) {
			myLock.lock();
			try {
				while (list.size() == LIMIT) {
					condition.await();
				}
				System.out.print("List Size: "+list.size());
				value = value+1;
				System.out.println("; Producer Produced Value: "+value);
				list.add(value);
				condition.signal();
			} finally {
				myLock.unlock();
			}
		}
	}
	
	public void consume() throws InterruptedException {
		while(true) {
			myLock.lock();
			try {
				while (list.size() == 0) {
					condition.await();
				}
				System.out.print("List Size: "+list.size());
				int value = list.remove(0);
				System.out.println("; Consumer Consumed Value: "+value);
				condition.signal();
			} finally {
				myLock.unlock();
			}
			Thread.sleep(100);
		}
	}
	
}
