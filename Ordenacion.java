import java.util.Scanner;

class Ordenacion {
    public void ejer3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el primer número");
        int numero1 = scanner.nextInt();
        System.out.println("Ingresa el segundo número");
        int numero2 = scanner.nextInt();
        System.out.println("Ingrese el último número");
        int numero3 = scanner.nextInt();

        /* Parte de Juan desde aca */

        // if (numero1 == numero2 || numero1 == numero3 || numero2 == numero3) {
        //     System.out.println("Uno de los valores es inválido o está repetido");
        // }
        // if (numero1 > numero2 & numero2 > numero3) {
        //     System.out.println("El número mayor es: " + numero1);
        //     System.out.println("El número del medio es: " + numero2);
        //     System.out.println("El número menor es: " + numero3);
        // } else {
        //     if (numero1 > numero2 & numero2 < numero3 & numero1 > numero3) {
        //         System.out.println("El número mayor es: " + numero1);
        //         System.out.println("El número del medio es: " + numero3);
        //         System.out.println("El número menor es: " + numero2);
        //     } else {
        //         if (numero2 > numero1 & numero1 > numero3) {
        //             System.out.println("El número mayor es: " + numero2);
        //             System.out.println("El número del medio es: " + numero1);
        //             System.out.println("El número menor es: " + numero3);
        //         } else {
        //             if (numero2 > numero1 & numero1 < numero3 & numero2 > numero3) {
        //                 System.out.println("El número mayor es: " + numero2);
        //                 System.out.println("El número del medio es: " + numero3);
        //                 System.out.println("El número menor es: " + numero1);
        //             } else {
        //                 if (numero3 > numero1 & numero1 > numero2) {
        //                     System.out.println("El número mayor es: " + numero3);
        //                     System.out.println("El número del medio es: " + numero1);
        //                     System.out.println("El número menor es: " + numero2);
        //                 } else {
        //                     if (numero3 > numero1 & numero1 < numero2 & numero3 > numero2) {
        //                         System.out.println("El número mayor es: " + numero3);
        //                         System.out.println("El número del medio es: " + numero2);
        //                         System.out.println("El número menor es: " + numero1);
        //                     }
        //                 }
        //             }
        //         }
        //     }
        // }

        /* Parte de Juan hasta aca */
        /* Parte de Hawrisson desde aca */
        int mayor = numero1, menor = numero1, medio;

        // Revalidar que los números no sean iguales
        if (numero1 == numero2 || numero1 == numero3 || numero2 == numero3) {
            System.out.println("Uno de los valores es inválido o está repetido");
            return;
        }

        // Actualizar con numero2
        if (numero2 > mayor) {
            mayor = numero2;
        }
        if (numero2 < menor) {
            menor = numero2;
        }

        // Actualizar con numero3
        if (numero3 > mayor) {
            mayor = numero3;
        }
        if (numero3 < menor) {
            menor = numero3;
        }

        // El medio se obtiene por resta de la suma total menos mayor y menor
        medio = numero1 + numero2 + numero3 - mayor - menor;

        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número del medio es: " + medio);
        System.out.println("El número menor es: " + menor);
    }
}