package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Mascota {
    private String nombre;
    private LocalDate fechaNacimiento;
    private String especie;
    private List<ServicioMedico> serviciosMedicos;

    public Mascota(String nombre, LocalDate fechaNacimiento, String especie){
        this.nombre=nombre;
        this.fechaNacimiento=fechaNacimiento;
        this.especie=especie;
        this.serviciosMedicos= new ArrayList<ServicioMedico>();
    }

    public LocalDate darAltaConsultaMedica(Medico medico){
        ConsultaMedica nuevaConsulta= new ConsultaMedica(this, medico);
        this.serviciosMedicos.add(nuevaConsulta);
        return LocalDate.now();
    }

    public LocalDate darAltaVacunacion(Medico medico, String nombreVacuna, double costo){
        Vacunacion nuevaVacunacion = new Vacunacion(this, nombreVacuna, costo, medico);
        this.serviciosMedicos.add(nuevaVacunacion);
        return  LocalDate.now();
    }

    public LocalDate darAltaGuarderia(int cantidadDias){
        ServicioDeGuarderia nuevaGuarderia = new ServicioDeGuarderia(this,cantidadDias);
        this.serviciosMedicos.add(nuevaGuarderia);
        return LocalDate.now();
    }

    public boolean masCincoServicios(){
        return this.serviciosMedicos.size() >=5;
    }

    public double determinarRecaudacion(LocalDate fecha){
        return this.serviciosMedicos.stream()
                .filter(servicioMedico -> servicioMedico.coincideFecha(fecha))
                .mapToDouble(ServicioMedico::calcularCosto).sum();
    }
}
