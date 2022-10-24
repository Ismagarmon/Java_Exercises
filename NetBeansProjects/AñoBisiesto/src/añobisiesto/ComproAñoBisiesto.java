/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package añobisiesto;

/**
 *
 * @author ismag
 */
public class ComproAñoBisiesto {
    public static boolean AñoBisiesto(int año){
        return (año%100 != 0 && año%4 == 0) || (año%400 == 0 && año%4 == 0);
    }
}
