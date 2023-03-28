/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_ej_1;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class ej_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner read = new Scanner(System.in);

    
    
        System.out.println("ingree un numero");

    int num1 = read.nextInt(); 
        System.out.println(" el doble del numero ingresado es " + (num1 *2));
        System.out.println(" el triple del numero ingresado es " + (num1*3));
        double raiz = Math.sqrt(num1);
        System.out.println(" la raiz cuadrada numero ingresado es " + raiz );
    }
    //Math.sqrt()
}
