package GeeksForGeeks;

//wij gaan thread creeren via extention

      public class MultiThreadingDemo extends Thread{
      @Override
      public void run() {//in de run method gaat de thread verschijnen
      System.out.println("Thread" + " " +Thread.currentThread().getId() +" " + "is running");
     }
     }
