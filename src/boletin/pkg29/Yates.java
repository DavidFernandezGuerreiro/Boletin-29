
package boletin.pkg29;

import javax.swing.JOptionPane;

/**
 *
 * @author dfernandezguerreiro
 */
public class Yates extends Motor{
    private int nCamarotes;

    public Yates(){
    }

    public Yates(int nCamarotes, int potencia, String matricula, int eslora, int numDias) {
        super(potencia, matricula, eslora, numDias);
        this.nCamarotes = nCamarotes;
    }
    
    @Override
    public int calcModulo() {
        int modulo=10*super.getEslora()+(nCamarotes*4)+(super.getPotencia()*3);
//        System.out.println("Módulo do barco: "+modulo);
        return modulo;
    }

    
}
