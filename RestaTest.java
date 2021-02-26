/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import main.Resta;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Rodri
 */
public class RestaTest {
    
    public RestaTest() {
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
     * Test para el metodo resta1 dela clase Resta.
     */
    @Test
    public void testResta1() {
        System.out.println("resta1");
        double oper1 = 3.2;
        double oper2 = 1.2;
        Resta instance = new Resta();
        double expResult = 2.0;
        double result = instance.resta1(oper1, oper2);
        assertEquals(expResult, result, 0.0);
        if (result !=expResult){
        fail("El test ha fallado");
    }
    }
    /**
     * Test para el metodo resta2 dela clase Resta.
     */
    @Test
    public void testResta2() {
        System.out.println("resta2");
        int oper1 = 20;
        int oper2 = 5;
        Resta instance = new Resta();
        int expResult = 15;
        int result = instance.resta2(oper1, oper2);
        assertEquals(expResult, result);
        if (result !=expResult){
        fail("El test ha fallado");
    }
    }

    /**
     * Test para el metodo resta3 dela clase Resta.
     */
    @Test
    public void testResta3() {
        System.out.println("resta3");
        double oper1 = 7.0;
        double oper2 = 2.1;
        double oper3 = 1.3;
        Resta instance = new Resta();
        double expResult = 3.6000000000000005;
        double result = instance.resta3(oper1, oper2, oper3);
        assertEquals(expResult, result, 0.0);
        if (result !=expResult){
        fail("El test ha fallado");
    }
    }

    /**
     * Test para el metodo resta4 dela clase Resta.
     */
    @Test
    public void testResta4() {
        System.out.println("resta4");
        int oper1 = 2;
        int expResult = -2;
        int result = Resta.resta4(oper1);
        assertEquals(expResult, result);
        if (result !=expResult){
        fail("El test ha fallado");
    }
    }
    
}
