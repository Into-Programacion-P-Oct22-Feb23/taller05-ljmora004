
package problema04;

import java.util.Scanner;
import java.util.Locale;

public class Problema04 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int dias;
        double descuento;
        double precioDiario;
        double subTotal;
        double totalPagar;
        
        System.out.println("Ingrese los días a hospedarse: ");
        dias = entrada.nextInt();
        System.out.println("Ingrese el precio diario: ");
        precioDiario = entrada.nextDouble();
        
        subTotal = precioDiario * dias;
               
        if(dias > 5 && dias <=10){
            descuento = (subTotal * 10)/100;
            totalPagar = subTotal - descuento;
        }else if(dias > 10 && dias <=15){
            descuento = (subTotal * 15)/100;
            totalPagar = subTotal - descuento;
        }else if(dias > 15){
            descuento = (subTotal * 20)/100;
            totalPagar = subTotal - descuento;
        }else{
            totalPagar = subTotal;
        }
        
        System.out.printf("\nEl subtotal a pagar es de: %.2f\n"
                + "El total a pagar es de: %.2f\n", 
                subTotal, totalPagar);

    }
    
}
