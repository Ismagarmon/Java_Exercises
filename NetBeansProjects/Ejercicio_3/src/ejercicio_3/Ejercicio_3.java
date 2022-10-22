/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_3;
import java.util.Scanner;

/**
 *
 * @author ismag
 */
public class Ejercicio_3 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cadena = new String();
        String n_cadena = new String();
        cadena = leer.nextLine();
        for (int i = (cadena.length() -1) ; i >= 0; i--){
            n_cadena += cadena.charAt(i);
        }
        System.out.println("La palabra es la siguiente: "+n_cadena);
    }
    
}
