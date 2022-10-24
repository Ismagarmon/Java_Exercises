
package metodo_burbuja;

/**
 *
 * @author ismag
 */
public class Metodo_Burbuja {

    static int[] a= {1,7,2,8,2,8,9,2,45};
    public static void main(String[] args) {
        int intercambio;
        for (int i = 0; i < a.length -1; i++)
            for(int j = 0; j < a.length - 1 - i; j++)
                if (a[j] > a[j+1]){
                            intercambio = a[j];
                            a[j] = a[j+1];
                            a[j+1]=intercambio;
                        }
        for (int k = 0; k < a.length; k++)
            System.out.println(a[k]+",");
    }   
}