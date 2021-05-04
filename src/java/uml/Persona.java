
package uml;

public class Persona {
    String id;
    String nombres;
    String apellidos;
    String correo;
    float celular;
    String direccion;
    String ciudad;
    String descripcion;

    public Persona() {
    }

    public Persona(String id, String nombres, String apellidos, String correo, float celular, String direccion, String ciudad, String descripcion) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.celular = celular;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.descripcion = descripcion;
    }

    public String getId() {
        return id;
    }

    public void setId(String codigo) {
        this.id = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public float getCelular() {
        return celular;
    }

    public void setCelular(float celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
