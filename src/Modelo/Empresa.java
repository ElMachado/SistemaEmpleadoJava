package Modelo;

import Abstracto.Empleado;
import Interfaz.IEmpleado;

import java.util.ArrayList;

public class Empresa {
    public ArrayList<IEmpleado> empleados = new ArrayList<>();

    public void agregarEmpleado(IEmpleado empleado){
        this.empleados.add(empleado);

    }
    public void mostrarEmpleados(){
       for (IEmpleado empleado: empleados){
           System.out.println(empleado.toString());
       }
    }
}
