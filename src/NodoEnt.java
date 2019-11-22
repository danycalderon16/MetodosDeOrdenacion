
public class NodoEnt {
    private int dato;
    private NodoEnt sig;

    public NodoEnt(int dato) {
        this.dato = dato;
        sig=null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public NodoEnt getSig() {
        return sig;
    }

    public void setSig(NodoEnt sig) {
        this.sig = sig;
    }

    @Override
    public String toString() {
        return "{"+dato+"} ";
    }
    
    
}
