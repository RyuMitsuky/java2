package modelo;

public class Colaborador extends Persona {

    private int horasMes;
    private String meta;

    public Colaborador(int horasMes, String meta,
                       String documento, String nombre, String apellido,
                       String cedula, String direccion) {

        super(documento, nombre, apellido, cedula, direccion);
        this.horasMes = horasMes;
        this.meta = meta;
    }

    @Override
    public void presentarse() {
        System.out.println(
            "Soy colaborador, mi nombre es " + getNombre() + " " + getApellido() +
            ", horas al mes: " + horasMes +
            ", meta: " + meta
        );
    }

    // getters y setters si quieres
    public int getHorasMes() {
        return horasMes;
    }

    public void setHorasMes(int horasMes) {
        this.horasMes = horasMes;
    }

    public String getMeta() {
        return meta;
    }

    public void setMeta(String meta) {
        this.meta = meta;
    }
}
