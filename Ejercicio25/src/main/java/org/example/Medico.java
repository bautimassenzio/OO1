package org.example;

import java.time.LocalDate;
import java.time.Period;

public class Medico {
    private String nombre;
    private LocalDate fechaIngreso;
    private double honorario;

    public Medico(String nombre, LocalDate fechaIngreso, double honorario){
        this.nombre=nombre;
        this.fechaIngreso=fechaIngreso;
        this.honorario=honorario;
    }

    public double getHonorario() {
        return honorario;
    }

    public double valorAntiguedad(){
        return (Period.between(this.fechaIngreso, LocalDate.now()).getYears()) * 100;
    }
}
