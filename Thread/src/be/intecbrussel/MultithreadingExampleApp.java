package be.intecbrussel;

public class MultithreadingExampleApp {

	public static void main(String[] args) {
		for(int i = 0; i <8 ; i++) {
			ThreadDemo thread = new ThreadDemo('*', 100);
					thread.start();
		}

	}

}
