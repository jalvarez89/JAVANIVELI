
package clase3_2;

import Paquete2.Venta;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Venta vent1=new Venta();
        Venta vent2=new Venta();
        String nom;
        char tipo;
        int cantidad;
        Scanner lector;
        lector=new Scanner(System.in);
        System.out.println("Nombre del Cliente:");
        nom=lector.nextLine();
        vent1.setNombre(nom);
        System.out.println("Tipo de Franela a Comprar: A, B o C:");
        tipo=lector.next().charAt(0);
        vent1.settipoFranela(tipo);
        System.out.println("Cantidad de Camisas:");
        cantidad=lector.nextInt();
        vent1.setCantidad(cantidad);
        
        System.out.println("Nombre del Cliente:");
        nom=lector.nextLine();
        vent2.setNombre(nom);
        System.out.println("Tipo de Franela a Comprar: A, B o C:");
        tipo=lector.next().charAt(0);
        vent2.settipoFranela(tipo);
        System.out.println("Cantidad de Camisas:");
        cantidad=lector.nextInt();
        vent2.setCantidad(cantidad);
        
        System.out.println("Cliente: "+vent1.getNombre()+", Compro "+vent1.getCantidad()+" Franelas de Tipo: "+vent1.gettipoFranela()+" con un Valor de "+vent1.calcularPrecioFranela()+"c/u");
        System.out.println("El Precio Total a Cancelar es:"+vent1.montoTotal());
        
        System.out.println("Cliente: "+vent2.getNombre()+", Compro "+vent2.getCantidad()+" Franelas de Tipo: "+vent2.gettipoFranela()+" con un Valor de "+vent2.calcularPrecioFranela()+"c/u");
        System.out.println("El Precio Total a Cancelar es:"+vent2.montoTotal());
    }
    
}
