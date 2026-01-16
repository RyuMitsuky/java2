package modelo;

public abstract class Funciones {

    private Persona[] personas = new Persona[10];
    private int contador = 0;

    public void registrarPersona(Persona p) {
        if (contador < personas.length) {
            personas[contador] = p;
            contador++;
        } else {
            System.out.println("No se pueden registrar más personas");
        }
    }

    public void verPersonas() {
        if (contador == 0) {
            System.out.println("No hay personas registradas");
        } else {
            for (int i = 0; i < contador; i++) {
                personas[i].presentarse();
            }
        }
    }
}
