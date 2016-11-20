package barreiralarrañaga.Dominio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class ClienteTest {
    
    public ClienteTest() {
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
     * Test of getIdCliente method, of class Cliente.
     */
    @Test
    public void testGetIdCliente() {
        System.out.println("getIdCliente");
        Cliente instance = new Cliente();
        int expResult = 0;
        int result = instance.getIdCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdCliente method, of class Cliente.
     */
    @Test
    public void testSetIdCliente() {
        System.out.println("setIdCliente");
        int elIdCliente = 0;
        Cliente instance = new Cliente();
        instance.setIdCliente(elIdCliente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombreCliente method, of class Cliente.
     */
    @Test
    public void testGetNombreCliente() {
        System.out.println("getNombreCliente");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getNombreCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombreCliente method, of class Cliente.
     */
    @Test
    public void testSetNombreCliente() {
        System.out.println("setNombreCliente");
        String elNombreCliente = "";
        Cliente instance = new Cliente();
        instance.setNombreCliente(elNombreCliente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmailCliente method, of class Cliente.
     */
    @Test
    public void testGetEmailCliente() {
        System.out.println("getEmailCliente");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getEmailCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmailCliente method, of class Cliente.
     */
    @Test
    public void testSetEmailCliente() {
        System.out.println("setEmailCliente");
        String elEmailCliente = "";
        Cliente instance = new Cliente();
        instance.setEmailCliente(elEmailCliente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Cliente.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        Cliente instance = new Cliente();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
