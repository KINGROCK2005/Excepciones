import java.util.Scanner;
public class App2 {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        System.out.println("Cuantos elementos enteros va a ingresar? ");
        int cantidadDeElementos = lector.nextInt();
        // int A[] = {84,21,47,96,15};
        int Arreglo[] = new int[cantidadDeElementos];
        System.out.println("Ingrese los " + cantidadDeElementos + " elementos: ");
        for(int i = 0; i < Arreglo.length ; i++){
            int elementos = lector.nextInt();
        }
        System.out.println("Que elemento desea buscar?");
        int buscado = lector.nextInt();
        int hallado = busquedaLineal(Arreglo, Arreglo.length, buscado);
        if(hallado != -1){
            System.out.println("El valor " + buscado + " fue encontrado en la  posicion: " + hallado);
        }else{
            System.out.println("El valor " + buscado + " no fue encontrado");
        }
    }
    public static int busquedaLineal(int A[], int n,int buscado){
        int indice = 0;
        while(indice < n){
            if (A[indice] == buscado){
                return indice;
            }
                indice ++;
        }
        return -1;
    }
}
