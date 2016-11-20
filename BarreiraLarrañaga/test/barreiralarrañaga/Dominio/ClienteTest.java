package barreiralarrañaga.Dominio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class ClienteTest {
    private int idCliente;
    private String nombreCliente;
    private String emailCliente;
    
    
    public ClienteTest() {
        idCliente = -1;
        nombreCliente = "Sin nombre";
        emailCliente = "Sin email";
        Cliente instance = new Cliente();
        Cliente expResul = new Cliente();
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
    public void testGetIdCliente() {
        System.out.println("getIdCliente");
        Cliente instance = new Cliente();
        int expResult = -1;
        int result = instance.getIdCliente();
        assertEquals(expResult, result);
    }

    
    @Test
    public void testSetIdCliente() {
        System.out.println("setIdCliente");
        int elIdCliente = -1;
        Cliente instance = new Cliente();
        instance.setIdCliente(elIdCliente);
       
    }

    @Test
    public void testGetNombreCliente() {
        System.out.println("getNombreCliente");
        Cliente instance = new Cliente();
        String expResult = "Sin nombre";
        String result = instance.getNombreCliente();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNombreCliente() {
        System.out.println("setNombreCliente");
        String elNombreCliente = "Sin nombre";
        Cliente instance = new Cliente();
        instance.setNombreCliente(elNombreCliente);
    }

   
    @Test
    public void testGetEmailCliente() {
        System.out.println("getEmailCliente");
        Cliente instance = new Cliente();
        String expResult = "Sin email";
        String result = instance.getEmailCliente();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetEmailCliente() {
        System.out.println("setEmailCliente");
        String elEmailCliente = "Sin email";
        Cliente instance = new Cliente();
        instance.setEmailCliente(elEmailCliente);
    }

    @Test
    public void testEquals() {
        System.out.println("equals");
        Cliente c = new Cliente();       
        Cliente instance = new Cliente();
        boolean expResult = true;
        boolean result = instance.equals(c);
        assertEquals(expResult, result);
    }
    
}
