
package ejercicio_2_array;
import java.util.Scanner;

public class Ejercicio_2_Array {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] a = new int[10];
        int suma = 0, cont = 0, num;
        double media;
        for(int i = 0;i<=(a.length -1);i++){
            System.out.println("Introduce el "+i+"º número:");
            num = leer.nextInt();
            a[i]=num;
            if (i == 0){
                suma += a[i];
                cont++;
            }
            else if (i%2 == 0){
                suma += a[i];
                cont++;
            }
        }
        media = suma/cont;
        System.out.println("Esta es la media de todos los números introducidos: "+media);
    }
}