package threading;

public class JoinExample implements Runnable {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i+" - "+Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		JoinExample m1 = new JoinExample();
		Thread t1 = new Thread(m1);
		System.out.println(t1.getName()+" - "+t1.getId());

		JoinExample m2 = new JoinExample();
		Thread t2 = new Thread(m2);
		System.out.println(t2.getName()+" - "+t2.getId());

		JoinExample m3 = new JoinExample();
		Thread t3 = new Thread(m3);
		System.out.println(t3.getName()+" - "+t3.getId());
		
		t1.start();
		try {
			t1.join(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		t2.start();
		t3.start();
	}
}
