import java.util.Scanner;

public class metodoOrdenamiento {
    //Pedir datos y ordenarlos
    
    
    public static void main(String[] args) {
        Scanner lec = new SCanner(System.in);
        
        System.out.println("Ingrese el num");
        int n = 
        int Arreglo[] = new Arreglo[n];
        System.out.println("Arreglo Original: ");
        mostrarArreglo(Arreglo, Arreglo.length);
        OrdenarPorInsercion(Arreglo, Arreglo.length);
        System.out.println("Arreglo ordenado: ");
       mostrarArreglo(Arreglo, Arreglo.length);


    }
    
    public static void OrdenarPorInsercion(int Arr[], int n){
        
        
        for(int i = 1; i < Arr.length ;i++ ){
            int valorC = Arr[i];//Asignar a la variable temporal el valor del segundo
            int posicion = i; // Para llevar el seguimiento de las pòsiciones
            //Verificar si se esta trabajando en el elemento que esta despues del primero
            //y si el elemento que esta de primero es ,mayor al segundo
            while((posicion > 0) && (Arr[posicion - 1]> valorC)){
                Arr[posicion] = Arr[posicion -1];//Cambiamos de posicion
                posicion = posicion -1;

            }
            Arr[posicion ] = valorC;
        }

    }
    public static void mostrarArreglo(int Arr[], int n){
        for (int i = 0; i < Arr.length; i++){
            System.out.print(Arr[i] + " ");
        }
        System.out.println();
    } 

}
