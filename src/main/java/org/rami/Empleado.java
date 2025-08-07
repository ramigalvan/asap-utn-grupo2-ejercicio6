package org.rami;

public abstract class  Empleado {
    private int anioIngreso;
    private String dni;
    private String nombre;
    private String apellido;

    public Empleado(String dni, String nombre, String apellido, int anioIngreso) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.anioIngreso = anioIngreso;
    }
    public abstract double calcularSalario();

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombreCompleto() {
        return getNombre() + " " + getApellido();
    }

}
