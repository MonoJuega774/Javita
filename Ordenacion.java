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


        if (numero1 == numero2 || numero1 == numero3 || numero2 == numero3) {
            System.out.println("Uno de los valores es inválido o está repetido");
        }
        if (numero1 > numero2 & numero2 > numero3) {
            System.out.println("El número mayor es: " + numero1);
            System.out.println("El número del medio es: " + numero2);
            System.out.println("El número menor es: " + numero3);
        } else {
            if (numero1 > numero2 & numero2 < numero3 & numero1 > numero3) {
                System.out.println("El número mayor es: " + numero1);
                System.out.println("El número del medio es: " + numero3);
                System.out.println("El número menor es: " + numero2);
            } else {
                if (numero2 > numero1 & numero1 > numero3) {
                    System.out.println("El número mayor es: " + numero2);
                System.out.println("El número del medio es: " + numero1);
                System.out.println("El número menor es: " + numero3);
                } else {
                    if (numero2 > numero1 & numero1 < numero3 & numero2 > numero3) {
                        System.out.println("El número mayor es: " + numero2);
                System.out.println("El número del medio es: " + numero3);
                System.out.println("El número menor es: " + numero1);
                    } else {
                        if (numero3 > numero1 & numero1 > numero2) {
                            System.out.println("El número mayor es: " + numero3);
                System.out.println("El número del medio es: " + numero1);
                System.out.println("El número menor es: " + numero2);
                        } else {
                            if (numero3 > numero1 & numero1 < numero2 & numero3 > numero2) {
                                System.out.println("El número mayor es: " + numero3);
                System.out.println("El número del medio es: " + numero2);
                System.out.println("El número menor es: " + numero1);
                            }
                        }
                    }
                }
            }
        }


    }
}