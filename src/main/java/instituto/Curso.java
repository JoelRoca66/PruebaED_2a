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
     * @return String que contiene el nombre del curso
     */
    protected String getNombre() {
        return nombre;
    }

    /**
     * Constructor que permite crear un objeto de tipo Curso pasandole el nombre
     * como parámetro.
     * @param nombre Nombre que se pasa como parámetro para que sea el nuevo nombre del curso.
     */
    public Curso(String nombre) {
        this.nombre = nombre;
        listaAlumnos = new TreeSet<>();
    }

    /**
     * Metodo que devuelve un curso en forma de String.
     * @return String del curso, con formato adaptado.
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
     * @param p Persona que se pasa como parametro para ser insertada al curso.
     */
    public void aniadirAlumno(Persona p) {
        listaAlumnos.add(p);
    }
}
