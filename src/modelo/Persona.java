package modelo;

    
public class Persona {
    
    public void presentarse() {
        System.out.println("Hola mi nombre es " + getNombre() + getApellido());

}  
    String documento;
    String nombre;
    String apellido;
    String cedula;
    String direccion;

    public Persona(String documento, String nombre, String apellido, String cedula, String direccion) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccion = direccion;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}


