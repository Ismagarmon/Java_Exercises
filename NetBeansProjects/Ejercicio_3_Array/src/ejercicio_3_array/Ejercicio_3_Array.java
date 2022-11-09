
package ejercicio_3_array;
import java.io.*;
import java.util.Scanner;
//import java.text.DecimalFormat;

public class Ejercicio_3_Array {

    public static void main(String[] args) throws IOException{
        Scanner leer = new Scanner(System.in);
        //DecimalFormat df = new DecimalFormat("#.00");
        int n_alumnos;
        float cont, nota, suma = 0;
        double media;
        
        System.out.println("Escribir la cantidad de alumnos de la clase: ");
        n_alumnos = leer.nextInt();
        cont = n_alumnos;
        double[] notas = new double[n_alumnos];
        
        for(int i = 0;i <= notas.length - 1;i++){
            System.out.println("Nota del "+(i+1)+"º alumno: ");
            nota = leer.nextFloat();
            notas[i] = nota;
            suma += nota;
        }

        
        media = suma/cont;
        media_alumnos(notas,media);
    }
    
    public static void media_alumnos(double[] notas_alumno, double media_alumnos){
        for(int j = 0;j <= notas_alumno.length - 1;j++){
            if(notas_alumno[j] > media_alumnos){
                System.out.println("El alumno "+(j+1)+" tiene mayor media que el grupo.");
            }
        }
    }
}
