import java.util.Scanner;

public class Tablas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;

        System.out.println("*****************************");
        System.out.println("*   TABLA DE MULTIPLICAR   *");
        System.out.println("*****************************");

        while (true) {
            System.out.print(">>> Ingresa un numero entero: ");
            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();
                break;
            } else {
                System.out.println("  /!\\ Error: ingresa un numero valido.");
                scanner.nextLine();
            }
        }

        System.out.println();
        System.out.println("+-------+----+--------+");
        System.out.println("| Tabla del " + numero + "          |");
        System.out.println("+-------+----+--------+");
        for (int i = 1; i <= 10; i++) {
            System.out.println("| " + numero + "  x  " + i + "  =  " + (numero * i) + "     |");
        }
        System.out.println("+-------+----+--------+");

        scanner.close();
    }
}
