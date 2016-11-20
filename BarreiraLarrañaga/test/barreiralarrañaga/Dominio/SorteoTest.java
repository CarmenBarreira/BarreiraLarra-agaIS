package barreiralarrañaga.Dominio;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SorteoTest {
    
    private Cliente[] ganadores;
    private String premio;
    private int cantidadPremios;
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
    public void testSortear() {
        System.out.println("sortear");
        Sorteo instance = new Sorteo();
        Cliente[] expResult = new Cliente[0];
        Cliente[] result = instance.sortear();
        assertArrayEquals(expResult, result);        
    }

    
    @Test
    public void testGetGanadores() {
        System.out.println("getGanadores");
        Sorteo instance = new Sorteo();
        Cliente[] expResult = new Cliente[0];
        Cliente[] result = instance.getGanadores();
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testSetGanadores() {
        System.out.println("setGanadores");
        Cliente[] losGanadores = new Cliente[0];
        Sorteo instance = new Sorteo();
        instance.setGanadores(losGanadores);
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
        Sorteo instance = new Sorteo();
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
        ArrayList<Cliente> expResult = null;
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
    
}
