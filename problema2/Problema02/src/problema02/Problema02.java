package problema02;

import java.util.Scanner;
import java.util.Locale;

public class Problema02 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String descripcion;
        int cantidad;
        double precioUnidad;
        double descuento = 15;
        double valorPagar;

        System.out.println("Ingrese la descripción del artículo: ");
        descripcion = entrada.nextLine();
        System.out.println("Ingrese la cantidad de productos: ");
        cantidad = entrada.nextInt();
        System.out.println("Ingrese el precio unitario: ");
        precioUnidad = entrada.nextDouble();

        valorPagar = precioUnidad * cantidad;

        if (cantidad > 50) {
            descuento = (valorPagar * descuento) / 100;
            valorPagar = valorPagar - descuento;
        }

        System.out.printf("El artículo: %s\nTiene un costo total de: "
                + "%.2f\n", descripcion, valorPagar);
    }

}
