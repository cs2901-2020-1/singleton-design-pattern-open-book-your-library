package ChocolateBoil;

public class ChocolateBoilerTest {
    public static void main(String[] args) {
       
        ChocolateBoiler recipiente1 = new ChocolateBoiler();
        ChocolateBoiler recipiente2 = new ChocolateBoiler();
        
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
        System.out.println("(Verificar)Esta hervido rec1:"+ rec1.isBoiled());

        System.out.println("Se vierte el recipiente 1");
        recipiente1.drain();
        
        System.out.println("(Verificar)Esta vacío rec1:"+ rec1.isEmpty());
        System.out.println("(Verificar)Esta hervido rec1:"+ rec1.isBoiled());
        System.out.println("(Verificar)Esta vacío rec2:"+ rec2.isEmpty());
        System.out.println("(Verificar)Esta hervido rec2:"+ rec2.isBoiled());
        System.out.println("Pese a que no se hizo algunos cambios en el recipiente 2, ambos marcan lo mismo");
    }
}