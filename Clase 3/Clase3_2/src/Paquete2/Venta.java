
package Paquete2;

public class Venta {
    private String nombre;
    private char tipoFranela;
    private int cantidad;
    private float precioFranela;
    
    public String getNombre(){
        return nombre;
    }
    public char gettipoFranela(){
        return tipoFranela;
    }
    public int getCantidad(){
        return cantidad;
    }
    public float getprecioFranela(){
        return precioFranela;
    }
    public void setNombre(String nom){
        this.nombre=nom;
    }
    public void settipoFranela(char tipo){
        this.tipoFranela=tipo;
    }
    public void setCantidad(int cantidad){
        this.cantidad=cantidad;
    }
    public void setPrecioFranela(float precioFranela){
        this.precioFranela=precioFranela;
    }
    public float calcularPrecioFranela(){
        switch (tipoFranela){
            case 'A':
            case 'a':precioFranela=25000;
            break;
            case 'B':
            case 'b':precioFranela=150000;
            break;
            case 'c':
            case 'C':precioFranela=168900;
            break;
        };
        return precioFranela;
    };
    public float calcularDescuento(){
        float descuento;
        if (cantidad>=24){
            descuento=0.15f;
        }else if(cantidad>=6 & cantidad<=11){
            descuento=0.05f;
        }else{
            descuento=0;
        }
        return descuento;
    }
    public float montoTotal(){
        float total;
        total=(calcularPrecioFranela()*cantidad)-calcularDescuento();
        return total;
    };
}
