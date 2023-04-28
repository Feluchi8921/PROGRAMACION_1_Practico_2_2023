/* Escribir un programa que solicite una hora del día (valor entero de la hora solamente) y resuelva en cada caso:
 Si la hora está entre las 0 y las 5, pida ingresar la temperatura y si la misma es menor a 20 grados imprima
 “Encender la calefacción”.
Si es mayor a 25, imprima “Apagar calefacción”.
Si está en el rango de 20 a 25 imprima “Calefacción encendida, no abra las ventanas!!!”.
 Si la hora está entre las 6 y las 11, pida un carácter letra minúscula y
  si es vocal imprima por la consola la cantidad de vocales que tiene la palabra que corresponde con la hora.
  Ejemplo 8 (ocho) tiene 2 vocales. Si no es vocal imprima la cantidad de consonantes que tiene,
  para el ejemplo 8 (ocho) tiene 2 consonantes.
 Si la hora está entre las 12 y 17 y es par, imprima el promedio entre la hora ingresada y el límite inferior del rango.
  Si la hora es impar debe imprimir el promedio entre la hora ingresada y el límite superior del rango.
 Si la hora está entre las 18 y 23, pida ingresar una clave numérica, si coincide con la clave almacenada previamente
  en una constante, pida ingresar una segunda clave de verificación (un valor entre 100 y 999).
  Para esta segunda clave (que solo la conoce el usuario) se debe verificar que el el dígito de mayor peso (centena)
   es múltiplo del dígito de mayor peso de la clave almacenada.
   Si todo esto se cumple debería mostrar por la consola el mensaje Clave correcta.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio_5 {
    public static void main(String[]args){
        int hora, temperatura, clave_1, clave_2, centena_almacenada, centena;
        char letra_minuscula;
        final int clave_almacenada=234;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese la hora");
            hora = Integer.valueOf(entrada.readLine());
            if (hora >= 0 && hora <= 5) {
                System.out.println("Ingrese la temperatura");
                temperatura = Integer.valueOf(entrada.readLine());
                if (temperatura > 25) {
                    System.out.println("Encender la calefaccion");
                }
                else if (temperatura >= 20 && temperatura <= 25) {
                    System.out.println("Calefacción encendida, no abra las ventanas!!!");
                }
            }
            else if(hora>=6 && hora<=11){
                System.out.println("Ingrese un caracter letra minuscula");
                letra_minuscula=entrada.readLine().charAt(0);
                if(letra_minuscula=='a' || letra_minuscula=='e' || letra_minuscula=='i' || letra_minuscula=='o' || letra_minuscula=='u'){
                if(hora==7 || hora==9){
                    System.out.println("La hora "+hora+" tiene 3 vocales");
                }
                else {
                    System.out.println("La hora "+hora+" tiene 2 vocales");
                }
                }
                else{
                    System.out.println("La hora "+hora+" tiene 2 consonates");
                }
            }
            else if(hora>=12 && hora<=17 && hora%2==0){

                }
            else if(hora>=18 && hora<=23){
                System.out.println("Ingrese una clave numerica");
                clave_1=Integer.valueOf(entrada.readLine());
                if(clave_1==clave_almacenada){
                    System.out.println("Ingrese una clave numerica entre 100 y 999");
                    clave_2=Integer.valueOf(entrada.readLine());
                    centena_almacenada=clave_almacenada/100;
                    centena=clave_2/100;
                    if(centena%centena_almacenada==0){
                       System.out.println("Clave correcta");
                   }
                }
            }
            }
        catch(Exception exc){
            System.out.println(exc);
        }
    }
}
