public class Cocinero {

    //atributos para la clase cocinero

    String nombre;
    int anio_experiencia;
    String especialidad;


    //constructor
    public Cocinero(String nombre, int anio_experiencia, String especialidad) {
        this.nombre = nombre;
        this.anio_experiencia = anio_experiencia;
        this.especialidad = especialidad;
    }

    //metodos (Acciones)

    public void mostrar_info(){

        System.out.println("Informacion del cocinero\n");
        System.out.println("-------------------------------------\n");
        System.out.println("Nombre: " + nombre);
        System.out.println("Anio experiencia: " + anio_experiencia);
        System.out.println("Especialidad: " + especialidad);
    }

}
