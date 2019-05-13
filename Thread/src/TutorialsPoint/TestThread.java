package TutorialsPoint;

public class TestThread {

	public static void main(String[] args) {
		RunnableDemo demo = new RunnableDemo("Thread-1");
		RunnableDemo demo1 = new RunnableDemo("Thread-2");
		demo.Start();//roept Start() methode
		demo1.Start();
		
		//in de console zien we dat elke naam van thread met de eerste nummer en loop en de ordenen van thread 
		//is verschillend in elke keer
		

	}

}
