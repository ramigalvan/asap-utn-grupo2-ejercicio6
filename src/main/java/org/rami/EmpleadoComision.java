package org.rami;

public class EmpleadoComision extends Empleado{
    private static final double SALARIO_MINIMO = 20000;
    private int clientesCaptados;
    private double montoACobrar;

    public EmpleadoComision(String dni, String nombre, String apellido, int anioIngreso, int clientesCaptados, double montoACobrar) {
        super(dni, nombre, apellido, anioIngreso);
        this.clientesCaptados = clientesCaptados;
        this.montoACobrar = montoACobrar;
    }

    @Override
    public double calcularSalario() {
        double salario = clientesCaptados * montoACobrar;
        return salario < SALARIO_MINIMO ? SALARIO_MINIMO : salario;
    }

    public int getClientesCaptados() {
        return clientesCaptados;
    }
}
