import java.util.Scanner;

public class Ciclo {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        while(opcion !=1) {
            System.out.println("=============MENU=============");
            System.out.println("1. Salir");
            System.out.println("2. Suma N-avo número de fibonacci");
            System.out.println("3. N-avo numero primo");
            System.out.println("4. Raíces ecuación cuadratica");
            System.out.println("4. Promedio n numeros");

            opcion = sc.nextInt();
            
            if (opcion == 2 ) {



            }

            if (opcion == 3 ) {



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
            else if (opcion == 4) {


                

            }
            else if (opcion !=1){

            System.out.println("ERROR: Opción invalida");

            }
            
        }
    }
        

}
