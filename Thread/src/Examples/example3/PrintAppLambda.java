package Examples.example3;

public class PrintAppLambda {

	public static void main(String[] args) {
		
		Thread thread1 = new Thread(() -> print('#', 100));
		Thread thread2 = new Thread(() -> print('*', 100));
	//	System.out.println(thread1.getState());
		//System.out.println(thread2.getState());
		
		thread1.start();
	//	System.out.println(thread1.getState());
		thread2.start();
		//System.out.println(thread2.getState());
		print('@', 100);//??
	//	System.out.println();
	//	System.out.println(thread1.isAlive());
		

	}
	

	private static void print(char c, int count) {
		// TODO Auto-generated method stub
		for(int i = 0; i < count ; i++)
		System.out.print(count);
		Thread.yield();
	}

}
