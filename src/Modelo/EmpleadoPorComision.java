package Modelo;

import Abstracto.Empleado;

public class EmpleadoPorComision extends Empleado {
    private int numeroVentas;

    public EmpleadoPorComision(String nombre, int edad, double salarioBase, int numeroVentas) {
        super(nombre, edad, salarioBase);
        this.numeroVentas = numeroVentas;
    }

    @Override
    public double calcularSalario() {
        if(numeroVentas >= 10){
            return this.salarioBase + (numeroVentas * (150000*0.10));
        }
        return this.salarioBase;
    }

    @Override
    public String toString() {
        return "Empleado Por Comision{" +
                "numeroVentas=" + numeroVentas +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salarioBase = " + salarioBase +
                " Salario Calculado = " + calcularSalario()+
                '}';
    }
}
