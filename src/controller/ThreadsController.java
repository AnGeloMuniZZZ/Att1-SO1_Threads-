package controller;

public class ThreadsController extends Thread {

	public ThreadsController() {
		super();
	}
	
	@Override
	public void run() {
		int TID = (int) getId();
		System.out.println("#" + TID);
	}
}
