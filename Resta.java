package calculadora;
/**
 * En esta clase se va a realizar la operacion de restar. es la operacion en sí.
 * 
 *  @author GemmaMG
 *  @since 22/01/2021
 *  @version 1.0
 */
public class Resta {
        /**
         * Declaro la variable de acumulador para el metodo resta4.
         */
	public static int acumulador;
	/**
	 * Este metodo resta de dos números reales, tendrá 2 parámetros de entrada y uno de salida que será la solución.
	 * 
	 * @param oper1 es el primer numero que se va a restar
	 * @param oper2 es el segundo numero que se va a restar
	 * 
	 * @return la resta de los dos numeros. 
	 * 
	 * @throws excepcion: los numeros no pueden ser negativos.
	 */

        public double resta1(double oper1, double oper2) {
	       return oper1 - oper2;
}
        /**
         * Este metodo esta de dos numeros enteros, tendra 2 parametros de entrada y uno de salida que sera la solucion.
         * 
         * @param oper1 es el primer numero a restar
         * @param oper2 es el segundo numero a restar
         * 
         * @return la resta de ambos numeros 
         * 
         */

        public int resta2(int oper1, int oper2) {
	       return oper1 - oper2;
}
        /**
         * Resta de tres números reales, tendrá 3 parámetros de entrada y uno de salida que será la solución.
         * 
         * @param oper1 es el primer numero que se va a restar
         * @param oper2 es el segundo numero que se va a restar
         * @param oper3 es el tercer numero que se va a restar
         * 
         * @return la resta de los tres numeros.
         * 
         */

        public double resta3(double oper1, double oper2, double oper3) {
	       double resultado = oper1-oper2-oper3;
	       return resultado;
}
        /**
         * Resta con valor acumulado, tendrá un parámetro de entrada y la clase deberá de guardar el valor acumulado.
         * 
         * @param oper1 es el operando que se va a ir restando a los operandos ya restados anteriormente en este metodo
         * 
         * @return devuelve el valor acumulado de la resta.
         * 	
         */
    
        public static int resta4(int oper1){
               acumulador=acumulador-oper1;
               return acumulador;
     }

    }