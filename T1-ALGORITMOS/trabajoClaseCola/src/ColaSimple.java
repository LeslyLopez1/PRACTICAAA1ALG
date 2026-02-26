public class ColaSimple <T>{
    private T[] cola;
    private int inicio;
    private int fin;

    public ColaSimple(int capacidad){
        cola = (T[]) new Object[capacidad];
        inicio = -1;
        fin = -1;
    }

    public ColaSimple(){
        inicio = 0;
        fin = 0;
        cola = (T[]) new Object[10];
    }

    public void insertarDato(T obj ){
        if(fin < cola.length-1){
            cola[fin++] = obj;
            if (fin == 0){
                inicio = 0;

            }
        }

    }

    public T eliminarDato(){



        return dato;
    }
}
