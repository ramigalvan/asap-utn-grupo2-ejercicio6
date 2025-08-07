package org.rami;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Empresa asap = new Empresa();
            Empleado empleadoC1 = new EmpleadoComision("44601601", "juan", "juan", 2000, 10, 20000 );
            Empleado empleadoC2 = new EmpleadoComision("44123123", "perez", "perez", 2010, 1, 200 );
            Empleado empleadoC3 = new EmpleadoComision("446041601", "juan", "2", 2000, 155, 20000 );
            Empleado empleadoC4 = new EmpleadoComision("441234123", "perez", "2", 2010, 3, 20 );
            Empleado empleadoFijo = new EmpleadoFijo("301" , "lucas" , "mendez" , 2015, 65000);


            asap.agregarEmpleado(empleadoC1);
            asap.agregarEmpleado(empleadoC2);
            asap.agregarEmpleado(empleadoC3);
            asap.agregarEmpleado(empleadoC4);

            asap.agregarEmpleado(empleadoFijo);

            //muestra el salario
            asap.mostrarSalario();

            //empleado con mas clientes
            Empleado empleado = asap.empleadoConMasClientes();
            if (empleado != null) {
                System.out.println("Empleado con mas clientes: " + empleado.getNombreCompleto());
            } else {
                System.out.println("no hay empleados a comision");

            }


        }
    }
