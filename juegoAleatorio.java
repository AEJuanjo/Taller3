import java.util.Scanner;

public class juegoAleatorio {

    public static void main(String[] args) {
        
        // V.E

        int n, m;

        int intentos = 0;

        // V.S

        String mensaje;

        // V.A

        int numeroSecreto;

        int contadorIntentos = 0;

        Scanner sc = new Scanner(System.in);

        // PROCESO

        try {

            System.out.println("=== JUEGO: ADIVINA EL NUMERO ===");

            System.out.print("Ingrese el valor minimo del rango: ");
            n = sc.nextInt();
            sc.nextLine();

            System.out.print("Ingrese el valor maximo del rango: ");
            m = sc.nextInt();
            sc.nextLine();

            while (n > m) {
                
                System.out.println("Error: El valor minimo del rango no puede ser mayor que el valor maximo. Ingrese nuevamente los valores.");

                System.out.print("Ingrese el valor minimo del rango: ");
                n = sc.nextInt();
                sc.nextLine();

                System.out.print("Ingrese el valor maximo del rango: ");
                m = sc.nextInt();
                sc.nextLine();

            }

            numeroSecreto = (int) (Math.random() * (m - n + 1)) + n;

            do {
                
                System.out.println("Ingrese su intento: ");
                intentos = sc.nextInt();
                sc.nextLine();

                contadorIntentos++;

                if (intentos < numeroSecreto) {
                    mensaje = "El numero secreto es mayor. Intente de nuevo.";
                } else if (intentos > numeroSecreto) {
                    mensaje = "El numero secreto es menor. Intente de nuevo.";
                }

                if (intentos >= numeroSecreto - 2 && intentos <= numeroSecreto + 2 && intentos != numeroSecreto) {
                    
                    System.out.println("Estas muy cerca del numero secreto!");

                } else if (intentos >= numeroSecreto - 5 && intentos <= numeroSecreto + 5 && intentos != numeroSecreto) {

                    System.out.println("Estas cerca del numero secreto!");
                    
                } else if (intentos != numeroSecreto) {
                    
                    System.out.println("Estas lejos del numero secreto!");

                }

            } while (intentos != numeroSecreto);

            mensaje = "¡Felicidades! Has adivinado el numero secreto en " + contadorIntentos + " intentos.";

            System.out.println(mensaje);
            
        } catch (Exception e) {
            
            System.out.println("Error: Solo se permite el ingreso de numeros enteros");

        }

    }

}