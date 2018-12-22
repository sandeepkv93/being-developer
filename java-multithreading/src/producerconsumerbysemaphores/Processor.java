package producerconsumerbysemaphores;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Processor {
	private static final int LIMIT = 10;
	private List<Integer> list = new LinkedList<Integer>();
	Semaphore semaphoreProducer=new Semaphore(1);
    Semaphore semaphoreConsumer=new Semaphore(0);
	public void produce() throws InterruptedException {
		int value = 0;
		while(true) {
				while (list.size() == LIMIT) {
					semaphoreProducer.acquire();
				}
				System.out.print("List Size: "+list.size());
				value = value+1;
				System.out.println("; Producer Produced Value: "+value);
				list.add(value);
				semaphoreConsumer.release();
		}
	}
	
	public void consume() throws InterruptedException {
		while(true) {
				while (list.isEmpty()) {
					semaphoreConsumer.acquire();
				}
				System.out.print("List Size: "+list.size());
				int value = list.remove(0);
				System.out.println("; Consumer Consumed Value: "+value);
				semaphoreProducer.release();
				Thread.sleep(1000);
		}
	}
	
}
