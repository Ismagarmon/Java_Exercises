
package sondeo;

/**
 *
 * @author ismag
 */
public class Sondeo {

    static int[] respuestas = {1,2,6,4,8,5,9,7,8,10,1,6,3,8,6,10,3,8,2,7};
    static int[] frecuencia;
    public static void main(String[] args) {
        frecuencia = new int[11];
        for (int i = 0; i < respuestas.length; i++){
            ++frecuencia[respuestas[i]];                
        }
        for (int i = 0; i < frecuencia.length; i++){
            System.out.print(frecuencia[i]+",");
        }
    }
    
}






























