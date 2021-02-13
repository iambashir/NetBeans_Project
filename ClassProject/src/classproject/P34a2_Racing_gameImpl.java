package classproject;

class Counter  implements Runnable{
  private int c = 0;

  public  void increment() {
    try {
      Thread.sleep(500);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    c++;
  }

  public  void decrement() {    
    c--;        
  }

  public  int getValue() {
    return c;
  }
    
  @Override
  public void run() {
    synchronized(this){
      // incrementing
      this.increment();
      System.out.println("The position of " 
       + Thread.currentThread().getName() + " " + this.getValue());
      //decrementing
      this.decrement();
      System.out.println("Value for Thread at last " + Thread.currentThread().getName() 
          + " " + this.getValue());
    }        
  }
}

public class P34a2_Racing_gameImpl{
  public static void main(String[] args) {
    Counter counter = new Counter();
    Thread t1 = new Thread(counter, "Racer-1");
    Thread t2 = new Thread(counter, "Racer-2");
    Thread t3 = new Thread(counter, "Racer-3");
   // t1.setTime(200); t1.setTime(300); t1.setTime(100); 
    t1.start();
    t2.start();
    t3.start();
  }    
}
