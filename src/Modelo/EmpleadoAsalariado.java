package Modelo;

import Abstracto.Empleado;
import Interfaz.IBeneficios;

public class EmpleadoAsalariado extends Empleado implements IBeneficios {
    private double bonoAnual;
    private double salarioBase;
    public EmpleadoAsalariado(String nombre, int edad, double salarioBase, double bonoAnual) {
        super(nombre, edad, salarioBase);
        this.bonoAnual = bonoAnual;
        this.salarioBase = salarioBase;
    }


    @Override
    public double calcularSalario() {
        return this.salarioBase + this.bonoAnual;
    }

    @Override
    public double calcularBeneficios() {
        return this.salarioBase * 0.05;
    }

    @Override
    public String toString() {
        return "Empleado Asalariado{" +
                "Nombre: "+ super.nombre+
                " Edad: "+ super.edad+
                " bonoAnual = " + this.bonoAnual +
                ", salarioBase = " + this.salarioBase+
                " Salario total Calculado ="+calcularSalario()+
                " Beneficios calculados = " + calcularBeneficios()+
                '}';
    }
}
