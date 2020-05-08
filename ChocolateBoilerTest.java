package ChocolateBoiler;


public class ChocolateBoilerTest {
    public static void main(String[] args) {
       
        ChocolateBoiler recipiente = new ChocolateBoiler();
        System.out.println("Verificamos si está vacío y si no a hervido");
        System.out.print("Esta vacío :"+ isEmpty());System.out.println(" Esta hervido :"+ isBoiled());

        System.out.println("Se llena el recipiente");
        recipiente.fill();//llenamos el recipiente
        System.out.println("(Verificar)Esta vacío :"+ isEmpty());
        
        System.out.println("Se hierve el recipiente");
        recipiente.boil();
        System.out.println("(Verificar)Esta hervido :"+ isBoiled());

        System.out.println("Se vierte el recipiente");
        recipiente.drain();
        System.out.println("(Verificar)Esta vacío :"+ isEmpty());
        
    }
}