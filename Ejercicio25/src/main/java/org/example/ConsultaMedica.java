package org.example;

public class ConsultaMedica extends ServicioMedico{
    private Medico medico;

    public ConsultaMedica(Mascota mascota, Medico medico){
        super(mascota);
        this.medico=medico;
    }

    public double calcular(){
        return this.medico.getHonorario() + 300 + this.esDomingo() + medico.valorAntiguedad();
    }
}
