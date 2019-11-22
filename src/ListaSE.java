
public class ListaSE {

    private NodoEnt inicio;
    private NodoEnt fin;
    private int length;

    public ListaSE() {
        inicio = fin = null;
    }

    public NodoEnt getInicio() {
        return inicio;
    }

    public void setInicio(NodoEnt inicio) {
        this.inicio = inicio;
    }

    public NodoEnt getFin() {
        return fin;
    }

    public void setFin(NodoEnt fin) {
        this.fin = fin;
    }
    
    public void insertar(int d) {
        if (inicio == null) {
            inicio = fin = new NodoEnt(d);
            length++;
        } else {
            fin.setSig(new NodoEnt(d));
            fin = fin.getSig();
            length++;
        }
    }

    public int getTamaño(){
        return length;
    }
    
    public int getDatoNodo(NodoEnt nodo) {
       return nodo.getDato();
    }
    
    public boolean vacia(){
        return (inicio==null && fin==null);
    }
           
    public int getCount() 
    {  
        int count = 0; 
        if(inicio == null){
            NodoEnt temp = inicio;
            while (temp != null) {        
                count++; 
                temp = temp.getSig(); 
            } 
        }
        else{
            NodoEnt temp = fin;
            while (temp != null) {        
                count++; 
                temp = temp.getSig(); 
            } 
        }
        return count; 
    } 
    
    public int sacar(){
        int d = inicio.getDato();
        inicio = inicio.getSig();
        return d;      
    }
    
    public int sacar(int i){
        int p=0;
        while((p++)<i)
            inicio = inicio.getSig();        
        return inicio.getDato();      
    }

    public void mostrar() {
        for (NodoEnt i = inicio; i != null; i = i.getSig()) {
            System.out.print(i);
        }
    }

    public NodoEnt buscar(int d) {
        for (NodoEnt n = inicio; n != null; n = n.getSig()) {
            if (n.getDato() == d) {
                return n;
            }
        }
        return null;
    }

    
    
    public boolean borrar(int d) {
        if (buscar(d) == null) {
            return false;
        }
        {
            if (inicio.getDato() == d) {
                inicio = inicio.getSig();
                return true;
            } else {
                NodoEnt n;
                for (n = inicio; n != fin; n = n.getSig()) {
                    if (n.getSig().getDato() == d) {
                        n.setSig(n.getSig().getSig());
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ListaSE E = new ListaSE();
        E.insertar(3);
        E.insertar(3);
        E.insertar(3);
        E.insertar(3);
        System.out.println(E.getTamaño());
        
    }
}
