
package boletin.pkg29;

import java.util.ArrayList;

/**
 *
 * @author dfernandezguerreiro
 */
public class Boletin29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Veleros ve=new Veleros(3,"111A",3,10);
//        Motor mo=new Motor(100,"222B",5,5);
//        Yates ya=new Yates(5,100,"333C",10,20);
        
        ArrayList<Barco>lista=new ArrayList();

        Barco v=new Veleros(3,"111A",3,10);
        Barco m=new Motor(100,"222B",5,5);
        Barco y=new Yates(5,100,"333C",10,20);
        
        //Engado os obxetos ao ArrayList.
        lista.add(v);
        lista.add(m);
        lista.add(y);
        
        //Modulo*numDias.
        v.alugueres(v);
        m.alugueres(m);
        y.alugueres(y);
        
        //Mostro a factura.
        v.factura(v);
        m.factura(m);
        y.factura(y);
    }
    
}
