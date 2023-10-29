import java.util.InputMismatchException;
import java.util.Scanner;
public class excepcionPractica{
    public static void main(String []args){
        int resultado = dividir();
        System.out.println(resultado);
    }
    public static int dividir(){
        int x = pedirEntero();
        int y = pedirEntero();
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        return x/y;
    }
    public static int pedirEntero(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese un valor entero: ");
        while(true){
            try{
                return lector.nextInt();
            }catch (InputMismatchException e){
                
            }
        }
    }
    
}1

     public static int pedirEnteroConExcepciones(){
        Scanner lector = new Scanner(System.in);
         System.out.println("Ingrese un valor entero: ");
         try{
             return lector.nextInt();
         }catch(InputMismatchException e){
             return 0;
         }                                                                                                                                                                                                           
     }
 }
