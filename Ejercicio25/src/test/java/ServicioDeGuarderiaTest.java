import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.example.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class ServicioDeGuarderiaTest {
    private ServicioDeGuarderia servicioDeGuarderia;
    private Mascota mascota;


    @BeforeEach
    void setUp(){
        mascota = new Mascota("Firulais",LocalDate.of(2024,05,05), "Mamifero");
        mascota.darAltaGuarderia(10);
        mascota.darAltaGuarderia(10);
        mascota.darAltaGuarderia(10);
        mascota.darAltaGuarderia(10);
        mascota.darAltaGuarderia(10);
        servicioDeGuarderia = new ServicioDeGuarderia(mascota, 10);
    }

    @Test
    void testCalcular(){
        assertEquals(4500,servicioDeGuarderia.calcular());
    }
}
