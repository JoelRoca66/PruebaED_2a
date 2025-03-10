package instituto;

/**
 * Clase que nos permite crear objetos de tipo Nif
 * @author Joel Roca
 */
public class Nif {

    private int numero;
    private char letra;

    //CONSTANTE: no accesible - compartido por todo - no modificable
    private static final char[] LETRAS
            = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',
                'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L',
                'C', 'K', 'E'};

    /**
     * Metodo privado que permite calcular la letra de un dni mediante su numero.
     * @param numero Numero del dni, sin letra
     * @return Char que contiene la letra asociada a ese numero de dni.
     */
    private static char calcularLetra(int numero) {
        return LETRAS[numero % 23];
    }

    /**
     * Constructor protegido que permite crear un objeto de tipo Nif con valores por defecto.
     */
    protected Nif() {
        this.numero = 0;
        this.letra = ' ';
    }

    /**
     * Constructor protegido que permite crear un objeto de tipo Nif mediante un numero que se le
     * pase como parámetro.
     * @param numero Numero del dni, sin letra.
     */
    protected Nif(int numero) {
        this.numero = numero;
        this.letra = calcularLetra(numero);
    }

    /**
     * Método que devuelve un Nif en forma de String
     * @return String que contiene el dni y la letra de ese Nif, con formato.
     */
    @Override
    public String toString() {
        return numero + "-" + letra;
    }

    /**
     * Metodo protegido que permite cambiar el numero y la letra de un dni, asignándole
     * un nuevo valor que se le pasa como parametro (numero, letra automática).
     * @param numero Numero del dni, sin letra.
     */
    protected void setNif(int numero) {
        this.numero = numero;
        this.letra = calcularLetra(numero);
    }

    /**
     * Metodo que permite comprobar si 2 objetos de tipo Nif son iguales o no.
     * @param obj Objeto de cualquier tipo que será comparado con el Nif.
     * @return True o False dependiendo si el Nif y el objeto pasado como parametro son iguales.
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
        final Nif other = (Nif) obj;
        if (this.numero != other.numero) {
            return false;
        }
        return this.letra == other.letra;
    }
}
