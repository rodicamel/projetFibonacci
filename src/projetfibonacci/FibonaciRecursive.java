/*
 * Ce programme utilise la récursion de la chaine
 * pour calculer le nombre de Fibonacci 
 * pour un nombre donné fn= fn-1+ fn-2
 * @author Rodica GR287 -II
 */
package projetfibonacci;


/**
 * calculer le nombre de Fibonacci pour un nombre entier donné
 * Argument: int 
 * @param nombre
 */
public class FibonaciRecursive {
    static int nbr1 = 0;
    static int nbr2 = 1;  
    static int nbr3 = 0;
    
    public static void fibonaciRecursive(int nombre) {
        if (nombre > 0){
            nbr3 = nbr1 + nbr2;    
            nbr1 = nbr2;    
            nbr2 = nbr3;    
            System.out.print(" " + nbr3);   
            fibonaciRecursive(nombre-1);
        }
    }

    /**
     * afficher le 0 et 1 de la chaine Fibonacci 
     *
     */
    public static void afficherFibonacci(int nombre){
        System.out.print(nbr1 + " " + nbr2 + " ");
        if(nombre >= 2 )
        fibonaciRecursive(nombre-2);
    }            
}
