package ChocolateBoil;
public class MultiThread extends Thread{
    private int numhilo;
    private ChocolateBoilerSingleton a = new ChocolateBoilerSingleton();
    public MultiThread(int x){
        numhilo = x;
    }

    @Override
    public void run(){
      switch (numhilo) {
          case 1:
              a.fill();
              break;
          case 2:
              a.boil();
              break;
          case 3:
              a.drain();
              break;
          default:
              a.fill();
              a.boil();
              a.drain();
              break;
      } 
    }
    public set_numhilo(int x){
        numhilo = x;
    }
}

public class Main {
    public static void main(String[] args) {
        MultiThread test1 = new MultiThread(1);
        MultiThread test2 = new MultiThread(2);
        MultiThread test3 = new MultiThread(3);


        test1.start();
        try {
            test1.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Error test1")
        }

        test2.start();
        try {
            test2.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Error test2")
        }

        test3.start();
        try {
            test3.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Error test3")
        }
        
        ChocolateBoilerSingleton recipe1 = new ChocolateBoilerSingleton();
        println("Esta lleno"+recipe1.isEmpty());
        println("Esta hervido"+recipe1.isBoiled());

    }
}