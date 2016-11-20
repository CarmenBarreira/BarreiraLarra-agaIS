package barreiralarrañaga.Dominio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class RestauranteTest {
    private String nombre;
    private String direccion;
    String tiposComida;
    private String horarios;
    
    
    public RestauranteTest() {
        this.nombre = "Sin nombre";
        this.direccion = "Sin direccion";
        this.tiposComida = "Sin tipo comida";    
        this.horarios = "Sin horario";
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
    public void testSetNombre() {
        System.out.println("setNombre");
        String elNombre = "Sin nombre";
        Restaurante instance = new Restaurante();
        instance.setNombre(elNombre);
    }

    @Test
    public void testSetDireccion() {
        System.out.println("setDireccion");
        String laDireccion = "Sin direccion";
        Restaurante instance = new Restaurante();
        instance.setDireccion(laDireccion);
    }

    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Restaurante instance = new Restaurante();
        String expResult = "Sin nombre";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetDireccion() {
        System.out.println("getDireccion");
        Restaurante instance = new Restaurante();
        String expResult = "Sin direccion";
        String result = instance.getDireccion();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetHorarios() {
        System.out.println("getHorarios");
        Restaurante instance = new Restaurante();
        String expResult = "Sin horario";
        String result = instance.getHorarios();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetTiposComida() {
        System.out.println("setTiposComida");
        String losTiposComida = "Sin horario";
        Restaurante instance = new Restaurante();
        instance.setTiposComida(losTiposComida);
    }

    @Test
    public void testSetHorarios() {
        System.out.println("setHorarios");
        String losHorarios = "Sin horario";
        Restaurante instance = new Restaurante();
        instance.setHorarios(losHorarios);        
    }

   
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Restaurante o = new Restaurante();
        Restaurante instance = new Restaurante();
        int expResult = 0;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
    }
    
}
