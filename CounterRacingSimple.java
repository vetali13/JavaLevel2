public class CounterRacingSimple {

	public static void main(String[] args) {
        // 1) Less code, the anonymous object is only created to start the method.
		// alternative way:
		// CounterRacingSimple simple = new CounterRacingSimple();
		// simple.doCounter();
		new CounterRacingSimple().doCounter();
	}
	
	private int count = 0;
	
	private synchronized void increment() {
		count++;
	}
	
	private void doCounter() {
        // 2) --> Creating a new Thread object implementing Runnable interface.
		//    --> The object is created to get access to start() method located in Thread class
		//    --> Using start() method to create a new thread for the run() method.
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
                // 3) For cycle will iterate 1_000_000 times for t1 and 1_000_000 times for t2, in separate threads.
				for(int i = 0; i < 1_000_000; i++) {
					increment();
				}
                System.out.println("t1: " + count);
				
			}
		});

		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0; i < 1_000_000; i++) {
					increment();
				}
                System.out.println("t2: " + count);
				
			}
		});
		// 4) --> For cycle in one thread is finishing the iteration faster, at that time the variable counter has a value
		//        lower than 2000000. 
		//    --> For the other thread, the For cycle is finishing the iteration later, when the counter 
		//        reaches the maximum value of 2000000.
		// 5) --> Which thread will finish sooner depends on the stack frames and concurrency. If the number of iterations
		//        of the For cycle is increased to 10_000_000 both threads are finishing the iterations when the counter
		//        reaches 20_000_000
		t1.start();
		t2.start();
	}

}