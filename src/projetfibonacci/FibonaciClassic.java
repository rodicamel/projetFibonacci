/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetfibonacci;

/**
 *
 * @author 
 * 
 */
class FibonaciClassic {
    public static void affichFibonacciClassic(int count){
        int nbr1=0, nbr2=1, nbr3=0, i;
        
    //print 0 and 1
        System.out.print(nbr1+" "+nbr2);   
    
        //La boucle commence par 2 car 0 et 1 sont deja affiches
        for(i=2; i<count; ++i)
        {    
            nbr3 = nbr1 + nbr2;       
            nbr1 = nbr2;    
            nbr2 = nbr3;  
            System.out.print(" "+nbr3); 
        }        
    }
}
