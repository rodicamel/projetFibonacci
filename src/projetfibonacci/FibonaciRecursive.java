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
 * Return : int
 */
public class FibonaciRecursive {
    
    public static int fibonaciRecursive(int nombre) {
        
      if ((nombre == 0) || (nombre == 1))
         return nombre;
      else
          System.out.print(nombre +", ");
         return fibonaciRecursive(nombre - 1) + fibonaciRecursive(nombre - 2);
   }    
}
