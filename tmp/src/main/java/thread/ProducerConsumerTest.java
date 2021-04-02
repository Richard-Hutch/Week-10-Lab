package thread;

class ProducerConsumerTest {
	public static void main(String args[]) throws InterruptedException {
		CubbyHole c = new CubbyHole();
		Producer producer1 = new Producer(c, 1);
		Consumer consumer1 = new Consumer(c, 1);
		producer1.start();
		// just a stress
		Thread.sleep(500);
		consumer1.start();
	}
}