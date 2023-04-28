import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio_1_e {
    public static void main(String [] args){
        int numero_1, numero_2, numero_3;
        BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Ingrese un numero");
            numero_1=Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese un numero");
            numero_2=Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese un numero");
            numero_3=Integer.valueOf(entrada.readLine());
            if(numero_1<=numero_2 && numero_2<=numero_3){
                System.out.println("Los numeros estan ordenados de forma creciente");
            }
            else if(numero_1>=numero_2 && numero_2>=numero_3){
                System.out.println("Los numeros estan ordenados de forma decreciente");
            }
            else{
                System.out.println("Los numeros ingresados no tienen un orden");
            }
        }
        catch(Exception exc){
            System.out.println(exc);
        }
    }
}
