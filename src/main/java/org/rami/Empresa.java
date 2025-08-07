package org.rami;
import java.util.List;
import java.util.ArrayList;
public class Empresa {
    private List<Empleado> empleados;

    public Empresa() {
        empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void mostrarSalario() {
        for (Empleado e : empleados) {
            System.out.println(e.getNombreCompleto() + ": $" + e.calcularSalario());
        }
    }

    public Empleado empleadoConMasClientes() {
        EmpleadoComision empleadoMasClientes = null; // new Empleado()....

        for(Empleado empleado : empleados){
            if (empleado instanceof EmpleadoComision) {
                EmpleadoComision empleadoComision = (EmpleadoComision) empleado;
                if(empleadoMasClientes == null || empleadoComision.getClientesCaptados() > empleadoMasClientes.getClientesCaptados()) {
                    empleadoMasClientes = empleadoComision;
                }
            }
        }

        return empleadoMasClientes;
    }



}
