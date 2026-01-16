package modelo;

public abstract class Persona {

    private String documento;
    private String nombre;
    private String apellido;
    private String cedula;
    private String direccion;

    public Persona(String documento, String nombre, String apellido, String cedula, String direccion) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccion = direccion;
    }

 
    public abstract void presentarse();


    public String getDocumento() {
        return documento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public String getDireccion() {
        return direccion;
    }
}
