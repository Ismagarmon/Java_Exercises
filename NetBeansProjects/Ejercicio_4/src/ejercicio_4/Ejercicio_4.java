/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_4;
import java.util.Scanner;

/**
 *
 * @author ismag
 */
public class Ejercicio_4 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cadena = new String();
        String n_cadena = new String();
        String cadenaUpperCase = new String();
        do {
          System.out.println("Introduce un texto: ");
          cadena = leer.nextLine(); 
          System.out.println("Introduce un segundo texto: ");
          n_cadena = leer.nextLine();
          cadena.trim();
          n_cadena.trim();
        }while(cadena.isEmpty() || n_cadena.isEmpty());

        for(int i=0; i<=cadena.length()-1;i++){
            for(int j=0;j<=n_cadena.length()-1;j++){
                if (cadena.charAt(i) == n_cadena.charAt(j)){
                    String aux = Character.toString(cadena.charAt(i));
                    cadenaUpperCase += aux;
                }
            }   
        }
        System.out.println("ASD: "+cadenaUpperCase);
    }
}
