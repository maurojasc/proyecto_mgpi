/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ing_sw_2019;

import java.util.Scanner;

/**
 *
 * @author Hernan Javier
 */
public class Ing_sw_2019 {

    public static void main(String[] args) {
        System.out.println(factorial(5));
        int numero = leerNumero();
        while (numero > -1) {
            mostrarFactorial(numero);
            numero = leerNumero();
        }
        System.out.println("\nFin del programa");
        System.out.println.("revisado Mauricio Rojas");
    }

    private static void mostrarFactorial(int num) {
        System.out.printf("%n%d! = ", num);
        int fact = 1;
        if (num != 0) {
            for (int i = num; i > 0; i--) {
                fact *= i;
                System.out.print(i);
                if (i > 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print(" = ");
                }
            }
        }
        System.out.println(fact + "\n");
    }

    private static int leerNumero() {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número (negativo para terminar): ");
        num = sc.nextInt();
        return num;
    }
    
    static int factorial(int numero){
          if ( numero <= 1 ) {
              return 1;
          } else {
              return numero*factorial(numero-1);
          }
     }

}
