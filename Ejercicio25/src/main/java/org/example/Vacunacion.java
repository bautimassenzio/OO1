package org.example;

public class Vacunacion extends ServicioMedico{
    private String nombre;
    private double costo;
    private Medico medico;

    public Vacunacion(Mascota mascota, String nombre, double costo, Medico medico){
        super(mascota);
        this.nombre=nombre;
        this.costo=costo;
        this.medico=medico;
    }

    public double calcular() {
        return this.medico.getHonorario() + 500 + this.esDomingo() + this.costo;
    }
}
