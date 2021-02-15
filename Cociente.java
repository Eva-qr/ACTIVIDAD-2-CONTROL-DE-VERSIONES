package calculadora;
/**
 * Esta clase implementará todos los métodos que están relacionados con la división de la calculadora.
 * @author Ignacio
 * @since 22/01/2021
 * @version 1.0
 */
public class Cociente {
	/**
	 * División de dos números reales, tendrá 2 parámetros de entrada y uno de salida que será la solución.
	 * 
	 * @param n1 es el divisor
	 * @param n2 es el dividendo este numero nunca podra ser 0, ya que no se puede dividir entre 0
	 * 
	 * @return es el resultado de la division de los 2 numeros 
	 * 
	 * Todo esto sera con numeros reales.
	 * 
	 * El resultado no puede ser con decimales ya que la division es de int
	 * 
	 * @throws excepcion: el n1/n2 no puede ser 0.
	 */
	public String division1(double n1, double n2) {
        double result;
        result = 0;
        if (n2 == 0) {
        	System.out.println("No puede dividir entre 0");
        	return "";
        }else {
            result = n1 / n2;
        }return ""+result;
    }
	
	/**
	 * División de dos números enteros, tendrá 2 parámetros de entrada y uno de salida que será la solución.
	 * 
	 * @param n1 es el divisor
	 * @param n2 es el dividendo este numero nunca podra ser 0, ya que no se puede dividir entre 0 
	 * 
	 * @return	es el resultado de la division de los 2 numeros
	 * 
	 * Todo esto sera con numeros enteros
	 *
	 * El resultado no puede ser con decimales ya que la division es de int
	 *
	 * @throws excepcion: el n1/n2 no puede ser 0.
	 */
	public String division2(int n1, int n2) {
        int result;
        result = 0;
        if (n2 == 0) {
        	System.out.println("No puede dividir entre 0");
        	return "";
        }else {
            result = n1 / n2;
        }return ""+result;
	}
	/**
	 * Inverso de un número real, tendrá un parámetro de entrada y uno de salida que será la solución.
	 * 
	 * @param n1 es el numero con el que va a hacer el valor inverso
	 * 
	 * @return el resultado es el valor inverso del numero ingresado.
	 * 
	 * @throws excepcion: el n1 no puede ser 0.
	 */
	public String inverso(double n1){
        double result;
        result = 0;
        result = 1 / n1;
        return ""+result;
	}
	/**
	 * Raíz de un número, tendrá un parámetro de entra y uno de salida que será la solución
	 * 
	 * @param n1 es el numero del que quieres obtener su raiz
	 * @return devuelve el numero de la raiz
	 * 
	 * @throws excepcion: el n1 no puede ser 0.
	 */
	public String raiz(double n1) {
		double result;
		result = 0;
		if (n1 == 0) {
			System.out.println("No puedes hacer la raiz de 0");
			return "";
		}else {
			result = Math.sqrt(n1);
			return "" + result;
		}
	}
}

