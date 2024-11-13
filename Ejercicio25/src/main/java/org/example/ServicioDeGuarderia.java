package org.example;

public class ServicioDeGuarderia extends ServicioMedico {
    private int cantidadDias;

    public ServicioDeGuarderia(Mascota mascota, int cantidadDias) {
        super(mascota);
        this.cantidadDias = cantidadDias;
    }

    public double calcular() {
        return this.calcularDescuento(this.cantidadDias * 500);
    }
}
