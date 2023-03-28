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
public class ej_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("ingrese una catidad de grados centigrados ");
        Scanner read = new Scanner(System.in);
        int grados = read.nextInt();
        System.out.println("la cantidad de grados centigrados ingreasados equivalen a " + (32 + (9 * grados / 5)));
    }
//F = 32 + (9 * C / 5).
    
}
