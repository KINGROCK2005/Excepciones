 public class ExcepcionesPr {
     public static void main(String[] args) throws Exception {
         int x = 98;
         int y = 0;
         System.out.println(dividirSinExcepxiones(x,y));
         System.out.println(dividirConValidaciones(x, y));
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
 }
