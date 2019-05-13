package GeeksForGeeks1;

public class MultiThread {

	public static void main(String[] args) {
		for(int i = 0; i < 8; i++) {
			Thread Object = new Thread(new MultiThreadingDemo());//als de Klasse (MultiThreadingDemo) implements
			//de klasse runnable, wij moeten een object van de klasse thread aanmaken en let de argumeten op
			//anders gaan wij een fout krijgen bij (start() methode)
			Object.start();
		}

	}

}
