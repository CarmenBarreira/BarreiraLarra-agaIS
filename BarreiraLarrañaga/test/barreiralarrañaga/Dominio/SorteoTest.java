package barreiralarrañaga.Dominio;

import java.util.ArrayList;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SorteoTest {
    
    private final Cliente[] ganadores;
    private final String premio;
    private final int cantidadPremios;
    private ArrayList<Cliente> participantes;
    
    public SorteoTest() {
        ganadores = new Cliente[0];
        premio = "Premio sin definir.";
        cantidadPremios = 0;
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
    public void testGetPremio() {
        System.out.println("getPremio");
        Sorteo instance = new Sorteo();
        String expResult = "Premio sin definir.";
        String result = instance.getPremio();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetPremio() {
        System.out.println("setPremio");
        String elPremio = "Premio sin definir.";
        Sorteo instance = new Sorteo();
        instance.setPremio(elPremio);
    }

    @Test
    public void testGetCantidadPremios() {
        System.out.println("getCantidadPremios");
        Sorteo instance = new Sorteo("", "Premio sin definir.", 0);
        int expResult = 0;
        int result = instance.getCantidadPremios();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetCantidadPremios() {
        System.out.println("setCantidadPremios");
        int laCantidadPremios = 0;
        Sorteo instance = new Sorteo();
        instance.setCantidadPremios(laCantidadPremios);
    }

    @Test
    public void testGetParticipantes() {
        System.out.println("getParticipantes");
        Sorteo instance = new Sorteo();
        ArrayList<Cliente> expResult = new ArrayList<Cliente>();
        ArrayList<Cliente> result = instance.getParticipantes();
        assertEquals(expResult, result);
    }

    
    @Test
    public void testSetParticipantes() {
        System.out.println("setParticipantes");
        ArrayList<Cliente> losParticipantes = null;
        Sorteo instance = new Sorteo();
        instance.setParticipantes(losParticipantes);
    }

    
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Sorteo instance = new Sorteo();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Sorteo instance = new Sorteo();
        instance.setNombre(nombre);
    }

   
    @Test
    public void testGetGanadores() {
        System.out.println("getGanadores");
        Sorteo instance = new Sorteo();
        ArrayList<Cliente> expResult = new ArrayList<Cliente>();
        ArrayList<Cliente> result = instance.getGanadores();
        assertEquals(expResult, result);
    }

    
    @Test
    public void testSetGanadores() {
        System.out.println("setGanadores");
        ArrayList<Cliente> ganadores = new ArrayList<Cliente>();
        Sorteo instance = new Sorteo();
        instance.setGanadores(ganadores);
    }

    @Test
    public void testGetCantidadParticipantes() {
        System.out.println("getCantidadParticipantes");
        Sorteo instance = new Sorteo();
        int expResult = 0;
        int result = instance.getCantidadParticipantes();
        assertEquals(expResult, result);
    }

    
    @Test
    public void testSetCantidadParticipantes() {
        System.out.println("setCantidadParticipantes");
        int cantidadParticipantes = 0;
        Sorteo instance = new Sorteo();
        instance.setCantidadParticipantes(cantidadParticipantes);
    }

    
    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        Sorteo instance = new Sorteo();
        Date expResult = null;
        Date result = instance.getFecha();
        assertEquals(expResult, result);
    }

    
    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        Date fecha = null;
        Sorteo instance = new Sorteo();
        instance.setFecha(fecha);
    }
    
}
