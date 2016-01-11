package thread;

public class ThreadTrying {
	public static void main(String[] args){
		Thread thread1 = new Thread(new MyThread("thread1",6));
		Thread thread2 = new Thread(new MyThread("thread2",5),"thread2");
		/*if we want to determine task priorities of the threads,
		we can use "setPriority" method in this section.*/
		thread1.setPriority(Thread.MIN_PRIORITY);
		thread2.setPriority(Thread.MAX_PRIORITY);
		thread1.start();
		thread2.start();
	}
}
