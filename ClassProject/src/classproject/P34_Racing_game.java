package classproject;

class ThreadDemo extends Thread {
   private Thread t;
   private String threadName;
   private long time;
   
   ThreadDemo( String name) {
      threadName = name;
      System.out.println("Creating " +  threadName );
   }
   public void setTime(long time) {
    this.time = time;
  }
   public void run() {
      System.out.println("Running " +  threadName );
      try {
         for(int i = 0; i < 5; i++) {
            System.out.println(threadName +" " + i);
            // Let the thread sleep for a while.
            Thread.sleep(time);
         }
      } catch (InterruptedException e) {
         System.out.println("Thread " +  threadName + " interrupted.");
      }
      System.out.println("Thread " +  threadName + " exiting.");
   }

  
   
   public void start () {
      System.out.println("Starting " +  threadName );
      if (t == null) {
         t = new Thread (this, threadName);
         t.start ();
      }
   }
}

public class P34_Racing_game {

   public static void main(String args[]) {
      ThreadDemo T1 = new ThreadDemo( "Racer: 1");
      ThreadDemo T2 = new ThreadDemo( "Racer: 2");
      ThreadDemo T3 = new ThreadDemo( "Racer: 3");
      T1.setTime(200);T2.setTime(300);T3.setTime(100);
      T1.start();T2.start();T3.start();
       
   }   
}