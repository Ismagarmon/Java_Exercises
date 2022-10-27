
package ejercicio_20;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author ismag
 */
public class Ejercicio_20 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        String nombre;
<<<<<<< HEAD
        do{
            System.out.println("Introduce el nombre del alumno: ");
=======
        float p_practica, p_problemas, p_teorica;
        double resultado;
        do{
            System.out.println("Introduce el nombre del alumno/a: ");
>>>>>>> 991cc513d992f128f5d27e664544a8d6ede6b1d8
            nombre = leer.nextLine();
            System.out.println("Introduce las notas de las diferentes partes: ");
            System.out.println("1 - Parte Practica: ");
            p_practica = leer.nextFloat();
            System.out.println("1 - Parte Problemas: ");
            p_problemas = leer.nextFloat();
            System.out.println("1 - Parte Teorica: ");
<<<<<<< HEAD
            p_teorica = leer.nextInt();
=======
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
        /*while (nombre != ""){
            System.out.println("Introduce el nombre del alumno: ");
>>>>>>> 991cc513d992f128f5d27e664544a8d6ede6b1d8
            nombre = leer.nextLine();
        
            resultado = (p_practica*0.1) + (p_problemas*0.5) + (p_teorica*0.4);
            if (resultado > 10){
                System.out.println("No puede sacar más de un 10 con la suma de las 3 partes.");
            }
            else {
                System.out.println("Esta es la nota de "+nombre+": "+df.format(resultado));
            }
<<<<<<< HEAD
        } while (!nombre.isEmpty());

=======
            nombre = "a";
        }
        */
>>>>>>> 991cc513d992f128f5d27e664544a8d6ede6b1d8
    }
}
