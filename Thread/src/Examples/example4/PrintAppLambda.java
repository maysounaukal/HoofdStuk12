package Examples.example4;

public class PrintAppLambda {

	public static void main(String[] args) {
		Thread thread1 = new Thread(() -> print('#',1000));
		Thread thread2 = new Thread(() -> print('*',100));
		thread1.start();
		thread2.start();

	}

	private static void print(char count, int i) {
		// TODO Auto-generated method stub
		for(i = 0; i < count; i++) {
			System.out.print(count);
			Thread.yield();
		}
		
	}

}
