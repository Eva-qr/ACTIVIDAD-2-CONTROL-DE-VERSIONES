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
			System.out.println("Este es el test Potencia1");
			int x = 4;
			int y = 2;
			Potencia instance = new Potencia();
			int expResult = 0;
			int result = instance.potencia1(x,y);
			assertEquals(expResult, result);
			if (result !=expResult) {
				fail ("El test ha fallado");
			}

		}

		@Test
		public void testPotencia2() {
			System.out.println("Este es el test Potencia2");
			int x = 6;
			int y = 3;
			Potencia instance = new Potencia();
			int expResult = 0;
			int result = instance.potencia2(x,y);
			assertEquals(expResult, result);
			if (result !=expResult) {
				fail ("El test ha fallado");
			}

		}
		
		@Test
		public void testPotencia3() {
			System.out.println("Este es el test Potencia3");
			int x = 4;
			int y = 2;
			int z = 3;
			Potencia instance = new Potencia();
			int expResult = 0;
			int result = instance.potencia3(x,y,z);
			assertEquals(expResult, result);
			if (result !=expResult) {
				fail ("El test ha fallado");
			}

		}
		
		@Test
		public void testPotencia4() {
			System.out.println("Este es el test Potencia4");
			int m = 2;
			int n = 3;
			Potencia instance = new Potencia();
			int expResult = 0;
			int result = instance.potencia4(m,n);
			assertEquals(expResult, result);
			if (result !=expResult) {
				fail ("El test ha fallado");
			}

		}
}
