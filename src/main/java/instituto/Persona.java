package instituto;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

/**
 * Esta clase nos permite crear objetos de tipo persona.
 * 
 * @author Joel Roca
 * @version 1.0.0
 */
public class Persona implements Comparable<Persona> {

    private Nif nif;
    private String nombre;
    private char genero;
    private LocalDate nacimiento;

    /**
     * Constructor que nos permite crear objetos de tipo persona con valores
     * por defecto.
     */
    public Persona() {
        nif = new Nif();
        nombre = "";
        genero = ' ';
        nacimiento = LocalDate.of(1990, 1, 1);
    }

    /**
     * Constructor que permite crear un objeto de tipo persona con su dni (solo su numero, sin letra).
     * @param nif
     */
    public Persona(int nif) {
        this();
        this.nif = new Nif(nif);
    }

    /**
     * Constructor que permite crear un objeto de tipo persona con  todos los atributos
     * de esta.
     * @param nif
     * @param nombre
     * @param genero
     * @param dia
     * @param mes
     * @param ano
     */
    public Persona(int nif, String nombre, char genero,
            int dia, int mes, int ano) {
        this.nif = new Nif(nif);
        this.nombre = nombre;
        this.genero = genero;
        this.nacimiento
                = LocalDate.of(ano, mes, dia);
    }

    /**
     * Metodo que devuelve el nombre de una persona.
     * @return
     */
    public Nif getNif() {
        return nif;
    }

    /**
     * Metodo que permite cambiar el nombre de una persona.
     * @param nif
     */
    public void setNif(Nif nif) {
        this.nif = nif;
    }

    /**
     * Metodo que devuelve el nombre de una persona.
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que permite cambiar el nombre de una persona.
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo que devuelve el genero de una persona.
     * @return
     */
    public char getGenero() {
        return genero;
    }

    /**
     * Metodo que permite cambiar el genero de una persona.
     * @param genero
     */
    public void setGenero(char genero) {
        this.genero = genero;
    }

    /**
     * Metodo que devuelve la fecha de nacimiento de una persona.
     * @return
     */
    public LocalDate getNacimiento() {
        return nacimiento;
    }

    /**
     * Metodo que permite cambiar la fecha de nacimiento de una persona.
     * @param nacimiento
     */
    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    /**
     * Método que devuelve la edad de la persona.
     * @return
     */
    public int getEdad() {
        return Period.between(nacimiento, LocalDate.now()).getYears();
    }

    /**
     * Método que devuelve la persona en forma de String con todos sus datos.
     * @return
     */
    @Override
    public String toString() {
        if (nombre.split(" ").length > 1) {
            return nif + "\t" + nombre.split(" ")[0]
                    + '\t' + nombre.split(" ")[1] + "\t\t" + getEdad();
        } else {
            return nif + "\t" + nombre + "\t\t\t" + getEdad();
        }
    }

    /**
     * Compara la persona que queramos con una persona que se le pase como parametro,
     * esto lo hace mediante el metodo equals.
     * @param a
     * @return
     */
    public boolean equals(Persona a) {
        if (a == null) {
            return false;
        }
        return a.nif.toString().equals(this.nif.toString());
    }

    /**
     * Metodo que sobreescribe el metodo equals para poder ver si 2 objetos son
     * iguales.
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;

        return Objects.equals(this.nif, other.nif);
    }

    /**
     * Metodo que nos permite comparar personas, para a la hora de crear una
     * nueva sepamos si esa persona ya existe.
     * @param o
     * @return
     */
    @Override
    public int compareTo(Persona o) {
        return this.nif.toString().compareTo(o.nif.toString());
    }

}
