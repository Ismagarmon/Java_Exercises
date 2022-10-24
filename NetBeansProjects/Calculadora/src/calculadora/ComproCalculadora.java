/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author ismag
 */
public class ComproCalculadora {
    public static int Sumar(int a,int b){
        int resultado;
        resultado = a+b;
        return resultado;
    }
    
    public static int Restar(int a,int b){
        int resultado;
        resultado = a-b;
        return resultado;
    }
    
    public static float Multipicacion(int a,int b){
        float resultado;
        resultado = a*b;
        return resultado;
    }
    
    public static float Division(int a,int b){
        float resultado;
        resultado = (float) a/b;
        return resultado;
    }
}
