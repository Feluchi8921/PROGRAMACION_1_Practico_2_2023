import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio_5 {
    public static void main(String[]args){
        int hora, temperatura, clave_1, clave_2, centena_almacenada, centena;
        char letra_minuscula;
        final int clave_almacenada=234;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
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
