
import javax.swing.JOptionPane;


public class MetodosDeOrdenacion {

    public static String[] bubleSort(String A[], int n) {
        for (int p = 1; p < n - 1; p++) {
            for (int i = 0; i < n - p; i++) {
                if (A[i].compareToIgnoreCase(A[i + 1]) > 0) {
                    String aux = A[i];
                    A[i] = A[i + 1];
                    A[i + 1] = aux;
                }
            }
        }
        return A;
    }

    public static int[] bubleSort(int A[], int n) {
        for (int p = 1; p < n - 1; p++) {
            for (int i = 0; i < n - p; i++) {
                if (A[i] > A[i + 1]) {
                    int aux = A[i];
                    A[i] = A[i + 1];
                    A[i + 1] = aux;
                }
            }
        }
        return A;
    }

    public static int[] quicksort(int A[], int izq, int der) {

        int pivote = A[izq]; // tomamos primer elemento como pivote
        int i = izq; // i realiza la búsqueda de izquierda a derecha
        int j = der; // j realiza la búsqueda de derecha a izquierda
        int aux;

        while (i < j) {            // mientras no se crucen las búsquedas
            while (A[i] <= pivote && i < j) {
                i++; // busca elemento mayor que pivote
            }
            while (A[j] > pivote) {
                j--;         // busca elemento menor que pivote
            }
            if (i < j) {                      // si no se han cruzado                      
                aux = A[i];                  // los intercambia
                A[i] = A[j];
                A[j] = aux;
            }
        }
        A[izq] = A[j]; // se coloca el pivote en su lugar de forma que tendremos
        A[j] = pivote; // los menores a su izquierda y los mayores a su derecha
        if (izq < j - 1) {
            quicksort(A, izq, j - 1); // ordenamos subarray izquierdo
        }
        if (j + 1 < der) {
            quicksort(A, j + 1, der); // ordenamos subarray derecho
        }

        return A;
    }

