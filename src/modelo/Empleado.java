package modelo;

public class Empleado extends Persona {

    private double salario;
    private String cargo;
    private String horario;

    public Empleado(double salario, String cargo, String horario, String documento, String nombre, String apellido, String cedula, String direccion) {
        super(documento, nombre, apellido, cedula, direccion);
        this.salario = salario;
        this.cargo = cargo;
        this.horario = horario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

}
