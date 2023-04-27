import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio_6 {
      public static void main (String [] args){
          int  numero;
          final int cte_1=1, cte_2=100, cte_3=2, cte_4=3;
          try{
              BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
              do{
                  System.out.println("Ingrese un numero");
                  numero=Integer.valueOf(entrada.readLine());
                  if(numero%cte_3==0 && numero%cte_4==0) {
                      System.out.println("El numero "+numero+" es multiplo de 2 y de 3");
                  }
                  else{
                      break;
                  }
              }
              while(numero>cte_1 && numero<cte_2);

          }
          catch(Exception exc){
              System.out.println(exc);
          }
    }
}
