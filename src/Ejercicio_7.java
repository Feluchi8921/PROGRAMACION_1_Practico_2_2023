/*Escribir un programa que mientras el usuario ingresa un caracter distinto del carácter ‘*’,
muestre por pantalla si es carácter dígito, o si es carácter vocal minúscula.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio_7 {
    public static void main (String []args){
        char caracter;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            do {
                System.out.println("Ingrese un caracter");
                caracter = entrada.readLine().charAt(0);
                if (caracter>='0'&& caracter<='9') {
                System.out.println("El caracter " + caracter + " es caracter digito");
                }
                else if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                    System.out.println("El caracter " + caracter + " es vocal minuscula");
                }
             }
            while(caracter!='*');
        }
        catch(Exception exc){
           System.out.println(exc);
        }
}
}
