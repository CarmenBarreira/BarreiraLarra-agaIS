package barreiralarrañaga.Dominio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class HorarioTest {
    private String dia; 
    private String horaInicio; 
    private String horaFin;  
    
    
    public HorarioTest() {
        this.dia = "";
        this.horaInicio = "";
        this.horaFin = "";   
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
    public void testGetDia() {
        System.out.println("getDia");
        Horario instance = new Horario("", "", "");
        String expResult = "";
        String result = instance.getDia();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetHoraInicio() {
        System.out.println("getHoraInicio");
        Horario instance = new Horario();
        String expResult = "";
        String result = instance.getHoraInicio();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetHoraFin() {
        System.out.println("getHoraFin");
        Horario instance = new Horario();
        String expResult = "";
        String result = instance.getHoraFin();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetDia() {
        System.out.println("setDia");
        String elDia = "";
        Horario instance = new Horario();
        instance.setDia(elDia);
    }

    @Test
    public void testSetHoraInicio() {
        System.out.println("setHoraInicio");
        String laHoraInicio = "";
        Horario instance = new Horario();
        instance.setHoraInicio(laHoraInicio);
    }

    @Test
    public void testSetHoraFin() {
        System.out.println("setHoraFin");
        String laHoraFin = "";
        Horario instance = new Horario();
        instance.setHoraFin(laHoraFin);
    }
    
}
