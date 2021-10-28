/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejwhile_2;

import java.util.Scanner;

/**
 *
 * @author Samuel Amaro
 */
public class EjWhile_2 {

    static Scanner sc = new Scanner(System.in);

    public static int menu() {
        System.out.println("\n****************************************************"
                + "\nSelecciona una opción:"
                + "\n 1. Ejercicio 1"
                + "\n 2. Ejercicio 2"
                + "\n 3. Ejercicio 3"
                + "\n 0. Salir"
                + "\n****************************************************\n");
        return sc.nextInt();
    }

    //Imprimir la tabla de un número hasta el 10
    public static void ejercicio1() {
        System.out.print("Imprimir tabla del: ");
        int num = sc.nextInt();
        int i = 1;
        while (i <= 10) {
            System.out.println(num + " * " + i + " = " + num * i);
            i++;
        }
    }

    //Imprimir la tabla de un número hasta un número máx
    public static void ejercicio2() {
        System.out.print("Imprimir tabla del: ");
        int num = sc.nextInt();
        System.out.print("Número máximo: ");
        int max = sc.nextInt();
        int i = 1;
        while (i <= max) {
            System.out.println(num + " * " + i + " = " + num * i);
            i++;
        }
    }

    //Imprimir la tabla de un número hasta un número máx pero solo 
    //multiplicando por los pares
    public static void ejercicio3() {
        System.out.print("Imprimir tabla del: ");
        int num = sc.nextInt();
        System.out.print("Número máximo: ");
        int max = sc.nextInt();
        int i = 2;
        while (i <= max) {
            System.out.println(num + " * " + i + " = " + num * i);
            i += 2;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int opcion = menu();
        while (opcion != 0) {
            switch (opcion) {
                case 1:
                    ejercicio1();
                    break;
                case 2:
                    ejercicio2();
                    break;
                case 3:
                    ejercicio3();
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
            opcion = menu();
        }
    }
}
