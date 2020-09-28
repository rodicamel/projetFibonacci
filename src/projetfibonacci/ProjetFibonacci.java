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
        String message1 ="Saisir le nombre entier positif: ";
        String message2 = "Le nombre doit ertre un entier: ";
        String message3 = "Choisir la metode : (1) -Classique;  (2) -Recoursive";
        String message4 = "La chaine Fibonacci: ";
        String message5 = "Exception type de nombre";
        String message6 = "Erreur. Le nombre de la metote n'est pas correct";
                
                
        FibonaciRecursive objRec = new FibonaciRecursive();
      //  FibonaciClassic objCls = new FibonacciClassic();
        
        do{
            System.out.println(message1);
            try {
                
            nombre = new Scanner(System.in).nextInt(); 
                if(nombre <0)
                {
                    System.out.println(message2);
                    control = true;
                }
                System.out.println(message3);
                int metode =new Scanner(System.in).nextInt(); 
                
                System.out.println(message4);
                switch(metode){
                    case 1:   
                         // objCls.affichFibonacciClassic(nombre); 
                        break;
                     case 2:   
                         objRec.afficherFibonacci(nombre);                        
                        break;  
                     default : control = true;
                        System.out.println(message6);
                }
            } catch(Exception e) {
                System.out.println(message5);
            }
                   
        }while(control);   
    } 
}
