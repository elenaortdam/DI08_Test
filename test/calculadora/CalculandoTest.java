package calculadora;

import static jdk.nashorn.internal.objects.Global.Infinity;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 * @author elena
 */
public class CalculandoTest {

    public CalculandoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class Calculando.
     */
    @Test
    public void testAdd() {
        Calculando c = new Calculando();
        assertEquals(0, c.add(0, 0), 0.0);
        assertEquals(10, c.add(-10, 20), 0.0);
        assertEquals(0.5, c.add(2, -1.5), 0.0);
        assertEquals(-5, c.add(-3.5, -1.5), 0.0);
    }

    /**
     * Test of subtract method, of class Calculando.
     */
    @Test
    public void testSubtract() {
        Calculando c = new Calculando();
        assertEquals(0, c.subtract(0, 0), 0.0);
        assertEquals(10, c.subtract(0, -10), 0.0);
        assertEquals(100, c.subtract(150, 50), 0.0);
        assertEquals(4, c.subtract(-1, -5), 0.0);
    }

    /**
     * Test of multiply method, of class Calculando.
     */
    @Test
    public void testMultiply() {
        Calculando c = new Calculando();
        assertEquals(0, c.multiply(0, 0), 0.0);
        assertEquals(10, c.multiply(2, 5), 0.0);
        assertEquals(-100, c.multiply(-20, 5), 0.0);
        assertEquals(22, c.multiply(0.11, 200), 0.0);
    }

    /**
     * Test of divide method, of class Calculando.
     */
    @Test
    public void testDivide() {
        Calculando c = new Calculando();
        assertEquals(Infinity, c.divide(1, 0), Infinity);
        assertEquals(1, c.divide(1, 1), 0.0);
        assertEquals(-1, c.divide(-1, 1), 0.0);
        assertEquals(2.4, c.divide(12, 5), 0.0);
    }

    @Test
    public void testIntegracion() {
        Main main = new Main();
        assertEquals(2, main.pruebaIntegracion(), 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRecuperacion() {
        Main main = new Main();
        assertEquals(2, main.pruebaRecuperacionEntradaString("uno", String.valueOf(2)), 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRecuperacionNulos() {
        Main main = new Main();
        assertEquals(2, main.pruebaRecuperacionEntradaString(null, String.valueOf(2)), 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRecuperacionVacios() {
        Main main = new Main();
        assertEquals(2, main.pruebaRecuperacionEntradaString("", String.valueOf(2)), 0.0);
    }

}
