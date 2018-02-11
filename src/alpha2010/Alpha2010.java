package alpha2010;
import java.util.Random;
import java.util.Scanner;
public class Alpha2010 {
    public static void main(String[] args) {
        System.out.println("Ingrese el tamaño del arrego (de 0 a 1.000.000)");
        Scanner scaner = new Scanner(System.in);
        int longitud = scaner.nextInt();        
        int[] arreglo = new int[longitud];
        Random valorAleatorio = new Random();
        
        for (int i = 0; i < longitud; i++) {
            int probable = valorAleatorio.nextInt(longitud);
            arreglo[i] = probable;
            System.out.printf("%d\n", arreglo[i]);
        }
        solution(arreglo, longitud);
    }
    
    public static int solution(int A[], int N){
        int mayor = 0;
        int numeroPedido = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > mayor){
                mayor = A[i];
            }
        }
        numeroPedido = mayor + 1;
        System.out.println("El número buscado es: " + numeroPedido);
        return numeroPedido;        
    }
    
    
    
}
