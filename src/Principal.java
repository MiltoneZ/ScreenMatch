public class Principal {
    public static void main(String[] args) {
        // A la clase Pelicula se crea una sub-clase que sera miPelicula.
        // La cual se le agregara los valores siguientes:
        Pelicula miPelicula = new Pelicula();

        miPelicula.nombre = "Encanto";
        miPelicula.fechaDeLanzamiento = 2021;
        miPelicula.duracionEnMinutos = 120;
        // Utiliza las variables determinadas en la clase Pelicula.
        // Dentro de esta se presentan con los valores asignados dentro de esta clase.
        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(9);
        miPelicula.evalua(10);
        System.out.println(miPelicula.calularMedia());

        Pelicula otraPelicula = new Pelicula();

        otraPelicula.nombre = "Matrix";
        otraPelicula.fechaDeLanzamiento = 1998;
        otraPelicula.duracionEnMinutos = 180;
        otraPelicula.muestraFichaTecnica();
    }
}
