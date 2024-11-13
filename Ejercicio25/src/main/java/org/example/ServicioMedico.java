package org.example;

import java.time.DayOfWeek;
import java.time.LocalDate;

public abstract class ServicioMedico {
    private Mascota mascota;
    private LocalDate fechaAtencion;

    public ServicioMedico(Mascota mascota){
        this.mascota=mascota;
        this.fechaAtencion=LocalDate.now();
    }

    public double calcularCosto(){
        return this.calcular();
    }

    public double esDomingo(){
        if (this.fechaAtencion.getDayOfWeek() == DayOfWeek.SUNDAY){
            return 200;
        }
        return 0;
    }

    public double calcularDescuento(double monto){
        if(this.mascota.masCincoServicios()){
            return monto - (monto * 0.10);
        }
        return monto;
    }

    public boolean coincideFecha(LocalDate unaFecha){
        return unaFecha.isEqual(this.fechaAtencion);
    }

    public void setFechaAtencion(LocalDate fechaAtencion) { //para test
        this.fechaAtencion = fechaAtencion;
    }

    public abstract double calcular();
}
