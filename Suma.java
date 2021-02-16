<<<<<<< HEAD
package suma;
=======
package calculadora;
>>>>>>> b6ae4ac3a7f4c5ee7365027e6b78476ddf604bc0

	/**
	 * Esta clase implementara todos los metodos que estan relacionados con la sumas de la calculadora.
	 * Los operandos no pueden ser n�meros negativos
	 * 
	 * @author Rodri
	 *
	 */

public class Suma {
    //Declaro esta variable como el acumulador del metodo sumar4
	static int acumulador;
		/**
		 * Suma de dos numeros reales de los parametros operando1 y operando2, devolviendo su suma.
		 * 
		 * [Los operandos no pueden ser numeros negativos]
		 * 
		 * @param operando1 Primer operando que se sumara a operando2
		 * @param operando2 Segundo opernado que se sumara a el opernado1
		 * @return
		 */
	
	public double sumar1(double operando1,double operando2){
            
		return (operando1+operando2);
	}
	
		/**
		 * Suma de dos numeros enteros de los parametros operando1 y operando2, devolviendo su suma.
		 * 
<<<<<<< HEAD
		 * [Los operandos no pueden ser n�meros negativos]
=======
		 * [Los operandos no pueden ser numeros negativos]
>>>>>>> b6ae4ac3a7f4c5ee7365027e6b78476ddf604bc0
		 * 
		 * @param operando1 Primer operando que se sumara a operando2
		 * @param operando2 Segundo opernado que se sumara a el opernado1
		 * @return
		 */
	
	public int sumar2(int operando1,int operando2){
		return (operando1+operando2);
	}
	
		/**
<<<<<<< HEAD
		 * Suma de tres numeros reales, de los operandos 1,2 y 3 dados en los par�metros de entrada, devolviendo la suma de los mismos
=======
		 * Suma de tres numeros reales, de los operandos 1,2 y 3 dados en los parametros de entrada, devolviendo la suma de los mismos
>>>>>>> b6ae4ac3a7f4c5ee7365027e6b78476ddf604bc0
		 * 
		 * [Los operandos no pueden ser numeros negativos]
		 * 
		 * @param operando1 Primer operando que se sumara a operando2
		 * @param operando2 Segundo opernado que se sumara a el opernado1
		 * @param operando3 Tercer opernado que se sumara a el opernado1 y a el operando2
		 * @return
		 */
	
	public double sumar3(double operando1,double operando2,double operando3){
		return (operando1+operando2+operando3);
	}
	
		/**
		 * Suma el valor acumulado, dado en el parametro de entrada y guardarndo el valor acumulado.
		 * 
		 * [Los operandos no pueden ser numeros negativos]
		 * 
		 * @param operando1 El operando colocado se ir sumando a los operndos colocados anteriormente en este metodo
		 * @return Resultado de la suma
		 */
	
	public static int sumar4(int operando1){

            acumulador=acumulador+operando1;

            return acumulador;
            
    }
}
