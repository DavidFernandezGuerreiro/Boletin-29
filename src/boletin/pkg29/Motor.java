
package boletin.pkg29;

import javax.swing.JOptionPane;

/**
 *
 * @author dfernandezguerreiro
 */
public class Motor extends Barco{
    private int potencia;

    public Motor(){
    }

    public Motor(int potencia, String matricula, int eslora, int numDias) {
        super(matricula, eslora, numDias);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
    @Override
    public int calcModulo() {
        int modulo=10*super.getEslora()+potencia*3;
//        System.out.println("Módulo do barco: "+modulo);
        return modulo;
    }

    
    
    
}
