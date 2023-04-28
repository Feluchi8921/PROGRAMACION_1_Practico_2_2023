/*Escribir un programa que mientras el usuario ingrese un número entero menor que 100 y mayor a 1,
muestre por pantalla si el número es múltiplo de 2 y múltiplo de 3 simultáneamente.
(¿Los valores mencionados en el enunciado deberían ser constantes?. De a poco habría que definirlos como constantes).
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio_6 {
      public static void main (String [] args){
          int  numero;
          final int cte_1=1, cte_2=100, cte_3=2, cte_4=3;
          BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
          try{
              do{
                  System.out.println("Ingrese un numero");
                  numero=Integer.valueOf(entrada.readLine());
                  if(numero%cte_3==0 && numero%cte_4==0) {
                      System.out.println("El numero "+numero+" es multiplo de 2 y de 3");
                  }
                  else{
                      break;
                  }
              }
              while(numero>cte_1 && numero<cte_2);

          }
          catch(Exception exc){
              System.out.println(exc);
          }
    }
}
