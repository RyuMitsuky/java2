
package modelo;


public class Beneficiario extends Persona{
    
    private String cantidadAyudas;

    public Beneficiario(String cantidadAyudas, String documento, String nombre, String apellido, String cedula, String direccion) {
        super(documento, nombre, apellido, cedula, direccion);
        this.cantidadAyudas = cantidadAyudas;
    }

    public String getCantidadAyudas() {
        return cantidadAyudas;
    }

    public void setCantidadAyudas(String cantidadAyudas) {
        this.cantidadAyudas = cantidadAyudas;
    }
    
    
    
}
