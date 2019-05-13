package GeeksForGeeks1;

//er wordt Thread gecreerd door de implementatie van Runnable die een run methode heeft

public class MultiThreadingDemo implements Runnable{

	@Override

	public void run() {
		System.out.println("Thread" + "  " + Thread.currentThread().getId() + "  " + " is running");
}

}
