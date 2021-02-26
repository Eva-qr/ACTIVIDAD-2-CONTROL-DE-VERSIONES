/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TEST;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Calculadora.COCIENTE;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Eva
 */
public class COCIENTETEST {
    
    public COCIENTETEST() {
    }
    
    @BeforeAll
    static void setUpBeforeClass() throws Exception {
		System.out.println("Iniciando las pruebas");
    }
    
    @AfterAll
    static void tearDownAfterClass() throws Exception {
		System.out.println("Finalizacion de las pruebas");
    }
    
    @BeforeEach
    void setUp() throws Exception {
	System.out.println("Nueva prueba");
    }
    
    @AfterEach
    void tearDown() throws Exception {
	System.out.println("Fin de prueba");
    }

    /**
     * Test of division1 method, of class Cociente.
     */
    @Test
    public void testDivision1() {
        System.out.println("division1");
        double n1 = 4.0;
        double n2 = 2.0;
        COCIENTE instance = new COCIENTE();
        String expResult = "2.0";
        String result = instance.division1(n1, n2);
        assertEquals(expResult, result);
       

       
    }

    /**
     * Test of division2 method, of class Cociente.
     */
    @Test
    public void testDivision2() {
        System.out.println("division2");
        int n1 = 4;
        int n2 = 2;
        COCIENTE instance = new COCIENTE();
        String expResult = "2";
        String result = instance.division2(n1, n2);
        assertEquals(expResult, result);
       
      
    }

    /**
     * Test of inverso method, of class Cociente.
     */
    @Test
    public void testInverso() {
        System.out.println("inverso");
        double n1 = 2.0;
        COCIENTE instance = new COCIENTE();
        String expResult = "0.5";
        String result = instance.inverso(n1);
        assertEquals(expResult, result);
       
      
    }

    /**
     * Test of raiz method, of class Cociente.
     */
    @Test
    public void testRaiz() {
        System.out.println("raiz");
        double n1 = 42.0;
        COCIENTE instance = new COCIENTE();
        String expResult = "6.48074069840786";
        String result = instance.raiz(n1);
        assertEquals(expResult, result);
       
       
    }
    
}
