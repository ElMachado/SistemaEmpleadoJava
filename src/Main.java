import Abstracto.Empleado;
import Modelo.EmpleadoAsalariado;
import Modelo.EmpleadoPorComision;
import Modelo.EmpleadoPorHoras;
import Modelo.Empresa;

public class Main {
    public static void main(String[] args) {
        EmpleadoAsalariado asalariado1 = new EmpleadoAsalariado(
                "jesús",25,600000.0,500000.0);

        EmpleadoAsalariado asalariado2 = new EmpleadoAsalariado(
                "Juan",25,600000.0,900000.0);
        EmpleadoAsalariado asalariado3 = new EmpleadoAsalariado(
                "Pedro",25,600000.0,700000.0);
        EmpleadoPorHoras empleadoPorHoras1 = new EmpleadoPorHoras(
                "Silvio",32,8600.00,180);

        EmpleadoPorHoras empleadoPorHoras2 = new EmpleadoPorHoras(
                "Sixto",32,8600.00,190);
        EmpleadoPorHoras empleadoPorHoras3 = new EmpleadoPorHoras(
                "Pancracio",32,8600.00,210);
        EmpleadoPorComision empleadoPorComision1 = new EmpleadoPorComision("Ismael",37,500000,34);
        EmpleadoPorComision empleadoPorComision2 = new EmpleadoPorComision("Gregorio",27,500000,26);
        EmpleadoPorComision empleadoPorComision3 = new EmpleadoPorComision("Eusebio",32,500000,9);
        Empresa empresa = new Empresa();

        empresa.agregarEmpleado(asalariado1);

        empresa.agregarEmpleado(asalariado2);
        empresa.agregarEmpleado(asalariado3);
        empresa.agregarEmpleado(empleadoPorHoras1);
        empresa.agregarEmpleado(empleadoPorHoras2);
        empresa.agregarEmpleado(empleadoPorHoras3);
        empresa.agregarEmpleado(empleadoPorComision1);
        empresa.agregarEmpleado(empleadoPorComision2);
        empresa.agregarEmpleado(empleadoPorComision3);

        empresa.mostrarEmpleados();
    }
}