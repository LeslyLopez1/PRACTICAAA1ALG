public class Instrumento {
    private int clave;
    private String nombre;
    private Boolean validez;
    private Boolean confiabilidad;
    private String autor;
    private String tipo;
    private String forma;
    private int cita;
    private String condicion;


    public Instrumento(int clave, String nombre, Boolean validez,
                       Boolean confiabilidad, String autor,
                       String tipo, String forma, int cita,
                       String condicion) {
        this.clave = clave;
        this.nombre = nombre;
        this.autor = autor;
        this.tipo = tipo;
        this.forma = forma;
        this.validez = validez;
        this.confiabilidad = confiabilidad;
        this.condicion = condicion;
        this.cita = cita;
    }

    //getters para la busqueda
    public int getClave() { return clave; }
    public String getNombre() { return nombre; }
    public String getAutor() { return autor; }
    public String getTipo() { return tipo; }
    public String getForma() { return forma; }
    public Boolean getValidez() { return validez; }
    public String getCondicion() { return condicion; }
    public Boolean getConfiabilidad() { return confiabilidad; }

    public String toString() {
        return clave + "," + nombre + "," + validez + "," + confiabilidad + "," + autor + "," +
                tipo + "," + forma + "," + cita + "," + condicion;
    }
}
