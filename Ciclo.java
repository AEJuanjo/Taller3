import java.util.InputMismatchException;
import java.util.Scanner;

public class Ciclo {

    public static void main(String[] args) {

        try {
    
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        while(opcion !=1) {
 
        System.out.println("╔╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╗");
        System.out.println("╠╬╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╬╣");
        System.out.println("╠╣                                                            ╠╣");
        System.out.println("╠╣                       MENU DE CICLOS                       ╠╣");
        System.out.println("╠╣                                                            ╠╣");
        System.out.println("╠╣                                                            ╠╣");
        System.out.println("╠╣                                                            ╠╣");
        System.out.println("╠╣                         1. Salir                           ╠╣");
        System.out.println("╠╣                                                            ╠╣");
        System.out.println("╠╣                                                            ╠╣");
        System.out.println("╠╣              2. Suma N-avo número de fibonacci             ╠╣");
        System.out.println("╠╣                                                            ╠╣");
        System.out.println("╠╣                                                            ╠╣");
        System.out.println("╠╣                   3. N-avo numero primo                    ╠╣");
        System.out.println("╠╣                                                            ╠╣");
        System.out.println("╠╣                                                            ╠╣");
        System.out.println("╠╣               4. Raíces ecuación cuadratica                ╠╣");
        System.out.println("╠╣                                                            ╠╣");
        System.out.println("╠╣                                                            ╠╣");
        System.out.println("╠╣                    5. Promedio n numeros                   ╠╣");
        System.out.println("╠╣                                                            ╠╣");
        System.out.println("╠╣                                                            ╠╣");
        System.out.println("╠╣                                                            ╠╣");
        System.out.println("╠╣                                                            ╠╣");
        System.out.println("╠╣                                                            ╠╣");
        System.out.println("╠╣                                                            ╠╣");
        System.out.println("╠╣                                                            ╠╣");
        System.out.println("╠╬╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╬╣");
        System.out.println("╚╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╝");

            opcion = sc.nextInt();
            
            if (opcion == 2 ) {

                // V.E

                int a = 0, b = 1, c = 0, n; // a y b son los dos primeros numeros de la serie de Fibonacci, c es el siguiente numero de la serie, n es la cantidad de numeros a mostrar

                // V.S

                // V.A

                // PROCESO

                System.out.println("Ingrese el N-Esimo numero de Fibonacci que quiere mostrar: "); // cantidad de numero a mostrar
                n = sc.nextInt();

                do { // ciclo para mostrar los numeros de la serie de Fibonacci hasta el N-Esimo numero
                  
                System.out.println(a);

                c = a + b;
                a = b;
                b = c;

                } while (--n > 0); // decrementa n para mostrar el siguiente numero de la serie de Fibonacci hasta llegar a 0

            }

            else if (opcion == 3 ) {

                // V.E

                int divisores = 2, n, contador = 2; // divisores es la cantidad de divisores que tiene el numero, n es el numero a evaluar, contador es la cantidad de numeros primos encontrados

                // V.S

                // V.A

                // PROCESO

                System.out.println("Ingrese el N-Esimo numero primo que quiere mostrar: "); // cantidad de numero a mostrar
                n = sc.nextInt();

                while (contador < n) {
                    
                    if (n % contador == 0) {
                        
                        divisores++;
                        break;

                    }
                    contador++;

                }
                if (divisores > 2) {
                    
                    System.out.println("El numero " + n + " no es primo");

                } else {
                    System.out.println("El numero " + n + " es primo");
                }

            }
            else if (opcion == 4) {
            
            double a, b, c;
            double primerX, segundoX, d;

            System.out.println("Ingrese valor de a: ");
            a = sc.nextDouble();
            System.out.println("Ingrse valor de b: ");
            b = sc.nextDouble();
            System.out.println("Ingrese valor de c: ");
            c = sc.nextDouble();
            
            d = (b*b) - (4*a*c);

            if (d<0){
                System.out.println("ERROR: el número debe ser mayor a 0");
            } else {
                
                primerX = -b + Math.sqrt(d) / (2*a);
                segundoX = -b - Math.sqrt(d) / (2*a);

            System.out.println("X1 = " + primerX);
            System.out.println("X2 = " + segundoX);
            
            }
            }
            else if (opcion == 5) {
             System.out.println("Ingrese la cantidad de numeros: ");
             int n = sc.nextInt();
             double suma = 0;
             double promedio;
                for (int i = 1; i <= n; i++){
                    suma = suma + i;
                }
            promedio = suma / 2;    

                System.out.println("Promedio de los primeros " + n + " numeros es: " + promedio);

                

            }
            else if (opcion !=1){

            System.out.println("ERROR: Opción invalida");

            }
            
        }

        } catch (InputMismatchException e) {

            System.out.println("Error: Debe ingresar un valor válido."); // mensaje de error si el usuario ingresa un valor no entero

        }

    }
        


    
        
}
