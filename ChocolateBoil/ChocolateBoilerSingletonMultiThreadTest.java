package ChocolateBoil;
public class ChocolateBoilerSingletonMultiThreadTest extends Thread{
    private int numhilo;
    private ChocolateBoilerSingleton a = ChocolateBoilerSingleton.getInstance();
    public ChocolateBoilerSingletonMultiThreadTest(int x){
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
    public void set_numhilo(int x){
        numhilo = x;
    }
}


    public static void main(String[] args) {
        ChocolateBoilerSingletonMultiThreadTest test1 = new ChocolateBoilerSingletonMultiThreadTest(1);
        ChocolateBoilerSingletonMultiThreadTest test2 = new ChocolateBoilerSingletonMultiThreadTest(2);
        ChocolateBoilerSingletonMultiThreadTest test3 = new ChocolateBoilerSingletonMultiThreadTest(3);


        test1.start();
        try {
            test1.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Error test1");
        }

        test2.start();
        try {
            test2.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Error test2");
        }

        test3.start();
        try {
            test3.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Error test3");
        }
        
        ChocolateBoilerSingleton recipe1 = ChocolateBoilerSingleton.getInstance();
        System.out.println("Esta lleno"+recipe1.isEmpty());
        System.out.println("Esta hervido"+recipe1.isBoiled());

    }
