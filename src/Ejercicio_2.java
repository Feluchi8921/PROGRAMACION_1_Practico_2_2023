import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio_2 {
    public static void main(String []args){
        int mes, anio;
        try{
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un mes (el numero)");
            mes=Integer.valueOf(entrada.readLine());
            if(mes==11 || mes==4 || mes==6 || mes==9){
                System.out.println(mes+" tiene 30 dias");
            }
            else if(mes==2){
                System.out.println("Ingrese un anio");
                anio=Integer.valueOf(entrada.readLine());
                if(((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))){
                    System.out.println("Febrero bisiesto trae 29 dias");
                }
                else {
                    System.out.println("Febrero trae 28 dias");
                }
            }
            else{
                System.out.println(mes+" trae 31 dias");
            }
        }
        catch(Exception exc){
            System.out.println(exc);
        }
    }
}
