package instituto;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

/**
 *Esta clase nos permite crear 
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
     *
     */
    public Persona() {
        nif = new Nif();
        nombre = "";
        genero = ' ';
        nacimiento = LocalDate.of(1990, 1, 1);
    }

    /**
     *
     * @param nif
     */
    public Persona(int nif) {
        this();
        this.nif = new Nif(nif);
    }

    /**
     *
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
     *
     * @return
     */
    public Nif getNif() {
        return nif;
    }

    /**
     *
     * @param nif
     */
    public void setNif(Nif nif) {
        this.nif = nif;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public char getGenero() {
        return genero;
    }

    /**
     *
     * @param genero
     */
    public void setGenero(char genero) {
        this.genero = genero;
    }

    /**
     *
     * @return
     */
    public LocalDate getNacimiento() {
        return nacimiento;
    }

    /**
     *
     * @param nacimiento
     */
    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    /**
     *
     * @return
     */
    public int getEdad() {
        return Period.between(nacimiento, LocalDate.now()).getYears();
    }

    /**
     *
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
     *
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
     *
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
