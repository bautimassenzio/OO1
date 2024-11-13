import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.example.ConsultaMedica;
import org.example.Mascota;
import org.example.Medico;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class MascotaTest {
    private Mascota mascota;
    private Medico medico;
    private Mascota mascota2;
    private LocalDate fechaActual;

    @BeforeEach
    void setUp(){
        mascota = new Mascota("Fatiga", LocalDate.of(2022,04,04),"Mamifero");
        medico = new Medico("juancito",LocalDate.of(2023,07,07),500);
        mascota2 = new Mascota("Fatiga2", LocalDate.of(2003,11,24),"qsy");
        mascota2.darAltaGuarderia(4);
        mascota2.darAltaGuarderia(4);
        mascota2.darAltaGuarderia(4);
        mascota2.darAltaGuarderia(4);
        mascota2.darAltaGuarderia(4);
        fechaActual=LocalDate.now();
    }

    @Test
    void testDarAltaConsultaMedica(){
        assertEquals(LocalDate.now(),mascota.darAltaConsultaMedica(medico));
    }

    @Test
    void testDarAltaVacunacion(){
        assertEquals(LocalDate.now(),mascota.darAltaVacunacion(medico,"vacuna20",400));
    }

    @Test
    void testDarAltaGuarderia(){
        assertEquals(LocalDate.now(),mascota.darAltaGuarderia(10));
    }

    @Test
    void testMasCincoServicios(){
        assertFalse(mascota.masCincoServicios());
        assertTrue(mascota2.masCincoServicios());
    }

    @Test
    void testDeterminarRecaudacion(){
        assertEquals(0,mascota.determinarRecaudacion(LocalDate.of(2020,05,05)));
        assertEquals(9000,mascota2.determinarRecaudacion(fechaActual));
    }
}
