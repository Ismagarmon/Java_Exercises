
package ejercicio_2;
import java.util.Scanner;


public class Ejercicio_2 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cadena = new String();
        String n_cadena = new String();
        do {
          System.out.println("Introduce un texto: ");
          cadena = leer.nextLine(); 
          System.out.println("Introduce un segundo texto: ");
          n_cadena = leer.nextLine();
        }while(cadena.isEmpty() || n_cadena.isEmpty());
        boolean b1=cadena.equals(n_cadena);
       
        System.out.println("La frase es la siguiente: "+b1);
    }
}
