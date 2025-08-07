package org.rami;

public class EmpleadoFijo extends Empleado {
    private double sueldoBasico;
    private double porcentaje;
    private static final int ANIO_ACTUAL = 2025;
    private static final double SUELDO_BASE = 50000.0;
    private static final double EXTRA_MENOS_2 = 0.0;
    private static final double EXTRA_2_A_5 = 0.05;
    private static final double INCREMENTO_6_A_10 = 0.10;
    private static final double BONUS_MAYOR_10 = 0.15;

    public EmpleadoFijo(String dni, String nombre, String apellido, int anioIngreso, double sueldoBasico) {
        super(dni, nombre, apellido, anioIngreso);
        this.porcentaje = 0;
        this.sueldoBasico = sueldoBasico;
    }

    private double porcSegunAntiguedad() {
        int antiguedad = ANIO_ACTUAL - getAnioIngreso();

        if (antiguedad < 2) {
            return EXTRA_MENOS_2;
        } else if (antiguedad <= 5) {
            return EXTRA_2_A_5;
        } else if (antiguedad <= 10) {
            return INCREMENTO_6_A_10;
        } else {
            return BONUS_MAYOR_10;
        }
    }

    @Override
    public double calcularSalario() {
        porcentaje = porcSegunAntiguedad();
        return sueldoBasico + sueldoBasico * porcentaje;

    }
}

