import java.util.InputMismatchException;
import java.util.Scanner;
public class app3 {
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
    
}//1

    public static int pedirEnteroConExcepciones(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese un valor entero: ");
        try{
            return lector.nextInt();
        }catch(InputMismatchException e){
            return 0;
        }                                                                                                                                                                                                           
    }
}//2
public class App {
    public static void main(String[] args) throws Exception {
        int x = 98;
        int y = 0;
        //System.out.println(dividirSinExcepxiones(x,y));
        //System.out.println(dividirConValidaciones(x, y));
        System.out.println(dividirConExcepciones(x, y));
    }

    public static int dividirSinExcepciones(int x, int y){
    return x/y;
    }
    public static int dividirConValidaciones(int x, int y){
        if(y != 0){
            return x/y;
        }else{
            return 0;
        }
    }
    public static int dividirConExcepciones(int x, int y){
            try{
                return x/y;
            } catch(ArithmeticException e){
                return 0;
            }
        }
}//3
