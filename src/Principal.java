import com.aluracursos.screenmatch.modelos.Pelicula;

public class Principal {
    public static void main(String[] args) {
        // A la clase com.aluracursos.screenmatch.modelos.Pelicula se crea una sub-clase que sera miPelicula.
        // La cual se le agregara los valores siguientes:
        Pelicula miPelicula = new Pelicula();

        miPelicula.setNombre("Encanto");
        miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);
        // Utiliza las variables determinadas en la clase com.aluracursos.screenmatch.modelos.Pelicula.
        // Dentro de esta se presentan con los valores asignados dentro de esta clase.
        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(9);
        miPelicula.evalua(10);
        System.out.println(miPelicula.calularMedia());

//        Pelicula otraPelicula = new Pelicula();
//
//        otraPelicula.nombre = "Matrix";
//        otraPelicula.fechaDeLanzamiento = 1998;
//        otraPelicula.duracionEnMinutos = 180;
//        otraPelicula.muestraFichaTecnica();
    }
}
