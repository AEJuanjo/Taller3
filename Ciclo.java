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

                int numeroUno = 0; // cantidad de numero a mostrar

                int a = 0, b = 1; // numeros de la serie

                int suma = 0; // suma total de la serie

                // V.S

                // V.A

                int numeroSiguiente = 0; // numero siguiente de la serie

                // PROCESO

                System.out.println("Ingrese un numero: "); // cantidad de numero a mostrar
                numeroUno = sc.nextInt();

                // El siguiente numero = a la suma de los dos anteriores

                for (int i = 0; i < numeroUno; i++) { // ciclo para mostrar la serie de fibonacci

                    System.out.println(" | ------ Fibonacci: " + a + " ------ | ");

                    suma += a;

                    System.out.println(" | ------ Suma acumulada: " + suma + " ------ | ");

                    numeroSiguiente = a + b;

                    a = b;

                    b = numeroSiguiente;

                }

                System.out.println(" | --------------------------------------| ");

                System.out.println(" | ------La Suma total: " + suma + " ------ | "); // muestra la suma total de la serie de fibonacci

            }

            else if (opcion == 3 ) {

                int posicion = 0; // Posicion del numero primo a mostrar

                int contador = 0; // contador de numeros primos

                int numero = 2; // numero a evaluar

                int divisor; // divisor para evaluar si el numero es primo

                System.out.println("Ingrese el N-Esimo numero primo que quiere mostrar "); // cantidad de numero a mostrar
                posicion = sc.nextInt();

                while (contador < posicion) { // ciclo para encontrar el numero primo en la posicion indicada

                    divisor = 0;
                    
                    for (int i = 1; i <= numero; i++) { // ciclo para evaluar si el numero es primo
                        
                        if (numero % i == 0) { // si el numero es divisible por i, entonces es un divisor
                            
                            divisor++;
                            
                        }
                        
                    }

                    if (divisor == 2) { // si el numero tiene solo 2 divisores, 1 y el mismo, entonces es primo
                        
                        contador++;

                    }

                    numero++; // incrementa el numero para evaluar el siguiente numero

                }

                System.out.println("El numero primo es: " + (numero - 1)); // muestra el numero primo encontrado

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
