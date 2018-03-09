package Beta2010;

import java.util.ArrayList;

public class Beta2010{    
    public static int solution(int[] a){
        int contador = 0;
        ArrayList<Integer> listaInterseccion = new ArrayList<>();
        int distancia = 0;
        for (int j = 0; j < a.length; j++) {
            for (int i = 0; i < a.length; i++) {
                int actual = a[i];                                
                if(i != j && !listaInterseccion.contains(distancia) && (actual+a[j] > Math.abs(i-j))){                    
                    distancia += Math.abs(i-j);
                    listaInterseccion.add(distancia);
                    contador++;
            }
            }
        }
        return contador;
    }
    public static void main(String[] args) {        
        int[] ArregloPrueba = {1, 5, 2, 1, 4, 0};
        System.out.println(""+solution(ArregloPrueba)); 
    }
    
}
