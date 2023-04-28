/*  Escribir un programa que mientras que el usuario ingrese un número entero entre 1 y 10 inclusive,
 lleve la suma de los números ingresados.
 Finalmente, cuando sale del ciclo muestre por pantalla el resultado de la suma. ¿En qué casos termina?
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio_10{
    public static void main(String[] args) {
        int numero, suma=0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            do {
                System.out.println("Ingrese un numero entero: ");
                numero = Integer.valueOf(entrada.readLine());
                if(numero>=1 && numero<=10) {
                    suma += numero;
                }
            }
            while(numero>=1 && numero<=10);
            System.out.println("La suma de los numeros ingresados dio: "+suma);
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
 