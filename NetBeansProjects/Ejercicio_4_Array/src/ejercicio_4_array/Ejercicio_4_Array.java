package ejercicio_4_array;

public class Ejercicio_4_Array {

    public static void main(String[] args) {
        int[] Pares = new int[20];
        int ind = 0;
        int cont = 0;
        
        for(int i = 0;cont<=19;i++){
            if(i != 0 && i%2 == 0){
                Pares[ind] = i;
                cont++;
                ind++;
            }
        }
        System.out.println("El array queda de esta manera: ");
        for(int j = 0;j<=(Pares.length - 1);j++){
            System.out.print(Pares[j]+" ");
        }
    }
}
