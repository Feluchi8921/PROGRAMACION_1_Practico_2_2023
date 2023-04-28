/*Construir un programa que solicite desde teclado un número de mes válido y posteriormente
 notifique por pantalla la cantidad de días de ese mes.
 En el caso de que ingrese 2 como número de mes (febrero)
 deberá además solicitar ingresar un número de año entre 2000 y 2019 inclusive
 (no debe seguir si no está en ese rango),
  y dependiendo de si es bisiesto o no imprimir la cantidad de días correspondiente.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio_19 {
    public static void main(String []args){
        int mes, anio;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un mes (el numero)");
            mes = Integer.valueOf(entrada.readLine());
            if (mes >= 1 && mes <= 12){
                if (mes == 11 || mes == 4 || mes == 6 || mes == 9) {
                    System.out.println(mes + " tiene 30 dias");
                }
                else if (mes == 2) {
                    System.out.println("Ingrese un anio entre 2000 y 2019");
                    anio = Integer.valueOf(entrada.readLine());
                    if (anio >= 2000 && anio <= 2019) {
                     if((anio % 4 == 0) && (anio % 100 != 0) || (anio % 400 == 0)){
                            System.out.println("Febrero del año "+anio+" fue bisiesto. Trajo 29 dias");
                        }
                        else {
                            System.out.println("Febrero del año "+anio+" trajo 28 dias");
                        }
                    }
                }
                else {
                    System.out.println(mes + " trae 31 dias");
                }
            }
        }
        catch(Exception exc){
            System.out.println(exc);
        }
    }
}