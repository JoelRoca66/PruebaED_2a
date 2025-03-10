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
     * @param numero
     * @return 
     */
    private static char calcularLetra(int numero) {
        return LETRAS[numero % 23];
    }

    /**
     * Constructor que permite crear un objeto de tipo Nif con valores por defecto.
     */
    protected Nif() {
        this.numero = 0;
        this.letra = ' ';
    }

    /**
     * Constructor que permite crear un objeto de tipo Nif mediante un numero que se le
     * pase como parámetro.
     * @param numero
     */
    protected Nif(int numero) {
        this.numero = numero;
        this.letra = calcularLetra(numero);
    }

    /**
     * Método que devuelve un Nif en forma de String
     * @return
     */
    @Override
    public String toString() {
        return numero + "-" + letra;
    }

    /**
     * Metodo que permite cambiar el numero y la letra de un dni, asignándole
     * un nuevo valor que se le pasa como parametro (numero, letra automática).
     * @param numero
     */
    protected void setNif(int numero) {
        this.numero = numero;
        this.letra = calcularLetra(numero);
    }

    /**
     * Metodo que permite comprobar si 2 objetos de tipo Nif son iguales o no.
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
        final Nif other = (Nif) obj;
        if (this.numero != other.numero) {
            return false;
        }
        return this.letra == other.letra;
    }
}
