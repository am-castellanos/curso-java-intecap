package com.intecap.curso.tareas.primera;

import java.util.Scanner;

/**
 *
 * @author amcc
 */
public class NumeroIgual {

    public static void main(String [] args) {
        
        Scanner teclado = new Scanner(System.in);
        
       int num1,num2;
       System.out.println("Ingrese Primer numero:");
       num1 = teclado.nextInt();
       System.out.println("Ingrese Segundo numero:");
       num2 = teclado.nextInt();
       
       if (num1 == num2) {
           System.out.println("Son iguales");
       }
       else{
           System.out.println("No son iguales");
       }        
    }
}