    public static int[] shellSort(int A[]) {
        int salto, aux, i;
        boolean cambios;
        for (salto = A.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) { // Mientras se intercambie algún elemento
                cambios = false;
                for (i = salto; i < A.length; i++) // se da una pasada
                {
                    if (A[i - salto] > A[i]) { // y si están desordenados
                        aux = A[i]; // se reordenan
                        A[i] = A[i - salto];
                        A[i - salto] = aux;
                        cambios = true; // y se marca como cambio.
                    }
                }
            }
        }
        return A;
    }
    
    public static int[] radixSort(int A[]) {
        int n = A.length;
        int m = 0;
        int pos= 0;
        for (int i = 0; i < n; i++)  if (A[i] > m) m = A[i];
        int d = (m + "").length();

        for (int p = 1; p <=d; p++) {
            
            ListaSE D[] = new ListaSE[10];
            for (int i = 0; i < 10; i++) D[i] = new ListaSE();
            for (int i = 0; i <n; i++) {                               
                String num = (A[i]+"");
                if(num.length()>=p){
                    String dig = num.substring(num.length()-p, (num.length()-p)+1);
                    pos = Integer.parseInt(dig);
                    D[pos].insertar(A[i]);          
                }else 
                    D[0].insertar(A[i]);                 
            }       
       
            int a = 0;
            for (int i = 0; i < 10; i++) {
                for (NodoEnt nodo = D[i].getInicio();nodo!=null;nodo = nodo.getSig()) {
                    A[a++]= D[i].getDatoNodo(nodo);
                }
            }
            /*
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < D[i].length(); j++) {
                    A[a++] =D[i].sacar(j);
                }
            }
            int j= 0, k =0;
            while(k<10){
                while(!D[k].vacia()){
                    A[j++] = D[k].sacar();
                }
            }*/
        }
        
        return A;
    }
    
    public static String[][] mezclaDirecta(int[] F){
        int n = F.length;
        int x = 0;
        for (int i = 0; i <=n; i++) {
            if(Math.pow(2, i)<n)++x;
            else break;
        }
        String M[][] = new String[n][x+1];
        for (int i = 0; i < n; i++)             
            M[i][0] = F[i]+"";
        
        for(int i = 0;i<x;i++){
            
            int elemt = (int) Math.pow(2, i);
            int tam = (int) Math.pow(2, x-(i+1));
            
            ListaSE F1[] = new ListaSE[tam];       
            ListaSE F2[] = new ListaSE[tam];
                        
            for (int j = 0; j < tam; j++) {
                F1[j] = new ListaSE();
                F2[j] = new ListaSE();                
            }
            
            int cont = 0;    
            int pos = 0;
            while(cont<n){       
                for (int j = 0; j < elemt; j++) {
                    if(cont==n)break;
                    F1[pos].insertar(F[cont++]);
                }
                if(cont==n)break;
                for (int j = 0; j < elemt; j++) {
                    if(cont==n)break;
                    F2[pos].insertar(F[cont++]);
                }
                ++pos;
            }
            int count=0;
            ListaSE prov = intercalar(F1, F2,n);
            while(prov.getInicio() != null) {
                F[count++] = prov.getInicio().getDato();
                prov.setInicio(prov.getInicio().getSig());
            }
            
            for (int j = 0; j < n; j++) {
                M[j][i+1] = F[j]+"";
            }
            
        } 
        return M;
    }
   
     public static String[][] mezclaNatural(int[] F){
        int elementos = F.length;
        int pasadas = 0;
        for (int i = 0; i <=elementos; i++) {
            if(Math.pow(2, i)<elementos)++pasadas;
            else break;
        }
        String M[][] = new String[elementos][pasadas+1];
        for (int i = 0; i < elementos; i++)             
            M[i][0] = F[i]+"";        
                
        for(int i = 0;i<pasadas;i++){
            int tam = (int) Math.pow(2, pasadas-(i+1));
            
            ListaSE F1[] = new ListaSE[tam];       
            ListaSE F2[] = new ListaSE[tam];
                        
            for (int j = 0; j < tam; j++) {
                F1[j] = new ListaSE();
                F2[j] = new ListaSE();                
            }
            
            int cont = 0;    
            int pos = 0;
            while(cont<elementos){    
                
                F1[pos].insertar(F[cont++]);                
                if(cont==elementos)break;               
                while(F[cont-1]<=F[cont]){
                    F1[pos].insertar(F[cont++]); 
                    if(cont==elementos)break;   
                }
                
                if(F1[0].getTamaño()==elementos) return M;
                
                if(cont==elementos)break;
                F2[pos].insertar(F[cont++]);                
                if(cont==elementos)break;               
                while(F[cont-1]<F[cont]){
                    F2[pos].insertar(F[cont++]);    
                    if(cont==elementos)break;   
                }
                ++pos;
            }
            int count=0;
            ListaSE prov = intercalar(F1, F2,elementos);
            while(prov.getInicio() != null) {
                F[count++] = prov.getInicio().getDato();
                prov.setInicio(prov.getInicio().getSig());
            }
            
            for (int j = 0; j < elementos; j++) 
                    M[j][i+1] = F[j]+"";
        } 
        return M;
    }
    
    public static ListaSE intercalar(ListaSE A[], ListaSE[] B,int n){
        int pos = A.length;     
        ListaSE prov = new ListaSE();
        
        for (int i = 0; i < pos; i++) {            
            ListaSE prov1 = intercalar(A[i], B[i]);
            while(prov1.getInicio() !=null){
                prov.insertar(prov1.getInicio().getDato());
                prov1.setInicio(prov1.getInicio().getSig());
            }            
        }
        return prov;
    }
    
    public static ListaSE intercalar(ListaSE A, ListaSE B) {
        ListaSE C = new ListaSE();

        while (A.getInicio() != null && B.getInicio() != null) {
            if (A.getInicio().getDato() <= B.getInicio().getDato()) {
                C.insertar(A.getInicio().getDato());
                A.setInicio(A.getInicio().getSig());
            } else {
                C.insertar(B.getInicio().getDato());
                B.setInicio(B.getInicio().getSig());
            }
        }
        while (A.getInicio() != null) {
            C.insertar(A.getInicio().getDato());
            A.setInicio(A.getInicio().getSig());
        }
        while (B.getInicio() != null) {
            C.insertar(B.getInicio().getDato());
            B.setInicio(B.getInicio().getSig());
        }

        return C;
    }

   
    public static int[] intercalar(int[] A, int[] B){
        int[] C = new int[A.length+B.length];
        int a=0;
        int b=0;
        int c=0;
        while(a<A.length && b<B.length)
            C[c++] = A[a]<=B[b] ? A[a++] : B[b++];             
        while(a<A.length)
            C[c++] = A[a++];       
        while(b<B.length)
            C[c++] = B[b++];        
        return C;
    }
    
    public static boolean ordenado(int[] F){
        for (int i = 0; i < F.length; i++) {
            if(i+1==F.length) return true;
            if(F[i]>F[i+1])return false;
        }
        return true;
    }
   
    public static void main(String[] args) {
        int[] p = {1,2,223,4,5,6,7,8,9,11};
        int[] r ;
        String[][] q;
        q=mezclaNatural(p);
        for (int i = 0; i < q[0].length; i++){ 
            for (int j = 0; j < q.length; j++)
                System.out.print(q[j][i]+" - ");
            System.out.println("");
        }
    }

}
