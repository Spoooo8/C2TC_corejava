package edu.atria.java.multithreading;

public class ChildThread extends Thread {
	int n;
	String msg;

	public ChildThread(int n, String msg) {
		super();
		this.n = n;
		this.msg = msg;
	}

	@Override
	public void run() {
		for (int i = 1; i <= n; i++) {
			try {
				Thread.sleep(300);
			} catch (InterruptedException ex) {
				System.err.println(ex.getMessage());
			}
			System.out.println(msg + i);
		}

	}

}
