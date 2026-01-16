package vista;

import modelo.*;
import java.util.Scanner;

public class Main extends Funciones {

    public static void main(String[] args) {

        Main sistema = new Main();
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 5) {

            System.out.println("\n--- MENU FUNDACION ---");
            System.out.println("1. Registrar empleado");
            System.out.println("2. Registrar colaborador");
            System.out.println("3. Registrar beneficiario");
            System.out.println("4. Ver personas");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.println("Ingrese nombre: ");
                String nombre = sc.next();
                System.out.println("Ingrese apellido: ");
                String apellido = sc.next();
                System.out.println("Ingrese cargo: ");
                String cargo = sc.next();
                System.out.println("Ingrese horario (8-5 o 2-11): ");
                String horario = sc.next();
                System.out.println("Ingrese salario: ");
                double salario = sc.nextDouble();

                Empleado e = new Empleado(salario, cargo, horario, "CC", nombre, apellido, "000", "Direccion");
                sistema.registrarPersona(e);
                System.out.println("Empleado registrado ✔");

            } else if (opcion == 2) {
                System.out.println("Ingrese nombre: ");
                String nombre = sc.next();
                System.out.println("Ingrese apellido: ");
                String apellido = sc.next();
                System.out.println("Ingrese horas al mes: ");
                int horas = sc.nextInt();
                System.out.println("Ingrese meta: ");
                String meta = sc.next();

                Colaborador c = new Colaborador(horas, meta, "CC", nombre, apellido, "000", "Direccion");
                sistema.registrarPersona(c);
                System.out.println("Colaborador registrado ✔");

            } else if (opcion == 3) {
                System.out.println("Ingrese nombre: ");
                String nombre = sc.next();
                System.out.println("Ingrese apellido: ");
                String apellido = sc.next();
                System.out.println("Ingrese cantidad de ayudas: ");
                int ayudas = sc.nextInt();

                Beneficiario b = new Beneficiario(ayudas, "TI", nombre, apellido, "000", "Direccion");
                sistema.registrarPersona(b);
                System.out.println("Beneficiario registrado ✔");

            } else if (opcion == 4) {
                sistema.verPersonas();

            } else if (opcion == 5) {
                System.out.println("Saliendo del sistema...");
            } else {
                System.out.println("Opcion invalida");
            }
        }
    }
}
