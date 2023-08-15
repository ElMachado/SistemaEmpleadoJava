package Modelo;

import Abstracto.Empleado;

public class EmpleadoPorHoras extends Empleado {
    private double horasTrabajadas;


   private double salarioBase;

    public EmpleadoPorHoras(String nombre, int edad, double salarioBase, double horasTrabajadas) {
        super(nombre, edad, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.salarioBase = salarioBase;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }



    @Override
    public double calcularSalario() {
        return salarioBase*this.horasTrabajadas;
    }

    @Override
    public String toString() {
        return "Empleado por horas{" +
                "Nombre: "+ super.nombre+
                " Edad: "+ super.edad+
                ", salarioBase = " + this.salarioBase+
                " Salario total Calculado ="+calcularSalario()+
                '}';
    }
}
