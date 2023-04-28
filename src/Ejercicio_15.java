/*Pedir por consola el ingreso de números enteros. Cuando se ingrese un 0 se debe terminar el programa informando el
 promedio de los números ingresados, cuál fue el mayor número y  cuál fue el menor número.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio_15 {
    public static void main (String []args){
        int numero, contador=0;
        double suma=0, promedio=0;
        BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
        try{
            do{
                System.out.println("Ingrese un numero entero");
                numero=Integer.valueOf(entrada.readLine());
                if(numero!=0){
                    suma+=numero;
                    contador++;
                }
            }
            while(numero!=0);
            promedio=(suma/contador);
            System.out.println("EL promedio de los numero ingresados es: "+promedio);
        }
        catch(Exception exc){
            System.out.println(exc);
        }
    }
}
