package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import calculadora.Potencia;
/**
 * 
 * @author GemmaMG
 *
 */
public class _00_PruebaPotenciaAntigua {

	    @BeforeAll
	    static void setUpBeforeClass() throws Exception {
	    System.out.println("Esto es el método BeforeAll");
	    }
	    
	    @AfterAll
	    static void tearDownAfterClass() throws Exception {
	    System.out.println("Esto es el método AfetrAll");	
	    }
	    
	    @BeforeEach
	    void setUp() throws Exception {
	    System.out.println("Este es el método BeforeEach");	 
	    }
	    
	    @AfterEach
	    void tearDown() throws Exception {
	    System.out.println("Este es el método AfterEatch");	
	    }
	    
		@Test
		public void testPotencia1() {
			System.out.println("Este es el primer test");
			Potencia p1 = new Potencia();
			p1.potencia1(19, 2);
			assertEquals(7 , 1 , p1.potencia1(4,2));

		}

		@Test
		public void testPotencia2() {
			System.out.println("Este es el segundo test");
			Potencia p2 = new Potencia();
			p2.potencia2(7, 3);
			
			assertEquals(7 , 3 , p2.potencia2(5, 5));
		}
		
		@Test
		public void testPotencia3() {
			System.out.println("Este es el tercer test");
			Potencia p3 = new Potencia ();
			p3.potencia3(7, 5, 3);
			
			assertNotNull(p3.potencia3(4, 5, 4));
		}
		
		@Test
		public void testPotencia4() {
			System.out.println("Este es el cuarto test");
			Potencia p4 = new Potencia ();
			p4.potencia4(2, 3);
			
			assertEquals(1, 2, p4.potencia4(2, 2));
		}
	}
