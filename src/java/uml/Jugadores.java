
package uml;


public class Jugadores {
    String id; 
    String nomb_jug;
    String apell_jug; 
    String apodo;
    String posicion;
    int edad;
    float talla;
    float peso;
    String confederacion;
    String pais;
    String liga;
    String club;
    int part_sel;
    int goles_sel;
    int mund_jug;

    public Jugadores() {
    }

    public Jugadores(String id, String nomb_jug, String apell_jug, String apodo, String posicion, int edad, float talla, float peso, String confederacion, String pais, String liga, String club, int part_sel, int goles_sel, int mund_jug) {
        this.id = id;
        this.nomb_jug = nomb_jug;
        this.apell_jug = apell_jug;
        this.apodo = apodo;
        this.posicion = posicion;
        this.edad = edad;
        this.talla = talla;
        this.peso = peso;
        this.confederacion = confederacion;
        this.pais = pais;
        this.liga = liga;
        this.club = club;
        this.part_sel = part_sel;
        this.goles_sel = goles_sel;
        this.mund_jug = mund_jug;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomb_jug() {
        return nomb_jug;
    }

    public void setNomb_jug(String nomb_jug) {
        this.nomb_jug = nomb_jug;
    }

    public String getApell_jug() {
        return apell_jug;
    }

    public void setApell_jug(String apell_jug) {
        this.apell_jug = apell_jug;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getTalla() {
        return talla;
    }

    public void setTalla(float talla) {
        this.talla = talla;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getConfederacion() {
        return confederacion;
    }

    public void setConfederacion(String confederacion) {
        this.confederacion = confederacion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getLiga() {
        return liga;
    }

    public void setLiga(String liga) {
        this.liga = liga;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public int getPart_sel() {
        return part_sel;
    }

    public void setPart_sel(int part_sel) {
        this.part_sel = part_sel;
    }

    public int getGoles_sel() {
        return goles_sel;
    }

    public void setGoles_sel(int goles_sel) {
        this.goles_sel = goles_sel;
    }

    public int getMund_jug() {
        return mund_jug;
    }

    public void setMund_jug(int mund_jug) {
        this.mund_jug = mund_jug;
    }

    
}
