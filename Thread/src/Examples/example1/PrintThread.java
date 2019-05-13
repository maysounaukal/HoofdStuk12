package Examples.example1;

public class PrintThread extends Thread{
	private char c;//de teken 
	private int count;//het aantal teken die ik wil afdrukken
	
	public PrintThread(char c, int count) {
		this.c = c;
		this.count = count;
	}
	@Override
	public void run() {//afdrukken van de tekens
		
		for(int i = 0 ; i < count ; i++) {
			System.out.print(c);
		}
	}

}
