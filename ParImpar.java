import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        /*
        lea un número entero y determine si es par o impar.
        Si es par,escriba todos los pares de manera descendiente desde sí mismo y hasta el cero.
        Si es impar, que escriba todos los impares de manera descendiente desde si sí mismo
hasta el uno.
Utilice la instrucción LEER NUMERO al inicio del programa para cargar un
número en la variable NUMERO.
         */

        int numero;
        int resto;
        Scanner lector=new Scanner(System.in);
        System.out.println("introduzca un numero");
        numero=lector.nextInt();
        resto=numero%2;
        if(resto==0){
            for (int i=numero; i>=0; i=i-2){
                System.out.println(i);
            }
        }else{
            for(int i=numero;i>=1;i=i-2){
                System.out.println(i);
            }
        }
    }
}