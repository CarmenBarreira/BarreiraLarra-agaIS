package barreiralarrañaga.Dominio;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SistemaTest {
    private Restaurante restaurante;
    
    public SistemaTest() {
        restaurante = new Restaurante();
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

    
    @Test
    public void testGetRestaurante() {
        System.out.println("getRestaurante");
        Sistema instance = new Sistema();
        Restaurante expResult = restaurante;;
        Restaurante result = instance.getRestaurante();
        assertEquals(expResult, result);
    }

    /**
     * Test of getEvaluaciones method, of class Sistema.
     */
    @Test
    public void testGetEvaluaciones() {
        System.out.println("getEvaluaciones");
        Sistema instance = new Sistema();
        ArrayList<Evaluacion> expResult = null;
        ArrayList<Evaluacion> result = instance.getEvaluaciones();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRestaurante method, of class Sistema.
     */
    @Test
    public void testSetRestaurante() {
        System.out.println("setRestaurante");
        Restaurante miRestaurante = null;
        Sistema instance = new Sistema();
        instance.setRestaurante(miRestaurante);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEvaluaciones method, of class Sistema.
     */
    @Test
    public void testSetEvaluaciones() {
        System.out.println("setEvaluaciones");
        ArrayList<Evaluacion> lasEvaluaciones = null;
        Sistema instance = new Sistema();
        instance.setEvaluaciones(lasEvaluaciones);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateObserver method, of class Sistema.
     */
    @Test
    public void testUpdateObserver() {
        System.out.println("updateObserver");
        Sistema instance = new Sistema();
        instance.updateObserver();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarEditarRestaurante method, of class Sistema.
     */
    @Test
    public void testAgregarEditarRestaurante() {
        System.out.println("agregarEditarRestaurante");
        Restaurante miRestaurante = null;
        Sistema instance = new Sistema();
        instance.agregarEditarRestaurante(miRestaurante);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getParticipantesSorteo method, of class Sistema.
     */
    @Test
    public void testGetParticipantesSorteo() {
        System.out.println("getParticipantesSorteo");
        Sistema instance = new Sistema();
        ArrayList<Cliente> expResult = null;
        ArrayList<Cliente> result = instance.getParticipantesSorteo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSorteos method, of class Sistema.
     */
    @Test
    public void testGetSorteos() {
        System.out.println("getSorteos");
        Sistema instance = new Sistema();
        ArrayList<Sorteo> expResult = null;
        ArrayList<Sorteo> result = instance.getSorteos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSorteos method, of class Sistema.
     */
    @Test
    public void testSetSorteos() {
        System.out.println("setSorteos");
        ArrayList<Sorteo> losSorteos = null;
        Sistema instance = new Sistema();
        instance.setSorteos(losSorteos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSorteoActual method, of class Sistema.
     */
    @Test
    public void testGetSorteoActual() {
        System.out.println("getSorteoActual");
        Sistema instance = new Sistema();
        Sorteo expResult = null;
        Sorteo result = instance.getSorteoActual();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSorteoActual method, of class Sistema.
     */
    @Test
    public void testSetSorteoActual() {
        System.out.println("setSorteoActual");
        Sorteo elSorteoActual = new Sorteo();
        Sistema instance = new Sistema();
        instance.setSorteoActual(elSorteoActual);
    }
    
}
