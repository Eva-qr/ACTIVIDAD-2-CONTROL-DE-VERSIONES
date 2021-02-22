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
		Cociente c = new Cociente();
		Potencia p = new Potencia();
		Resta r = new Resta();
		
		 // Prueba de clase suma                
                System.out.println("Prueba metodo suma1 = "+s.sumar1(2.3, 3.4));
                System.out.println("Prueba metodo suma2 = "+s.sumar2(2, 4));
                System.out.println("Prueba metodo suma3 = "+s.sumar3(32.4, 32.5,45.6));
                System.out.println("Prueba metodo suma4 (1º numero) = "+s.sumar4(1));
                System.out.println("Prueba metodo suma4 (2º numero) = "+s.sumar4(23));
                System.out.println("Prueba metodo suma4 (3º numero) = "+s.sumar4(3));
		
		//Prueba de clase resta
		System.out.println("El resultado de esta resta es: " +r.resta1 (19.2 , 2.77));
		System.out.println("El resutaldo de la resta2 es: " + r.resta2 (7 , 3));
		System.out.println("El resultado de la resta3 es: " + r.resta3 (74.3 , 35.2 , 11.7));
		System.out.println("El resultado de la resta4 es: "+ r.resta4(5)); 
                System.out.println("El resultado de la resta4 es: "+ r.resta4(6));
                System.out.println("El resultado de la resta4 es: " + r.resta4(10));
		
		//Prueba de clase potencia
		System.out.println("Prueba metodo potencia1 = " + p.potencia1 (19.2 , 2.77));
		System.out.println("Prueba metodo potencia2 = " + p.potencia2 (7 , 3));
		System.out.println("Prueba metodo potencia3 = " + p.potencia3 (74.3 , 35.2 , 11.7));
		System.out.println("Prueba metodo potencia4 = " + p.potencia4(5)); 
                System.out.println("Prueba metodo potencia4 = " + p.potencia4(6));
                System.out.println("Prueba metodo potencia4 = " + p.potencia4(10));
		
		//Prueba de clase Cociente
		System.out.println("Prueba metodo division1 = " + c.division1(12.00, 3));
		System.out.println("Prueba metodo division2 = " + c.division2(4, 2));
		System.out.println("Prueba metodo inverso = " + c.inverso(12.00));
		System.out.println("Prueba metodo raiz = " + c.raiz(12.00));
		
	}
	
}
