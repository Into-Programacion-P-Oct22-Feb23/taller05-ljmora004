
package problema03;

import java.util.Scanner;
import java.util.Locale;

public class Problema03 {


    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String marca;
        String origen;
        Double costo;
        Double impuesto;
        Double valorPagar;
        
        System.out.println("Ingrese la marca de su vehículo: ");
        marca = entrada.nextLine();
        System.out.println("Ingrese el país de origen de su vehículo: ");
        origen = entrada.nextLine();
        System.out.println("Ingrese el costo del vehículo: ");
        costo = entrada.nextDouble();
        
        valorPagar = costo;
        
        if(origen.equals("Alemania")){
            impuesto = (valorPagar * 20)/100;
            valorPagar = valorPagar + impuesto;
        }else if(origen.equals("Japón")){
            impuesto = (valorPagar * 30)/100;
            valorPagar = valorPagar + impuesto;
        }else if(origen.equals("Italia")){
            impuesto = (valorPagar * 15)/100;
            valorPagar = valorPagar + impuesto;
        }else if(origen.equals("Estados Unidos")){
            impuesto = (valorPagar * 8)/100;
            valorPagar = valorPagar + impuesto;
        }
        
        System.out.printf("\nSu vehículo de marca %s con país de origen %s\n"
                + "Tiene un costo mas impuestos de: %.2f dólares.\n", 
                marca, origen, valorPagar);
        
    }
    
}
