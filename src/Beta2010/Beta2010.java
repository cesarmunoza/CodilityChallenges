package Beta2010;
public class Beta2010{    
    public static int solution(int[] a){
        int contador = 0;
        int pares = 0;
        for (int j = 0; j < a.length; j++) {
            int actual = a[j];
            if(actual+a[j] > Math.abs(a[j]-actual)){
                contador++;
            }
        }
        return contador;
    }
    public static void main(String[] args) {        
        int[] ArregloPrueba = {1, 5, 2, 1, 4, 0};
        System.out.println(""+solution(ArregloPrueba)); 
    }
    
}
