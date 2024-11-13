import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.example.ConsultaMedica;
import org.example.Mascota;
import org.example.Medico;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class ConsultaMedicaTest {
    private ConsultaMedica consultaMedica;
    private Mascota mascota;
    private Medico medico;


    @BeforeEach
    void setUp(){
        mascota = new Mascota("pepito",LocalDate.of(2024,05,05), "Mamifero");
        medico = new Medico("juancho",LocalDate.of(2023,05,05),500);
        consultaMedica = new ConsultaMedica(mascota,medico);
    }

    @Test
    void testCalcular(){
        assertEquals(900,consultaMedica.calcular());
    }
}
