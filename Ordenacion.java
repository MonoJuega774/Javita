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

        int mayor1 = Math.max(numero1, numero2);
        int mayor2 = Math.max(mayor1, numero3);

        switch (mayor2) {
            case mayor1:
                if (numero3 >= numero2) {
                    System.out.println("El número mayor es: "+ mayor1);
                    System.out.println("El número del medio es: "+ numero3);
                    System.out.println("El número menor es: "+ numero2);
                }
                else {
                    System.out.println("El número mayor es: "+ mayor1);
                    System.out.println("El número del medio es: "+ numero2);
                    System.out.println("El número menor es: "+ numero3);
                }
                break;
        
            default:
                break;
        }
    }
}
