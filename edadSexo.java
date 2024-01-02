import java.util.Scanner;

public class edadSexo {
    public static void main(String[] args) {
        class Persona {
            int edad;
            String sexo;
        }
        Scanner lector = new Scanner(System.in);
        int mayoresEdad = 0;
        int menoresEdad = 0;
        int hombresMayores = 0;
        int mujeresMenores = 0;
        int mayores;
        int mujeresTotales;
        int mujeres = 0;

        try {
            Persona[] personas = new Persona[50];
            for (int i = 0; i < personas.length; i++) {
                personas[i] = new Persona();
                System.out.println("edad: ");
                personas[i].edad = lector.nextInt();

                System.out.println("Sexo: ");
                personas[i].sexo = lector.next();
            }
            for (int i = 0; i < personas.length; i++) {
                if (personas[i].edad >= 18) {
                    mayoresEdad++;
                    if (personas[i].sexo.equalsIgnoreCase("masculino")) {
                        hombresMayores++;
                    }
                } else {
                    menoresEdad++;
                    if (personas[i].sexo.equalsIgnoreCase("femenino")) {
                        mujeresMenores++;
                    }
                }
            }

            for (int i = 0; i < personas.length; i++) {
                if (personas[i].sexo.equalsIgnoreCase("femenino")) {
                    mujeres++;
                }
            }
            mayores = (mayoresEdad * 100) / personas.length;
            mujeresTotales = (mujeres * 100) / personas.length;
            System.out.println("Cantidad de personas mayores de edad (18 años): " + mayoresEdad);
            System.out.println("Cantidad de personas menores de edad: " + menoresEdad);
            System.out.println("Cantidad de hombres MAYORES de edad: " + hombresMayores);
            System.out.println(("Cantidad de mujeres MENORES de edad: " + mujeresMenores));
            System.out.println("Mayores de edad respecto al total: " + mayores);
            System.out.println("Mujeres con respecto al total de personas: " + mujeresTotales + "%");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}