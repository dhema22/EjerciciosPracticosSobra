import java.util.Scanner;

public class salario {
    public static void main(String[] args) {

        double salario;
        double salarioExtras;
        double valorHora;
        double horasTrabajadas;
        double horasExtras;
        double valorExtra;
        Scanner lector=new Scanner(System.in);
        System.out.println("cantidad de horas trabajadas: ");
        horasTrabajadas=lector.nextFloat();
        System.out.println("valor de la hora: ");
        valorHora= lector.nextFloat();
        if(horasTrabajadas>40){
            horasExtras=horasTrabajadas-40;
            valorExtra=valorHora*1.5;
            salarioExtras=horasExtras*valorExtra;
            salario=(40*valorHora)+salarioExtras;
            System.out.println("sueldo: "+salario);
        }else {
            salario=horasTrabajadas*valorHora;
            System.out.println("sueldo: "+salario);
        }

    }
}