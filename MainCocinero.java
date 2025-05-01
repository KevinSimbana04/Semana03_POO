import java.util.Scanner;

public class MainCocinero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Cocinero[] cocineros= new Cocinero[3];

        for(int i=0; i<3; i++){
            System.out.println("Ingrese sus datos N:" +(i+1) );
            System.out.print("------------------------------------\n");
            System.out.print("Ingrese su nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Ingrese los años de experiencia: ");
            int anio_experiencia = sc.nextInt();
            sc.nextLine();
            System.out.print("Ingrese la especialida: ");
            String especialidad = sc.nextLine();
        }

    }
}
