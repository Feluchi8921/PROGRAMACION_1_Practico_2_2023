import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio_4 {
    public static void main(String[] args) {
        int numero;
        int digitos;
        try {
            BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
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

