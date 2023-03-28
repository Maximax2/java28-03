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
public class ej_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner leer1 = new Scanner(System.in);
    
    
    
        System.out.println("ingree una frase ");

    String frase =leer1.next(); 
     frase = frase.toUpperCase();
        System.out.println(" la frase en mayusculas es ");
        System.out.println( frase);
        System.out.println(" la frase en minusculas es ");
        frase = frase.toLowerCase();
        System.out.println( frase );   ;        
    }
    
}
