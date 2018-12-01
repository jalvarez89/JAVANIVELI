
package clase3_1;

public class Cliente {
    String nombreCliente;
    float precioVehiculo;
    float cuotaInicial(){
    return precioVehiculo*0.30f;
    };
    float cuotasMensuales(){
    return (precioVehiculo-cuotaInicial())/24;
    };
    
}
