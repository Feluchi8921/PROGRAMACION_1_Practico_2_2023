/*Escribir un programa que mientras que el usuario ingrese un número entero distinto de 0,
 pida ingresar otro número entero y lo imprima.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio_8 {
    public static void main (String []args){
        int numero;
        try{
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            do{ System.out.println("Ingrese un numero: ");
                numero=Integer.valueOf(entrada.readLine());
                if(numero!=0){
                    System.out.println("El numero ingresado es: "+numero);
                }
            }
            while(numero!=0);
        }
        catch(Exception exc){
            System.out.println(exc);
        }
    }
}
