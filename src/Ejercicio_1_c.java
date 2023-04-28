import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Ejercicio_1_c {
    public static void main (String [] args){
        int numero;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Ingrese un numero del 1 al 7:");
            numero=Integer.valueOf(entrada.readLine());
            switch (numero){
                case 1:
                    System.out.println("Es Lunes");
                    break;
                case 2:
                    System.out.println("Es Martes");
                    break;
                case 3:
                    System.out.println("Es Miercoles");
                    break;
                case 4:
                    System.out.println("Es Jueves");
                    break;
                case 5:
                    System.out.println("Es Viernes");
                    break;
                case 6:
                    System.out.println("Es Sabado");
                    break;
                case 7:
                    System.out.println("Es Domingo");
                    break;
                default:
                    System.out.println("No inserto un numero correcto");
            }
        }
        catch(Exception exc){
            System.out.println(exc);
        }
    }
}