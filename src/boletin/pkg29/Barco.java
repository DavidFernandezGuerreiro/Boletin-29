
package boletin.pkg29;

/**
 *
 * @author dfernandezguerreiro
 */
public abstract class Barco {
    
    public String matricula;
    public int eslora;
    public int numDias;
//    private int precio;

    public Barco() {
    }

    public Barco(String matricula, int eslora, int numDias) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.numDias = numDias;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getNumDias() {
        return numDias;
    }

    public void setNumDias(int numDias) {
        this.numDias = numDias;
    }

    public abstract int calcModulo(); //É int para que devolva outro int e se poida multiplicar polo número de días no seguinte método.
    
    int precio;
    public void alugueres(Barco b){
        precio=b.calcModulo()*numDias;
//        System.out.println("Precio do aluguer: "+precio);
    }
    
    public void factura(Barco b){
        System.out.println("FACTURA:\n"
                + "Matricula do barco: "+b.getMatricula()+"\n"
                + "Eslora: "+b.getEslora()+"\n"
                + "Precio: "+precio+"\n");
    }

    
}
