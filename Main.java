import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        int opcion = 0;
        boolean condicion = true;
        while (condicion) {
            System.out.println("---------- MENÚ ----------");
            System.out.println("[1] Ejercicio: Número es par o impar");
            System.out.println("[2] Ejercicio: Número mayor");
            System.out.println("[0] Salir");
            System.out.println("--------------------------");
            System.out.println("Opción: ");
            opcion = tec.nextInt();

            switch (opcion) {
            // Par o impar
            case 1:
                Par par = new Par();
                par.ejer1();
                break;
            // Número mayor???
            case 2:
                Mayor mayor = new Mayor();
                mayor.ejer2();
                break;
            case 0:
                condicion = false;
                System.out.println("Saliste");
                break;
            default:
            System.out.println("Opción inválida, intente nuevamente");
        }

        }
    }
}