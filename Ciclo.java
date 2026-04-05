import java.util.InputMismatchException;
import java.util.Scanner;

public class Ciclo {

    public static void main(String[] args) {

        try {

            Scanner sc = new Scanner(System.in);
            int opcion = 0;

            while (opcion != 5) {

                System.out.println("  ╔╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╗");
                System.out.println("  ╠╬╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╬╣");
                System.out.println("  ╠╣                                                            ╠╣");
                System.out.println("  ╠╣   ███╗   ███╗███████╗███╗   ██╗██╗   ██╗                   ╠╣");
                System.out.println("  ╠╣   ████╗ ████║██╔════╝████╗  ██║██║   ██║                   ╠╣");
                System.out.println("  ╠╣   ██╔████╔██║█████╗  ██╔██╗ ██║██║   ██║                   ╠╣");
                System.out.println("  ╠╣   ██║╚██╔╝██║██╔══╝  ██║╚██╗██║██║   ██║                   ╠╣");
                System.out.println("  ╠╣   ██║ ╚═╝ ██║███████╗██║ ╚████║╚██████╔╝                   ╠╣");
                System.out.println("  ╠╣   ╚═╝     ╚═╝╚══════╝╚═╝  ╚═══╝ ╚═════╝                    ╠╣");
                System.out.println("  ╠╣                                                            ╠╣");
                System.out.println("  ╠╬╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╬╣");
                System.out.println("  ╠╬╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╬╣");
                System.out.println("  ╠╣                         MENÚ                               ╠╣");
                System.out.println("  ╠╣                                                            ╠╣");
                System.out.println("  ╠╣   1. Serie de Fibonacci                                    ╠╣");
                System.out.println("  ╠╣   2. N-ésimo número primo                                  ╠╣");
                System.out.println("  ╠╣   3. Raíces ecuación cuadrática                            ╠╣");
                System.out.println("  ╠╣   4. Promedio n números                                    ╠╣");
                System.out.println("  ╠╣   5. Salir                                                 ╠╣");
                System.out.println("  ╠╣                                                            ╠╣");
                System.out.println("  ╠╬╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╬╣");
                System.out.println("  ╚╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╝");

                System.out.print("Seleccione una opción: ");
                opcion = sc.nextInt();

                if (opcion == 1) {

                    System.out.println();
                    System.out.println("+------------------------------+");
                    System.out.println("|   Serie de Fibonacci         |");
                    System.out.println("+------------------------------+");

                    System.out.print("Ingrese el N: ");
                    int n = sc.nextInt();

                    if (n > 92) {

                        System.out.println("ERROR: El número es mas grande de lo permitido.");

                        System.out.println("Máximo permitido: 92");

                    } else if (n < 0) {

                        System.out.println("ERROR: No se permiten números negativos.");

                    } else {

                        long a = 0, b = 1, c;

                        System.out.println("+------------------------------+");

                        for (int i = 0; i < n; i++) {
                            System.out.println("| " + a);
                            c = a + b;
                            a = b;
                            b = c;
                        }

                        System.out.println("+------------------------------+");
                    }

                } else if (opcion == 2) {

                    System.out.println();
                    System.out.println("+------------------------------+");
                    System.out.println("|   N-ésimo número primo       |");
                    System.out.println("+------------------------------+");

                    System.out.print("Ingrese la posición (N): ");
                    int n = sc.nextInt();

                    int contador = 0;
                    int numero = 2;

                    while (contador < n) {

                        boolean esPrimo = true;

                        for (int i = 2; i <= Math.sqrt(numero); i++) {
                            if (numero % i == 0) {
                                esPrimo = false;
                                break;
                            }
                        }

                        if (esPrimo) {
                            contador++;
                        }

                        numero++;
                    }

                    System.out.println("+------------------------------+");
                    System.out.println("| El primo #" + n + " es: " + (numero - 1));
                    System.out.println("+------------------------------+");

                } else if (opcion == 3) {

                    System.out.println();
                    System.out.println("  +-----------------------------------------+");
                    System.out.println("  |   Raíces ecuación cuadrática            |");
                    System.out.println("  |        ax^2  +  bx  +  c  =  0          |");
                    System.out.println("  +-----------------------------------------+");

                    double a, b, c, x1, x2, d;

                    System.out.print("Ingrese valor de a: ");
                    a = sc.nextDouble();
                    System.out.print("Ingrese valor de b: ");
                    b = sc.nextDouble();
                    System.out.print("Ingrese valor de c: ");
                    c = sc.nextDouble();

                    d = (b * b) - (4 * a * c);

                    System.out.println("  +-----------------------------------------+");

                    if (d < 0) {
                        System.out.println("  |  ERROR: no hay soluciones reales");
                    } else {
                        x1 = (-b + Math.sqrt(d)) / (2 * a);
                        x2 = (-b - Math.sqrt(d)) / (2 * a);
                        System.out.println("  |  X1 = " + x1);
                        System.out.println("  |  X2 = " + x2);
                    }

                    System.out.println("  +-----------------------------------------+");
                    System.out.println();

                } else if (opcion == 4) {

                    System.out.println();
                    System.out.println("  +-----------------------------------------+");
                    System.out.println("  |   Promedio n números                    |");
                    System.out.println("  +-----------------------------------------+");

                    System.out.print("Ingrese la cantidad de números: ");
                    int n = sc.nextInt();

                    double suma = 0;

                    for (int i = 1; i <= n; i++) {
                        System.out.print("Ingrese número " + i + ": ");
                        double num = sc.nextDouble();
                        suma += num;
                    }

                    double promedio = suma / n;

                    System.out.println("  +-----------------------------------------+");
                    System.out.println("  |  Promedio = " + promedio);
                    System.out.println("  +-----------------------------------------+");
                    System.out.println();

                } else if (opcion == 5) {

                    System.out.println();
                    System.out.println("Saliendo del programa...");

                } else {

                    System.out.println();
                    System.out.println("  /!\\ ERROR: Opción inválida");
                    System.out.println();
                }
            }

            sc.close();

        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar un valor válido.");
        }
    }
}