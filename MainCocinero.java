import java.util.Scanner;

public class MainCocinero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Cocinero cociner1=null, cociner2=null, cociner3=null;


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

            if (i==0){
                cociner1=new Cocinero(nombre,anio_experiencia,especialidad);
            }else if (i==1){
                cociner2=new Cocinero(nombre,anio_experiencia,especialidad);
            }else if (i==2){
                cociner3=new Cocinero(nombre,anio_experiencia,especialidad);
            }
        }

        cociner1.mostrar_info();
        cociner2.mostrar_info();
        cociner3.mostrar_info();
    }
}
