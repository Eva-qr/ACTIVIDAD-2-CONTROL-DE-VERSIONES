/*
 * Queremos documentar una serie de clases que implementen una calculadora.
 * Para ello hemos predefinido una serie de clases y métodos que el equipo tendrá que documentar.
 * Nótese que NO hay que implementar el código, solo la declaración de los métodos y las clases y su documentación.
 * Esta actividad está pensada para que cada miembro del equipo documente una clase.
 */
import suma.Suma;

/**
 * En este programa no se pueden insertar numeros negativos ya que no funcionaria.
 * @author Ignacio, Rodrigo, Eva, Gemma.
 * @since 24/01/2021
 * @version 1.0
 */
public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Suma s = new Suma();
//		Cociente c = new Cociente();
//		Potencia p = new Potencia();
//		Resta r = new Resta();
		
		 // Prueba de clase suma                
                System.out.println("Prueba metodo suma1 = "+s.sumar1(2.3, 3.4));
                System.out.println("Prueba metodo suma2 = "+s.sumar2(2, 4));
                System.out.println("Prueba metodo suma3 = "+s.sumar3(32.4, 32.5,45.6));
                System.out.println("Prueba metodo suma4 (1º numero) = "+s.sumar4(1));
                System.out.println("Prueba metodo suma4 (2º numero) = "+s.sumar4(23));
                System.out.println("Prueba metodo suma4 (3º numero) = "+s.sumar4(3));
	}
	
}
