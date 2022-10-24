/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leer_y_sumar;
import java.util.Scanner;
/**
 *
 * @author ismag
 */
public class Leer_y_Sumar {

    public static void main(String[] args) {
        System.out.println("Introduce un número con 5 cifras: ");
        Scanner leer = new Scanner(System.in);
        int num = leer.nextInt();
        String num2 = String.valueOf(num);
        int d = num2.length();
        if (d < 5){
            System.out.println("Introduce un número con 5 cifras: ");
        } else {
            
            for (int i = 0; i < (d - 1); i++){
                Integer r = Integer.parseInt(num2);
            }
        }
    
}
}