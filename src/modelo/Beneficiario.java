package modelo;

public class Beneficiario extends Persona {

    private int cantidadAyudas;

    public Beneficiario(int cantidadAyudas,
                        String documento, String nombre, String apellido,
                        String cedula, String direccion) {

        super(documento, nombre, apellido, cedula, direccion);
        this.cantidadAyudas = cantidadAyudas;
    }

    @Override
    public void presentarse() {
        System.out.println(
            "Soy beneficiario, mi nombre es " + getNombre() + " " + getApellido() +
            ", cantidad de ayudas al mes: " + cantidadAyudas
        );
    }


    public int getCantidadAyudas() {
        return cantidadAyudas;
    }

    public void setCantidadAyudas(int cantidadAyudas) {
        this.cantidadAyudas = cantidadAyudas;
    }
}
