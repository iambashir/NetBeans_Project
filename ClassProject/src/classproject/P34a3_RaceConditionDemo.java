package classproject;
//import java.lang.Tread;
public class P34a3_RaceConditionDemo {
int counter = 0;
  public  void incrementCounter(){
    try {
      Thread.sleep(100);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    counter++;
  }
  public int getCounter(){
    return counter;
  }
  public static void main(String[] args) {
    P34a3_RaceConditionDemo rc = new P34a3_RaceConditionDemo();
    for(int i = 0; i < 10; i++){
      new Thread(new Runnable() {			
        @Override
        public void run() {
          rc.incrementCounter();
          System.out.println("value for " + Thread.currentThread().getName() + " - " + rc.getCounter());
        }
      }).start();
    }	
  }   
}
