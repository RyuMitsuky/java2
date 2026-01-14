
package modelo;


public class Colaborador extends Persona {
    
    private String horasMes;
    private String meta;

    public Colaborador(String horasMes, String meta, String documento, String nombre, String apellido, String cedula, String direccion) {
        super(documento, nombre, apellido, cedula, direccion);
        this.horasMes = horasMes;
        this.meta = meta;
    }

    public String getHorasMes() {
        return horasMes;
    }

    public void setHorasMes(String horasMes) {
        this.horasMes = horasMes;
    }

    public String getMeta() {
        return meta;
    }

    public void setMeta(String meta) {
        this.meta = meta;
    }
    
    
    
}
