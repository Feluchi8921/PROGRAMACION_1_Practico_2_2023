/*Escribir un programa donde el usuario ingrese un número entre 0 y 999,
y muestre un mensaje de cuántos dígitos tiene. Además, si tiene 3 dígitos debe informar qué número es.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio_4 {
    public static void main(String[] args) {
        int numero;
        int digitos;
        BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un numero entre 0 y 999");
            numero=Integer.valueOf(entrada.readLine());
            digitos=Integer.toString(numero).length();
            System.out.println(digitos);
            if(digitos==3){
                System.out.println("El numero es: "+numero);
            }
        }
        catch (Exception exc) {
            System.out.println(exc);
        }
    }
}

