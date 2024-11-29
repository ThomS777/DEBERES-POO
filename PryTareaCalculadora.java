

package com.mycompany.prytareacalculadora;

import java.util.Scanner;


public class PryTareaCalculadora {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int opcion;
        double num1, num2, resultado = 0;

        System.out.println("¡Bienbenido a la calculadora interactiva!");
        do {
            System.out.println("\nQue operacion quieres hacer?");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elije una opcion (1-5): ");
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingresa el primer numero: ");
                num1 = scanner.nextDouble();

                System.out.print("Ingresa el segundo numero: ");
                num2 = scanner.nextDouble();

                switch (opcion) {
                    case 1:
                        resultado = num1 + num2;
                        System.out.println("El resultado de la suma es: " + resultado);
                        break;
                    case 2:
                        resultado = num1 - num2;
                        System.out.println("El resultado de la resta es: " + resultado);
                        break;
                    case 3:
                        resultado = num1 * num2;
                        System.out.println("El resultado de la multiplicacion es: " + resultado);
                        break;
                    case 4:
                        if (num2 != 0) {
                            resultado = num1 / num2;
                            System.out.println("El resultado de la division es: " + resultado);
                        } else {
                            System.out.println("Error! No se puede dividir entre cero.");
                        }
                        break;
                }
            } else if (opcion != 5) {
                System.out.println("Esa opcion no es valida. Elije un numero del 1 al 5.");
            }
        } while (opcion != 5);

        System.out.println("Gracias por usar la calculadora! Adios!");
        scanner.close();
    }
}
        
    

