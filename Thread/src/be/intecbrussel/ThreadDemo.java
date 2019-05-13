package be.intecbrussel;

public class ThreadDemo extends Thread{
	char c;
	int i;
	

public ThreadDemo(char c, int i) {
		this.c = c;
		this.i = i;
	}

@Override
public void run() {
	// TODO Auto-generated method stub
   System.out.println("thread" +" " + Thread.currentThread().getId() +"  " + "is running") ;
}
}
