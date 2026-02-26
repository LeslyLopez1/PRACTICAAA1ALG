import java.util.ArrayList;
import java.util.List;
public class Coleccion {
    private ArrayList<Instrumento> instrumentos;

    public Coleccion()o{
        instrumentos = new ArrayList<>();
    }
    public void agregarInstrumento(Instrumento instrumento){
        instrumentos.add(instrumento);
    }
    public ArrayList<Instrumento> getInstrumentos() {
        return instrumentos;
    }

    public void eliminarPorClave(int clave) {
        instrumentos.removeIf(i -> i.getClave() == clave);
    }

    ////////////////////////////////////////
    //METODOS PARA LAS CONSULTAS O TIPOS DE CONSULTAS (SUBMENU)
    public static List<Instrumento> porAutor(Coleccion c, String autor) {
        List<Instrumento> resultado = new ArrayList<>();
        for (Instrumento i : c.getInstrumentos()) {
            if (i.getAutor().equalsIgnoreCase(autor)) {
                resultado.add(i);
            }
        }
        return resultado;
    }

    public static List<Instrumento> porTipo(Coleccion c, String tipo) {
        List<Instrumento> resultado = new ArrayList<>();
        for (Instrumento i : c.getInstrumentos()) {
            if (i.getTipo().equalsIgnoreCase(tipo)) {
                resultado.add(i);
            }
        }
        return resultado;
    }

    public static List<Instrumento> porForma(Coleccion c, String forma) {
        List<Instrumento> resultado = new ArrayList<>();
        return resultado;
    }

    public static List<Instrumento> porCondicion(Coleccion c, String condicion) {
        List<Instrumento> resultado = new ArrayList<>();
        return resultado;
    }

    public static List<Instrumento> evaluados(Coleccion c) {
        List<Instrumento> resultado = new ArrayList<>();
        return resultado;
    }

    public static List<Instrumento> condicionYEvaluados(Coleccion c, String condicion) {
        List<Instrumento> resultado = new ArrayList<>();
        return resultado;
    }

    public static List<Instrumento> ordenarPorClave(Coleccion c) {
        List<Instrumento> resultado = new ArrayList<>(c.getInstrumentos());
        return resultado;
    }

    public static List<Instrumento> ordenarPorAutor(Coleccion c) {
        List<Instrumento> resultado = new ArrayList<>(c.getInstrumentos());
        return resultado;
    }

}