import java.util.Scanner;

class Par {
    public void ejer1() {
        Scanner scanner = new Scanner(System.in);
    System.out.println("Número es par o no:");
        System.out.println("Ingresa un número:");
        Integer numero = scanner.nextInt();
        if (numero%2==0){
            System.out.println("El "+ numero + " es par");
        }
        else {
            System.out.println("El "+ numero + " es impar");
        }
    }
}