package problema01;

import java.util.Scanner;
import java.util.Locale;

public class Problema01 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double costoKilovatio;
        double consumo;
        double valorPagar;
        int edad;
        double descuento = 10;

        System.out.println("Ingrese el costo kilovatio/hora: ");
        costoKilovatio = entrada.nextDouble();
        System.out.println("Ingrese el consumo mensual: ");
        consumo = entrada.nextDouble();
        System.out.println("Ingrese su edad: ");
        edad = entrada.nextInt();

        valorPagar = costoKilovatio * consumo;

        if (edad > 65) {
            descuento = (valorPagar * descuento) / 100;
            valorPagar = valorPagar - descuento;
        }

        System.out.printf("El costo de la planilla de luz es: "
                + "%.2f dólares\n", valorPagar);
    }

}
