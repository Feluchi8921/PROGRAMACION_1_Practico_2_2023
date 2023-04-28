/*Pedir números enteros positivos por teclado. En cada iteración el usuario puede ingresar 0 para salir del programa.
Si ingresa un número distinto de 0 se debe pedir el ingreso de un carácter.
a. Si es ‘a’ se debe permitir al usuario escribir un texto libre e imprimirlo por pantalla.
b. Si es ‘b’ se deben pedir 5 números positivos e informar si fueron ingresados en orden ascendente.
c. Si es ‘c’ se deben pedir dos números enteros negativos e imprimir la raíz cuadrada de su multiplicación.
La raíz cuadrada de un número se calcula con la sentencia:
Math.sqrt(numero).
d. Ante cualquier otro carácter ingresado se debe informar un
error y pedir nuevamente el carácter.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio_20 {
    public static final int MAX=5;
    public static void main(String []args){
        int numero, numero_arr, negativo_1, negativo_2;
        char c;
        String texto;
        int arrint []= new int[MAX];
        boolean existe=false;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
        do {
            System.out.println("Ingrese un numero entero positivo");
            numero = Integer.valueOf(entrada.readLine());
            if(numero!=0){
                System.out.println("Ingrese un caracter");
                c=entrada.readLine().charAt(0);
                if(c=='a'){
                    System.out.println("Ingrese un texto");
                    texto= entrada.readLine();
                    System.out.println("Usted ingreso el siguiente texto: "+"'"+texto+"'");
                }
                else if(c=='b'){
                    for(int i=0; i<5; i++){
                        System.out.println("Ingrese un numero positivo");
                        numero_arr=Integer.valueOf(entrada.readLine());
                        arrint[i]=numero_arr;
                    }
                    for(int i=0; i<4; i++){
                    if (arrint[i]<arrint[i+1]) {
                        existe=true;
                    }
                    }
                    if(existe=true){
                        System.out.println("Los numeros fueron ingresados en orden ascendente");
                    }
                }
                else if(c=='c'){
                    System.out.println("Ingrese un numero etero negativo");
                    negativo_1=Integer.valueOf(entrada.readLine());
                    System.out.println("Ingrese un numero etero negativo");
                    negativo_2=Integer.valueOf(entrada.readLine());
                    System.out.println("La raiz cuadrada de "+negativo_1+"*"+negativo_2+" es "+Math.sqrt(negativo_1*negativo_2));
                }
                else{
                    System.out.println("Upps!! Ha ocurrido un error, por favor ingrese otro caracter:");
                    System.out.println("Ingrese un caracter");
                    c=entrada.readLine().charAt(0);
                }
            }
        }
        while(numero!=0);
        }
        catch(Exception exc){
            System.out.println(exc);
        }
    }
}
