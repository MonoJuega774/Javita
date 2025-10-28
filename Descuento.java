import java.util.Scanner;

class Descuento {
    public void ejer7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Número de escritorios: ");
        int escritorios = scanner.nextInt();
        double valor_escritorio = 650000;
        double valor_final, descuento, total;
        total = escritorios * valor_escritorio;

        if (escritorios <= 0) {
            System.out.println("No puede comprar 0 o menos escritorios");
        } else {
            if (escritorios < 5) {
                descuento = total * 0.10;
                valor_final = total - descuento;
                System.out.println("El valor a pagar es: " + valor_final);
            } else {
                if (escritorios >= 5 & escritorios < 10) {
                    descuento = total * 0.20;
                    valor_final = total - descuento;
                    System.out.println("El valor a pagar es: " + valor_final);
                } else {
                    descuento = total * 0.40;
                    valor_final = total - descuento;
                    System.out.println("El valor a pagar es: " + valor_final);
                }
            }
        }
    }
}
