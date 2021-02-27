package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import calculadora.Suma;

class test1 {

	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Iniciando las pruebas");
	}
	
	@BeforeEach
	void setUp() throws Exception{
		System.out.println("Nueva prueba");
	}
	
	@AfterEach
	void tearDown() throws Exception{
		System.out.println("Fin prueba");
	}
	
	@AfterAll
	static void tearDownAfter() throws Exception {
		System.out.println("Finalizacion de las pruebas");
	}
	
	
	@Test
	public void sumar1() {
		System.out.println("suma 1");
		double operando1 = 8;
		double operando2 = 4;
		Suma instance = new Suma();
		double solucion = 12;
		double resultadosum = instance.sumar1(operando1, operando2);
		assertEquals(solucion, resultadosum);
		if (solucion != resultadosum)
		{
			fail ("no son iguales los resultados melon (-_-')");
		}else {
			System.out.println("La prueba salio bien");
		}
	}
	
	@Test
	public void sumar2() {
		System.out.println("suma 2");
		int operando1 = 10;
		int operando2 = 5;
		Suma instance = new Suma();
		int solucion = 15;
		int resultadosum = instance.sumar2(operando1, operando2);
		assertEquals(solucion, resultadosum);
		if (solucion != resultadosum) {
			fail ("no son iguales algo va mal (._. )");
		}else {
			System.out.println("La prueba salio bien");
		}
	}
	@Test	
	public void sumar3() {
		System.out.println("suma 3");
		double operando1 = 4;
		double operando2 = 8;
		double operando3 = 10;
		Suma instance = new Suma();
		double solucion = 22;
		double resultadosum = instance.sumar3(operando1, operando2, operando3);
		assertEquals(solucion, resultadosum);
		if (solucion != resultadosum) {
			fail ("no son iguales algo va mal (._.)");
		}else {
			System.out.println("La prueba salio bien");
		}
	}
	
	@Test
	public void sumar4() {
		System.out.println("suma 4");
		int operando1 = 4;
		Suma instance = new Suma();
		int solucion = 4;
		int resultadosum = instance.sumar4(operando1);
		assertEquals(solucion, resultadosum);
		if (solucion != resultadosum) {
			fail ("no es igual esto ya no es divertido (~_~;)");
		}else {
			System.out.println("La prueba salio bien");
		}
	}
		

}
