/* Escribir un programa que dado un valor ingresado por el usuario menor que 10 y mayor a 1,
 muestre por pantalla una cuenta regresiva de números desde dicho valor hasta el 0
inclusive.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio_17 {
    public static void main (String [] args){
        int numero;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Ingrese un numero mayor que 1 y menor que 10: ");
            numero=Integer.valueOf(entrada.readLine());
            if(numero>1 && numero<10) {
                for (int i = numero; i >= 0; i--) {
                    System.out.println(i);
                }
            }
            else{
                System.out.println("El numero ingresado no está entre 1 y 10");
            }
        }
        catch(Exception exc){
            System.out.println(exc);
        }
    }
}
