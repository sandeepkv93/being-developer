package customprinter;

import java.util.List;

public class AlternatePrinter {
	private Integer count = new Integer(0);
	private Object lock = new Object();
	public void printEven() throws InterruptedException {
		while(count <= 100) {
			synchronized (lock) {
				while(count%2 != 0) {
					lock.wait();
				}
				System.out.println("Even Thread: "+count);
				count = count+1;
				lock.notify();
				Thread.sleep(100);
			}
		}
	}
	public void printOdd() throws InterruptedException {
		while(count <= 100) {
			synchronized (lock) {
				while(count%2 == 0) {
					lock.wait();
				}
				System.out.println("Odd Thread: "+count);
				count = count+1;
				lock.notify();
				Thread.sleep(100);
			}
		}
	}
}
