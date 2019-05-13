package TutorialsPoint;

public class RunnableDemo implements Runnable{
	private Thread thread;
	private String threadName;
	
	public RunnableDemo(String threadName) {
		
		this.threadName = threadName;
		System.out.println("Creating" + threadName);
	}
	

	@Override
	public void run() {
		System.out.println("Running" + "   " + threadName);
		try {
			for(int i = 4; i > 0; i-- ) {
				System.out.println("Thread" + "  " + threadName + "," + i);
			Thread.sleep(50);//gooit InterruptedException exception
			}
		}catch(InterruptedException ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println("thread" + threadName + " existing");
		
	
	}
	public void Start() {
		System.out.println("Starting" + "  " + threadName);
		if(thread == null) {
			thread = new Thread(this,threadName);
			thread.start();//roept run methode aan
			
		}
	}

}
