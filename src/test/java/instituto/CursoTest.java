/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package instituto;

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
public class CursoTest {
    
    public CursoTest() {
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
     * Test que comprueba que el método aniadirAlumno de la clase Curso funciona correctamente.
     */
    @Test
    public void testAniadirAlumno() {
        Persona p = new Persona(18084571, "Joel", 'H', 18, 12, 2003);
        Curso instance = new Curso("MULWEB-1");
        instance.aniadirAlumno(p);
    }
    
}
