package ChocolateBoil;
public class ChocolateBoilerSingleton {
    private static ChocolateBoilerSingleton instance;
    private boolean empty;
    private boolean boiled;

    private ChocolateBoiler() {
        if(instance == null){
            instance = new ChocolateBoilerSingleton();
            empty = true;
            boiled = false;
        }
        return instance;
    }

    public void fill(){
        if(isEmpty()){
            empty = false;
            boiled = false;
        }
    }

    public void drain(){
        if(isEmpty() && isBoiled()){
            //drain the boiled milk and chocolate
            empty = true;
        }
    }

    public void boil(){
        if(!isEmpty() && isBoiled()){
            //bring the contents to a boil
            boiled = true;
        }
    }

    public boolean isEmpty(){
        return empty;
    }

    public boolean isBoiled(){
        return boiled;
    }
}
