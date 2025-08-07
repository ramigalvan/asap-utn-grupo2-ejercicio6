package org.rami;

public class EmpleadoComision extends Empleado{
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
        return salario < 20000 ? 20000 : salario;
    }

    public int getClientesCaptados() {
        return clientesCaptados;
    }
}
