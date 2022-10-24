/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generador_nombres;
import java.lang.Math;

/**
 *
 * @author ismag
 */
public class Generador_Nombres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] nombres = {"Sonia","Paula","Diego","Pedro","Andrés","Silvia","Alejandro","Hugo"};
        String[] apellidos1 = {"García","Palenzuela","Dominguez","Gomez","Hernandez","San Lorenzo","Gil","Pérez"};
        String[] apellidos2 = {"García","Palenzuela","Dominguez","Gomez","Hernandez","San Lorenzo","Gil","Pérez"};
        int d = (nombres.length) - 1;
        int dd = (apellidos1.length) - 1;
        int ddd = (apellidos2.length) - 1;
        int a = (int) (Math.random()*d);
        int aa = (int) (Math.random()*ddd);
        int n = (int) (Math.random()*dd);
        /*for (int i = 0; i <= d; i++) {
            System.out.println(nombres[i]);
        }*/
        System.out.println("Este es el nuevo nombre: " + nombres[n] + " " + apellidos1[a] + " " + apellidos2[aa]);
    }
    
}
