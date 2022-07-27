package com.intecap.curso.tareas.primera;

import java.util.Scanner;

/**
 *
 * @author amcc
 */
public class NumeroNegativo {
    
    public static void main(String[] args) {     
        Scanner teclado = new Scanner(System.in);
   
       int num;
       System.out.println("Ingrese una cantidad:");
       num = teclado.nextInt();
       
       if (num < 0) {
           System.out.println("Es numero negativo");
       }
       else{
           System.out.println("Es numero positivo");
       }
    }    
}
