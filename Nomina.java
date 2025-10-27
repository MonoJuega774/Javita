import java.util.Scanner;

class Nomina {
    public void ejer6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese número de horas trabajadas: ");
        int horas = scanner.nextInt();
        System.out.println("Ingrese valor hora: ");
        double valor = scanner.nextDouble();
        System.out.println("Ingrese valor salario mínimo mensual: ");
        double minimo = scanner.nextDouble();

        double salario = horas * valor;

        if (salario > minimo) {
            System.out.println("Nombre: " + nombre);
            System.out.println("Salario mensual: " + salario);
        }
        else {
            System.out.println("Nombre: " + nombre);
        }
    }
}
