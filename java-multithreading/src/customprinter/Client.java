package customprinter;

public class Client {
	public static void main(String[] args) throws InterruptedException {
		final AlternatePrinter myPrinter = new AlternatePrinter();
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					myPrinter.printEven();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					myPrinter.printOdd();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
	}

}
