// import java.util.InputMismatchException;
// import java.util.Scanner;
// public class practicaExcepciones {
    
//     public static void main(String[] args){
//         int x = 1;
//         // System.out.println(pedirEnterosConValidaciones());
//         System.out.println(pedirEnteroConExcepciones());

//     }
//     public static int pedirEnterosSinExcepciones(){
//         Scanner lector = new Scanner(System.in);
//         System.out.println("Ingrese un valor entero: ");
//         return lector.nextInt();

//     }
//     public static int pedirEnterosConValidaciones(){
//         Scanner lector = new Scanner(System.in);
//         boolean esValido = true;
//         System.out.println("Ingrese un valor entero: ");
//         String entrada = lector.next();
//         for(int i = 0; i < entrada.length(); i++){
//             if(!Character.isDigit(entrada.charAt(i))){//funcion para detectar un valor numerico en una cadena!!!!!!!!
//                 esValido = false;
//                 break;
//             }
//         }
//         if(esValido){
//             return Integer.parseInt(entrada);
//         }
//         return 0;
//     }
