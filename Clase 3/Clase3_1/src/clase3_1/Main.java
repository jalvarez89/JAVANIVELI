
package clase3_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     
        Cliente cli1=new Cliente();
        Scanner lector;
        lector=new Scanner(System.in);
        System.out.println("Ingrese Nombre del Cliente:");
        cli1.nombreCliente=lector.nextLine();
        System.out.println("Ingrese Precio del Vehiculo:");
        cli1.precioVehiculo=lector.nextFloat();
        
        System.out.println("El Cliente "+cli1.nombreCliente);
        System.out.println("La Cuota Inicial Es De: "+cli1.cuotaInicial());
        System.out.println("Las Cuotas mensuales son de: "+cli1.cuotasMensuales());
    }
}