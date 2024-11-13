import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.example.ConsultaMedica;
import org.example.Mascota;
import org.example.Medico;
import org.example.Vacunacion;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class VacunacionTest {
    private Vacunacion vacunacion;
    private Mascota mascota;
    private Medico medico;


    @BeforeEach
    void setUp(){
        mascota = new Mascota("Fatiga",LocalDate.of(2024,05,05), "Mamifero");
        medico = new Medico("juancho",LocalDate.of(2023,05,05),500);
        vacunacion = new Vacunacion(mascota, "Vacuna1", 500, medico);
    }

    @Test
    void testCalcular(){
        assertEquals(1500,vacunacion.calcular());
    }
}
