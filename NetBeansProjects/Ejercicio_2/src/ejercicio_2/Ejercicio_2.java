
package ejercicio_2;
import java.util.Scanner;


public class Ejercicio_2 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cadena = new String();
        int pos = 0;
        do {
          System.out.println("Introduce una frase: ");
          cadena = leer.nextLine(); 
        }while(cadena.isEmpty());
        cadena = cadena.trim();
        for (int i = 0; i < (cadena.length()); i++){
            if (cadena.charAt(i) == ' '){
                pos = i;
            }
        }
        cadena = cadena.substring(0, pos);
        System.out.println("La frase resultante es la siguiente: "+cadena);
    }
}
