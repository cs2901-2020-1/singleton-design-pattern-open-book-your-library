package ChocolateBoil;

public class ChocolateBoilerSingletonTest {
    public static void main(String[] args) {
       
        ChocolateBoilerSingleton recipiente1 = ChocolateBoilerSingleton.getInstance();
        ChocolateBoilerSingleton recipiente2 = ChocolateBoilerSingleton.getInstance();
        
        System.out.println("Verificamos si están vacíos");
        System.out.println("Esta vacío, recipiente1:"+recipiente1.isEmpty());
        System.out.println("Esta vacío, recipiente2:"+recipiente2.isEmpty());

        System.out.println("Se llena el recipiente 1 y 2");
        recipiente1.fill();//llenamos el recipiente
        recipiente2.fill();
        System.out.println("(Verificar)Esta vacío rec1:"+ recipiente1.isEmpty());
        System.out.println("(Verificar)Esta vacío rec2:"+ recipiente2.isEmpty());
    
        System.out.println("Se hierve el recipiente 1");
        recipiente1.boil();
        System.out.println("(Verificar)Esta hervido rec1:"+ recipiente1.isBoiled());

        System.out.println("Se vierte el recipiente 1");
        recipiente1.drain();
        
        System.out.println("(Verificar)Esta vacío rec1:"+ recipiente1.isEmpty());
        System.out.println("(Verificar)Esta hervido rec1:"+ recipiente1.isBoiled());
        System.out.println("(Verificar)Esta vacío rec2:"+ recipiente1.isEmpty());
        System.out.println("(Verificar)Esta hervido rec2:"+ recipiente1.isBoiled());
        System.out.println("Pese a que no se hizo algunos cambios en el recipiente 2, ambos marcan lo mismo");
    }
}