package threading;

import java.io.IOException;

public class Intro implements Runnable {
	public void run() {
		System.out.println("Thread Running");
	}
	
	public static void main(String[] args) throws IOException {
		Intro m1 = new Intro();
		Thread t1 = new Thread(m1);
		t1.start();
	}
}
