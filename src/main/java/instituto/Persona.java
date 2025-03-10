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
     * @param nif int que contenga el numero del nif de la persona, sin letra.
     */
    public Persona(int nif) {
        this();
        this.nif = new Nif(nif);
    }

    /**
     * Constructor que permite crear un objeto de tipo persona con  todos los atributos
     * de esta.
     * @param nif int que contenga el numero del nif de la persona, sin letra.
     * @param nombre String que contenga el nombre de la persona.
     * @param genero char que contenga la inicial del género de la persona.
     * @param dia int que contenga el dia en el que nació la persona.
     * @param mes int que contenga el mes en el que nació la persona.
     * @param ano int que contenga el año en el que nació la persona.
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
     * @return Objeto de tipo Nif que contiene el Nif de la Persona.
     */
    public Nif getNif() {
        return nif;
    }

    /**
     * Metodo que permite cambiar el nombre de una persona.
     * @param nif Objeto de tipo Nif que sustituirá el Nif de la Persona.
     */
    public void setNif(Nif nif) {
        this.nif = nif;
    }

    /**
     * Metodo que devuelve el nombre de una persona.
     * @return String que contiene el nombre de una Persona.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que permite cambiar el nombre de una persona.
     * @param nombre String que contiene un nombre que sustituirá el nombre de la Persona.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo que devuelve el genero de una persona.
     * @return char que devuelve la letra inicial del género de la Persona.
     */
    public char getGenero() {
        return genero;
    }

    /**
     * Metodo que permite cambiar el genero de una persona.
     * @param genero char que contiene la letra inicial del género de la Persona (H o M).
     */
    public void setGenero(char genero) {
        this.genero = genero;
    }

    /**
     * Metodo que devuelve la fecha de nacimiento de una persona.
     * @return Objeto de tipo LocalDate que contiene la fecha de nacimiento de la Persona.
     */
    public LocalDate getNacimiento() {
        return nacimiento;
    }

    /**
     * Metodo que permite cambiar la fecha de nacimiento de una persona.
     * @param nacimiento Objeto de tipo LocalDate que sustituirá la fecha de nacimiento de la persona.
     */
    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    /**
     * Método que devuelve la edad de la persona.
     * @return int que contiene la edad de la Persona.
     */
    public int getEdad() {
        return Period.between(nacimiento, LocalDate.now()).getYears();
    }

    /**
     * Método que devuelve la persona en forma de String con todos sus datos.
     * @return String que contiene toda la informacion de la Persona con formato.
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
     * @param a Objeto de tipo persona que se comparará a otra Persona para ver si son iguales.
     * @return True o False dependiendo si son iguales o no.
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
     * @param obj Objeto de cualquier tipo que será comparado con la Persona.
     * @return True o False dependiendo si la Persona y el objeto pasado como parametro son iguales.
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
     * @param o Objeto de tipo Persona que sera comparado con la Persona.
     * @return 1, 0 o -1 dependiendo si la persona pasada como parametro es mayor, igual o menor que la persona a comparar(ASCII).
     */
    @Override
    public int compareTo(Persona o) {
        return this.nif.toString().compareTo(o.nif.toString());
    }

}
