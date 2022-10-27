package ejercicio_1_arrays;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio_1_Arrays {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        int num;
        int c_pos = 0, c_neg = 0;
        float sum_pos = 0,sum_neg = 0;
        int[] a = new int[10];
        for(int i = 0;i<10;i++){
            System.out.println("Escribir el "+i+" número: ");
            num = leer.nextInt();
            a[i]= num;
            if(num >= 0){
                sum_pos += num;
                c_pos++;
            }
            else {
                sum_neg += num;
                c_neg++;
            }
        }
        float media_pos = sum_pos / c_pos;
        float media_neg = sum_neg / c_neg;
        System.out.println("La media de los números positivos es: "+df.format(media_pos)+", y la media de los números negativos es: "+df.format(media_neg));
        System.out.println("Esta es la lista de los números: ");
        for(int j = 0;j<=((a.length)-1);j++){
            System.out.print(a[j]+" ");
        }
    }
}