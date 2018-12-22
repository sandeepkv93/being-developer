package threading;

public class SleepExample implements Runnable {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		SleepExample m1 = new SleepExample();
		Thread t1 = new Thread(m1);
		t1.start();
		SleepExample m2 = new SleepExample();
		Thread t2 = new Thread(m2);
		t2.start();
	}
}
