
package paso_array_1;

/**
 *
 * @author ismag
 */
public class Paso_Array_1 {

    static int a[] = {0,1,2,3,4};
    
    public static void main(String[] args) {
       modificarArray(a);
       modificarElemento(a[3]);
    }
    
    public static void modificarArray(int b[]){
           for (int j = 0; j<b.length; j++) b[j] *=2;
       }
       public static void modificarElemento(int e){
           e *= 2;
       }
       
    
}


































