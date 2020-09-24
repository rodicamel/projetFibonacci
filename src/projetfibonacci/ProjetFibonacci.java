/*
 * Java program pour calculer Fibonacci
 * 
 */
package projetfibonacci;

import java.util.Scanner;

/**
 *
 * 
 */
public class ProjetFibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean control= false;
        int nombre=0;
        FibonaciRecursive obj1 = new FibonaciRecursive();

        do{
            System.out.println("Saisisez le nombre entier >0: ");
            try {
                
            nombre = new Scanner(System.in).nextInt(); 
                if(nombre <0)
                {
                    System.out.println("Le nombre doit ertre un entier: ");
                    control = true;
                }
                System.out.println("La chaine Fibonacci: ");
                obj1.fibonaciRecursive(nombre);
            } catch(Exception e) {
                System.out.println("Exception type de nombre");
            }
                   
        }while(control);   
    } 
}
