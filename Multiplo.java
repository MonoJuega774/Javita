import java.util.Scanner;

class Multiplo {
    public void ejer4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese primer número: ");
        int numero1 = scanner.nextInt();
        System.out.println("Ingrese segundo número: ");
        int numero2 = scanner.nextInt();

        if (numero2 % numero1 == 0) {
            System.out.println("El número: " + numero2 + ", es múltiplo de: " + numero1);
        } else {
            System.out.println("El número: " + numero2 + ", no es múltiplo de: " + numero1);
        }
    }
}
