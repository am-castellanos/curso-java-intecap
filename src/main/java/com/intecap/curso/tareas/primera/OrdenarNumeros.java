package com.intecap.curso.tareas.primera;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author amcc
 */
public class OrdenarNumeros {

    public static void main(String args[]) {

        final var numbers = new ArrayList<Double>();
        final var scanner = new Scanner(System.in);

        var number = 0.00;
        while (true) {

            System.out.print("Ingrese un numero: ");
            number = scanner.nextDouble();

            if (number == -3.1416) {

                break;
            }

            numbers.add(number);
        }

        System.out.println("Numeros ingresados: " + numbers);

        final var sortedList = numbers.stream()
                .sorted().toList();

        System.out.println("Numeros ordenados: " + sortedList);
    }    
}
