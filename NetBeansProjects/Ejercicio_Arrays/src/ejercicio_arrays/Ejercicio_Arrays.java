
package ejercicio_arrays;
import java.util.Arrays;


public class Ejercicio_Arrays {

    static String[] stringArray={"ab","aB","c","0","2","1Ad","a10"};
    public static void main(String[] args) {
        Arrays.sort(stringArray);
        System.out.println("****Ordenando String Array****");
        for (String str : stringArray)
            System.out.print(str+" ");
    }
    
}
