package Examples.example2;

public class PrinterAppRunnable {

	public static void main(String[] args) {
		CharacterPrinter printer1 = new CharacterPrinter('*', 100);
		CharacterPrinter printer2 = new CharacterPrinter('#', 100);
		
		
		Thread thread1 = new Thread(printer1);
		Thread thread2 = new Thread(printer2);
		
		thread1.start();
		thread2.start();
		
		//als wij Runnable als interface gebruiken , we moeten in de main klasse ,
		//eerst moeten wij een object of meer maken van de klasse
		//tweede moeten wij een object of meer aanmaken van de klasse thread
		

	}

}
