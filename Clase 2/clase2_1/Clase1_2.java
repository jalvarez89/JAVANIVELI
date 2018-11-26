/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1_2;

/**
 *
 * @author usuario
 */
public class Clase1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here0
        float n1=1.6f , n2=1.2f;
            System.out.println("Valores por Defecto:");
            System.out.println("n1="+n1);
            System.out.println("n2="+n2);
            
        int n3=1, n4=3;
            System.out.println("Valores por Defecto:");
            System.out.println("n3="+n3);
            System.out.println("n4="+n4);
            
        n1=n3; n4=(int)n2;
            System.out.println("Valores por Modificados:");
            System.out.println("n1="+n1);
            System.out.println("n2="+n2);
            System.out.println("n3="+n3);
            System.out.println("n4="+n4);
            
        n1+=n2;n3-=n1;n4*=2;
            System.out.println("Valores Sobrecargados");
            System.out.println("n1="+n1);
            System.out.println("n2="+n2);
            System.out.println("n3="+n3);
            System.out.println("n4="+n4);
        
        int x,y,z,prom;
        float prom2;
        x=20;
        y=10;
        z=30;
        prom=(x+y+z)/3;
        System.out.println("Promedio: "+prom);
        prom=(int)(x+y+z)/3;
        System.out.println("Promedio: "+prom);
        prom2=(x+y+z)/3;
        System.out.println("Promedio Decimal: "+prom2);
        prom2++;
        System.out.println("Promedio Decimal +1: "+prom2);
        prom2--;
        System.out.println("Promedio Decimal -1: "+prom2);
    }
    
}
