package barreiralarrañaga.Dominio;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class EvaluacionTest {
    
    //Atributos
    private Cliente cliente;
    private String resenia;
    private int estrellas;
    private Date fechaEvaluacion;
    
    public EvaluacionTest() {
       cliente = new Cliente();
       resenia = "Sin reseña";
       estrellas = 0;
       Evaluacion instance = new Evaluacion();
       Evaluacion expResul = new Evaluacion();
       assertEquals(expResul, instance);
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
    public void testGetResenia() {
        System.out.println("getResenia");
        Evaluacion instance = new Evaluacion();
        String expResult = "Sin reseña";
        String result = instance.getResenia();
        assertEquals(expResult, result);       
    }

    @Test
    public void testGetEstrellas() {
        System.out.println("getEstrellas");
        Evaluacion instance = new Evaluacion();
        int expResult = 0;
        int result = instance.getEstrellas();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetResenia() {
        System.out.println("setResenia");
        String laResenia = "Sin reseña";
        Evaluacion instance = new Evaluacion();
        instance.setResenia(laResenia);
    }
   
    @Test
    public void testSetEstrellas() {
        System.out.println("setEstrellas");
        int lasEstrellas = 0;
        Evaluacion instance = new Evaluacion();
        instance.setEstrellas(lasEstrellas);
    }

    @Test
    public void testGetCliente() {
        System.out.println("getCliente");
        Evaluacion instance = new Evaluacion();
        Cliente expResult = new Cliente();
        Cliente result = instance.getCliente();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetCliente() {
        System.out.println("setCliente");
        Cliente elCliente = new Cliente();
        Evaluacion instance = new Evaluacion();
        instance.setCliente(elCliente);
    }

    @Test
    public void testGetFechaEvaluacion() {
        System.out.println("getFechaEvaluacion");
        Evaluacion instance = new Evaluacion();
        Date expResult = null;
        Date result = instance.getFechaEvaluacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaEvaluacion method, of class Evaluacion.
     */
    @Test
    public void testSetFechaEvaluacion() {
        System.out.println("setFechaEvaluacion");
        Date laFechaEvaluacion = null;
        Evaluacion instance = new Evaluacion();
        instance.setFechaEvaluacion(laFechaEvaluacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
