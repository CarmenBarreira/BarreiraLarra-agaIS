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
        Restaurante expResult = instance.getRestaurante();
        Restaurante result = instance.getRestaurante();
        assertEquals(expResult, result);
    }

    
    @Test
    public void testGetEvaluaciones() {
        System.out.println("getEvaluaciones");
        Sistema instance = new Sistema();
        ArrayList<Evaluacion> expResult = new Sistema().getEvaluaciones();
        ArrayList<Evaluacion> result = instance.getEvaluaciones();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetRestaurante() {
        System.out.println("setRestaurante");
        Restaurante miRestaurante = new Restaurante();
        Sistema instance = new Sistema();
        instance.setRestaurante(miRestaurante);
    }

    
    @Test
    public void testSetEvaluaciones() {
        System.out.println("setEvaluaciones");
        ArrayList<Evaluacion> lasEvaluaciones = new ArrayList<Evaluacion>();
        Sistema instance = new Sistema();
        instance.setEvaluaciones(lasEvaluaciones);
    }

    @Test
    public void testUpdateObserver() {
        System.out.println("updateObserver");
        Sistema instance = new Sistema();
        instance.updateObserver();
    }

    @Test
    public void testAgregarEditarRestaurante() {
        System.out.println("agregarEditarRestaurante");
        Restaurante miRestaurante = new Restaurante();
        Sistema instance = new Sistema();
        instance.agregarEditarRestaurante(miRestaurante);
    }

    @Test
    public void testGetParticipantesSorteo() {
        System.out.println("getParticipantesSorteo");
        Sistema instance = new Sistema();
        ArrayList<Cliente> expResult = new ArrayList<Cliente>();
        ArrayList<Cliente> result = instance.getParticipantesSorteo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetParticipantesSorteo1() {
        System.out.println("getParticipantesSorteo");
        Sistema instance = new Sistema();
        ArrayList<Evaluacion> evaluaciones= new ArrayList<Evaluacion>();
        evaluaciones.add(new Evaluacion());
        evaluaciones.add(new Evaluacion());
        instance.setEvaluaciones(evaluaciones);
        ArrayList<Cliente> expResult = instance.getParticipantesSorteo();
        ArrayList<Cliente> result = instance.getParticipantesSorteo();
        assertEquals(expResult, result);
    }
   
    @Test
    public void testGetSorteos() {
        System.out.println("getSorteos");
        Sistema instance = new Sistema();
        ArrayList<Sorteo> expResult = new ArrayList<Sorteo>();
        ArrayList<Sorteo> result = instance.getSorteos();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetSorteos() {
        System.out.println("setSorteos");
        ArrayList<Sorteo> losSorteos = new ArrayList<>();
        Sistema instance = new Sistema();
        instance.setSorteos(losSorteos);
    }

    @Test
    public void testGetSorteoActual() {
        System.out.println("getSorteoActual");
        Sistema instance = new Sistema();
        Sorteo expResult = new Sistema().getSorteoActual();
        Sorteo result = instance.getSorteoActual();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetSorteoActual() {
        System.out.println("setSorteoActual");
        Sorteo elSorteoActual = new Sorteo();
        Sistema instance = new Sistema();
        instance.setSorteoActual(elSorteoActual);
    }

    @Test
    public void testPersistirGuardar() throws Exception {
        System.out.println("persistirGuardar");
        Sistema sis = new Sistema();
        Sistema instance = new Sistema();
        instance.persistirGuardar(sis);
    }
    @Test
    public void testPersistirGuardar1() throws Exception {
        System.out.println("persistirGuardar");
        Sistema sis = new Sistema();
        Sistema instance = new Sistema();
        instance.persistirGuardar(sis);
    }
    @Test
    public void testPersistirLeer() throws Exception {
        System.out.println("persistirLeer");
        Sistema instance = new Sistema();
        Sistema expResult = instance.persistirLeer();
        Sistema result = instance;
        assertEquals(expResult, result);
    }

    @Test
    public void testSortear() {
        System.out.println("sortear");
        Sistema instance = new Sistema();        
        ArrayList<Cliente> expResult = new ArrayList<Cliente>();
        ArrayList<Cliente> result = instance.sortear();
        assertEquals(expResult, result);
    }    
    @Test
    public void testSortear1() {
        System.out.println("sortear");
        Sistema instance1 = new Sistema(); 
        Sistema instance2 = new Sistema(); 
        ArrayList<Cliente> participantes = new ArrayList<Cliente>();
        participantes.add(new Cliente("Carmen", "csilbarreira@gmail.com"));
        participantes.add(new Cliente("Juan", "juanignaciolarra@gmail.com"));
        Sorteo s = new Sorteo();
        s.setParticipantes(participantes);
        s.setCantidadPremios(1);
        instance1.setSorteoActual(s);
        instance2.setSorteoActual(s);
       // instance.getSorteoActual().setCantidadPremios(1);
        ArrayList<Cliente> expResult = instance1.sortear();
        ArrayList<Cliente> result = instance2.sortear();
        assertEquals(expResult, result);
    } 
    
    
    @Test
    public void testGetPromedioEval() {
        System.out.println("getPromedioEval");
        Sistema instance = new Sistema();
        double expResult = 0;
        double result = instance.getPromedioEval();
        assertEquals(expResult, result, 0);
    }
    @Test
    public void testGetPromedioEval1() {
        System.out.println("getPromedioEval");
        Sistema instance = new Sistema();
        instance.getEvaluaciones().add(new Evaluacion());
        double expResult = 0;
        double result = instance.getPromedioEval();
        assertEquals(expResult, result, 0);
    }
}
