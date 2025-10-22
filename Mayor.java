import java.util.Scanner;

class Mayor {
    public void ejer2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numero mayor:      ");
        System.out.println("Ingresa el primero de los 3 números:");
        Integer numero1 = scanner.nextInt();
        System.out.println("Ingresa el segundo número:");
        Integer numero2 = scanner.nextInt();
        System.out.println("Por último, ingresa el tercer número:");
        Integer numero3 = scanner.nextInt();
        Integer mayor1 = Math.max(numero1, numero2);
        Integer mayor2 = Math.max(mayor1, numero3);
        System.out.println("El número mayor es: " + mayor2);
    }
}
