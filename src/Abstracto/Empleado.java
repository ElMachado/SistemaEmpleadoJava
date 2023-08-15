package Abstracto;

import Interfaz.IEmpleado;

public abstract class Empleado implements IEmpleado {
    protected String nombre;
    protected int edad;
    protected double salarioBase;

    public Empleado(String nombre, int edad, double salarioBase) {
    this.nombre =nombre;
       this.edad = edad;
       this.salarioBase = salarioBase;
    }

    public double calcuarSalario() {
        return this.salarioBase;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salarioBase=" + salarioBase +
                '}';
    }
}
