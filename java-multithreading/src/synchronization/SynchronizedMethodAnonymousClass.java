package synchronization;

class Table3 {
	synchronized void printTable(int n) {// synchronized method
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}
}

public class SynchronizedMethodAnonymousClass {
	public static void main(String args[]) {
		final Table3 obj = new Table3();// only one object

		Thread t1 = new Thread() {
			public void run() {
				obj.printTable(5);
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				obj.printTable(100);
			}
		};

		t1.start();
		t2.start();
	}
}