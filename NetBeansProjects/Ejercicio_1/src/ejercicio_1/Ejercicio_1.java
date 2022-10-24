/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_1;
import java.util.Scanner;

/**
 *
 * @author ismag
 */
public class Ejercicio_1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cadena = new String();
        int cantidad = 1;
        cadena = leer.nextLine();
        cadena = cadena.trim();
        for (int i = 0; i < (cadena.length()); i++){
            if (cadena.charAt(i) == ' '){
                cantidad += 1;
            }
        }
        System.out.println("La cantidad de caracteres que tiene es: " + cantidad);
        
        int pares = 0;
        int impares = 0;
        for(int i=1;i<=100;i++){
            if(i>0)
                if(i%2 != 0){
                    System.out.println("Es un número par.");
                    pares++;
                }
                else{
                    System.out.println("Es un número impar.");
                    impares++;
                }
        }
        System.out.println("Este es la cantidad de pares que hay: "+pares+", y esta la de impares: "+impares);
    }
}