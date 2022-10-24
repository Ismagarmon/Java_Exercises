
package paso_array_2;

/**
 *
 * @author ismag
 */
public class Paso_Array_2 {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        modificarArray(a);
        for (int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }
    
    public static void modificarArray(int[] a){
        int[] b = {4,5,5};
        a[0] = b[0];
        b[1] = a[1];
        a = b;
        for (int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }
    
}
