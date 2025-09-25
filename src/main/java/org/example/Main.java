package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Cómo te llamas?:");
        String nombre = entrada.nextLine();
        System.out.println("¿A qué curso vas?:");
        String curso = entrada.nextLine();
        System.out.println("Hola " + nombre + ", bienvenid@ a " + curso);

        System.out.println("Introduce un numero");
        int numero1 = entrada.nextInt();
        System.out.println("Introduce otro numero");
        int numero2 = entrada.nextInt();
        int result = numero1 + numero2;
        System.out.println("El resultado de sumar los 2 numeros es: " + result);
        }
    }

