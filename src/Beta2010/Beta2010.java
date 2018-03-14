package Beta2010;
import java.util.ArrayList;
import java.util.List;
public class Beta2010{    
    public static int solution(int[] a){
        int contador = 0;
        List<Integer> listaInterseccion = new ArrayList<>();
        int distancia;
        for (int j = 0; j < a.length; j++) {
            for (int i = 0; i < a.length; i++) {                
                distancia = Math.abs(i-j);
                if(i != j && !listaInterseccion.contains(distancia) && (a[i]+a[j] > Math.abs(a[i]-a[j]))){                    
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
