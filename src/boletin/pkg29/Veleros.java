
package boletin.pkg29;

import javax.swing.JOptionPane;

/**
 *
 * @author dfernandezguerreiro
 */
public class Veleros extends Barco{
    private int nMastiles;

    public Veleros(){
    }

    public Veleros(int nMastiles, String matricula, int eslora, int numDias) {
        super(matricula, eslora, numDias);
        this.nMastiles = nMastiles;
    }

    @Override
    public int calcModulo(){
        int modulo=10*super.getEslora()+nMastiles*2;
//        System.out.println("Módulo do barco: "+modulo);
        return modulo;
    }



    
    
    
}
