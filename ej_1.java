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
public class ej_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer1 = new Scanner(System.in);
    Scanner leer2 = new Scanner(System.in);
    
    
        System.out.println("ingree el primer numero");

    int num1 =leer1.nextInt(); 
        System.out.println(" ingrese un segundo numero");
    int num2= leer2.nextInt();
        System.out.println(" la suma de los numeros es " + (num1+num2));
    }
  
}
