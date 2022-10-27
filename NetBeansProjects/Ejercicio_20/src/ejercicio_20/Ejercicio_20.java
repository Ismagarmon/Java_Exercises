
package ejercicio_20;
import java.text.DecimalFormat;
import java.util.Scanner;


public class Ejercicio_20 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        String nombre;
        float p_practica, p_problemas, p_teorica;
        double resultado;
        do{
            System.out.println("Introduce el nombre del alumno/a: ");
            nombre = leer.nextLine();
            System.out.println("Introduce las notas de las diferentes partes: ");
            System.out.println("1 - Parte Practica: ");
            p_practica = leer.nextFloat();
            System.out.println("2 - Parte Problemas: ");
            p_problemas = leer.nextFloat();
            System.out.println("3 - Parte Teorica: ");
            p_teorica = leer.nextFloat();
            leer.nextLine();
            
            resultado = (p_practica*0.1) + (p_problemas*0.5) + (p_teorica*0.4);
            if (resultado > 10){
                System.out.println("No puede sacar más de un 10 con la suma de las 3 partes.");
            }
            else {
                System.out.println("Esta es la nota de "+nombre+": "+df.format(resultado));
            }
        } while (!nombre.isEmpty());
    }
}
