import java.util.InputMismatchException;
import java.util.Scanner;

public class Ciclo {

    public static void main(String[] args) {

        try {

            Scanner sc = new Scanner(System.in);
            int opcion = 0;

            while (opcion != 1) {

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
                System.out.println("  ╠╣                                                            ╠╣");
                System.out.println("  ╠╣                         1. Salir                           ╠╣");
                System.out.println("  ╠╣                                                            ╠╣");
                System.out.println("  ╠╣              2. Suma N-avo número de fibonacci             ╠╣");
                System.out.println("  ╠╣                                                            ╠╣");
                System.out.println("  ╠╣                   3. N-avo numero primo                    ╠╣");
                System.out.println("  ╠╣                                                            ╠╣");
                System.out.println("  ╠╣               4. Raíces ecuación cuadratica                ╠╣");
                System.out.println("  ╠╣                                                            ╠╣");
                System.out.println("  ╠╣                    5. Promedio n numeros                   ╠╣");
                System.out.println("  ╠╣                                                            ╠╣");
                System.out.println("  ╠╬╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╬╣");
                System.out.println("  ╚╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╝");

                opcion = sc.nextInt();

                if (opcion == 2) {

                    System.out.println();
                    System.out.println("  +-----------------------------------------+");
                    System.out.println("  |   Suma N-avo numero de fibonacci         ");
                    System.out.println("  +-----------------------------------------+");

                    int a = 0, b = 1, c = 0, n;

                    System.out.println("Ingrese el N-Esimo numero de Fibonacci que quiere mostrar: ");
                    n = sc.nextInt();

                    System.out.println("  +-----------------------------------------+");
                    do {
                        System.out.println("  |  " + a);
                        c = a + b;
                        a = b;
                        b = c;
                    } while (--n > 0);
                    System.out.println("  +-----------------------------------------+");
                    System.out.println();

                } else if (opcion == 3) {

                    System.out.println();
                    System.out.println("  +-----------------------------------------+");
                    System.out.println("  |   N-avo numero primo                    |");
                    System.out.println("  +-----------------------------------------+");

                    int divisores = 2, n, contador = 2;

                    System.out.println("Ingrese el N-Esimo numero primo que quiere mostrar: ");
                    n = sc.nextInt();

                    while (contador < n) {
                        if (n % contador == 0) {
                            divisores++;
                            break;
                        }
                        contador++;
                    }

                    System.out.println("  +-----------------------------------------+");
                    if (divisores > 2) {
                        System.out.println("  |  El numero " + n + " no es primo");
                    } else {
                        System.out.println("  |  El numero " + n + " es primo");
                    }
                    System.out.println("  +-----------------------------------------+");
                    System.out.println();

                } else if (opcion == 4) {

                    System.out.println();
                    System.out.println("  +-----------------------------------------+");
                    System.out.println("  |   Raices ecuacion cuadratica            |");
                    System.out.println("  |        ax^2  +  bx  +  c  =  0          |");
                    System.out.println("  +-----------------------------------------+");

                    double a, b, c;
                    double primerX, segundoX, d;

                    System.out.println("Ingrese valor de a: ");
                    a = sc.nextDouble();
                    System.out.println("Ingrse valor de b: ");
                    b = sc.nextDouble();
                    System.out.println("Ingrese valor de c: ");
                    c = sc.nextDouble();

                    d = (b * b) - (4 * a * c);

                    System.out.println("  +-----------------------------------------+");
                    if (d < 0) {
                        System.out.println("  |  ERROR: el numero debe ser mayor a 0");
                    } else {
                        primerX = -b + Math.sqrt(d) / (2 * a);
                        segundoX = -b - Math.sqrt(d) / (2 * a);
                        System.out.println("  |  X1 = " + primerX);
                        System.out.println("  |  X2 = " + segundoX);
                    }
                    System.out.println("  +-----------------------------------------+");
                    System.out.println();

                } else if (opcion == 5) {

                    System.out.println();
                    System.out.println("  +-----------------------------------------+");
                    System.out.println("  |   Promedio n numeros                    |");
                    System.out.println("  +-----------------------------------------+");

                    System.out.println("Ingrese la cantidad de numeros: ");
                    int n = sc.nextInt();
                    double suma = 0;
                    double promedio;

                    for (int i = 1; i <= n; i++) {
                        suma = suma + i;
                    }

                    promedio = suma / 2;

                    System.out.println("  +---------------------------------------------------------------+");
                    System.out.println("    |  Promedio de los primeros " + n + " numeros es: " + promedio);
                    System.out.println("  +---------------------------------------------------------------+");
                    System.out.println();

                } else if (opcion != 1) {
                    System.out.println();
                    System.out.println("  /!\\ ERROR: Opcion invalida");
                    System.out.println();
                }
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar un valor valido.");
        }
    }
}
