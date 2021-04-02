package thread;

import java.util.LinkedList;
import java.util.Queue;

class CubbyHole {
	private int seq;
	private final int CUBBY_SLOTS = 10;
	private boolean available = false;
	private Queue<Integer> queue = new LinkedList<>();

	public synchronized int get() {
		while (queue.size() <= 0) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}

		//available = false;
		notify();

		return queue.remove();
	}

	public synchronized void put(int value) {
		while (queue.size() >= CUBBY_SLOTS) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		queue.add(value);
		//available = true;
		notify();
	}
}