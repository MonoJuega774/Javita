import java.util.Scanner;

class Bisiesto {
    public void ejer5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese año: ");
        int año = scanner.nextInt();

        if (año % 4 == 0 & año % 100 != 0 || año % 400 == 0) {
            System.out.println("El año: " + año + ", si es bisiesto");
        }
        else {
            System.out.println("El año: " + año + ", no es bisiesto");
        }
    }
}
