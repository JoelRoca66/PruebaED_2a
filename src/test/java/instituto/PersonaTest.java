
package instituto;

import java.time.LocalDate;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Joel Roca
 */
public class PersonaTest {
    
    public PersonaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test que prueba como funciona el metodo getNif de la clase Persona
     */
    @Test
    public void testGetNif() {
        System.out.println("getNif");
        Persona instance = new Persona();
        Nif expResult = null;
        Nif result = instance.getNif();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test que prueba como funciona el metodo setNif de la clase Persona
     */
    @Test
    public void testSetNif() {
        System.out.println("setNif");
        Nif nif = null;
        Persona instance = new Persona();
        instance.setNif(nif);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test que prueba como funciona el metodo getNombre de la clase Persona
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Persona instance = new Persona();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test que prueba como funciona el metodo setNombre de la clase Persona
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Persona instance = new Persona();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test que prueba como funciona el metodo getGenero de la clase Persona
     */
    @Test
    public void testGetGenero() {
        System.out.println("getGenero");
        Persona instance = new Persona();
        char expResult = ' ';
        char result = instance.getGenero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test que prueba como funciona el metodo setGenero de la clase Persona
     */
    @Test
    public void testSetGenero() {
        System.out.println("setGenero");
        char genero = ' ';
        Persona instance = new Persona();
        instance.setGenero(genero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test que prueba como funciona el metodo getNacimiento de la clase Persona
     */
    @Test
    public void testGetNacimiento() {
        System.out.println("getNacimiento");
        Persona instance = new Persona();
        LocalDate expResult = null;
        LocalDate result = instance.getNacimiento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test que prueba como funciona el metodo setNacimiento de la clase Persona
     */
    @Test
    public void testSetNacimiento() {
        System.out.println("setNacimiento");
        LocalDate nacimiento = null;
        Persona instance = new Persona();
        instance.setNacimiento(nacimiento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test que prueba como funciona el metodo getEdad de la clase Persona
     */
    @Test
    public void testGetEdad() {
        System.out.println("getEdad");
        Persona instance = new Persona();
        int expResult = 0;
        int result = instance.getEdad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test que prueba como funciona el metodo toString de la clase Persona
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Persona instance = new Persona();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test que prueba como funciona el metodo equals de la clase Persona
     */
    @Test
    public void testEquals_Persona() {
        System.out.println("equals");
        Persona a = null;
        Persona instance = new Persona();
        boolean expResult = false;
        boolean result = instance.equals(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test que prueba como funciona el metodo equals de object de la clase Persona
     */
    @Test
    public void testEquals_Object() {
        System.out.println("equals");
        Object obj = null;
        Persona instance = new Persona();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test que prueba como funciona el metodo compareTo de la clase Persona
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Persona o = null;
        Persona instance = new Persona();
        int expResult = 0;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
