package instituto;

import java.util.TreeSet;

/**
 * Clase que permite crear objetos de tipo Curso
 * @author Vespertino
 */
public class Curso {

    private String nombre;
    private TreeSet<Persona> listaAlumnos;

    /**
     * Metodo protegido que devuelve el nombre del curso.
     * @return
     */
    protected String getNombre() {
        return nombre;
    }

    /**
     * Constructor que permite crear un objeto de tipo Curso pasandole el nombre
     * como parámetro.
     * @param nombre 
     */
    public Curso(String nombre) {
        this.nombre = nombre;
        listaAlumnos = new TreeSet<>();
    }

    /**
     * Metodo que devuelve un curso en forma de String.
     * @return
     */
    @Override
    public String toString() {
        String s = "--------------------" + nombre + "-----------------\n";
        s += "NumExp\tNIF\t\tNombre\t\tApellidos\n";
        s += "-------------------------------------------------\n";
        for (Persona listaAlumno : listaAlumnos) {
            s += listaAlumno + "\n";
        }
        return s;
    }

    /**
     * Metodo que permite añadir un alumno que se pase como parametro a un curso.
     * @param p
     */
    public void aniadirAlumno(Persona p) {
        listaAlumnos.add(p);
    }
}
