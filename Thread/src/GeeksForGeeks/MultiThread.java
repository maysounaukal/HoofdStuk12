package GeeksForGeeks;

public class MultiThread {

	public static void main(String[] args) {
		for(int i = 0; i < 8; i++) {//8 is de nummers of threads
			MultiThreadingDemo demo = new MultiThreadingDemo();//wij hebben hier een object van de klasse
			//MultiThreadingDemo aangemaakt, als die klasse subklasse is van  Thread klasse
			demo.start();
		}

	}

}
