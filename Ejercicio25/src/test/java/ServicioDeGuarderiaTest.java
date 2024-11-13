import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.example.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class ServicioDeGuarderiaTest {
    private ServicioDeGuarderia servicioDeGuarderia;
    private ServicioDeGuarderia servicioDeGuarderia2;
    private Mascota mascota;
    private Mascota mascota2;


    @BeforeEach
    void setUp(){
        mascota = new Mascota("Firulais",LocalDate.of(2024,05,05), "Mamifero");
        mascota2 = new Mascota("Flavio", LocalDate.of(2020,02,02),"Naranja");
        mascota.darAltaGuarderia(10);
        mascota.darAltaGuarderia(10);
        mascota.darAltaGuarderia(10);
        mascota.darAltaGuarderia(10);
        mascota.darAltaGuarderia(10);
        servicioDeGuarderia = new ServicioDeGuarderia(mascota, 10);
        servicioDeGuarderia2 = new ServicioDeGuarderia(mascota2,2);
    }

    @Test
    void testCalcular(){
        assertEquals(4500,servicioDeGuarderia.calcular());
    }

    @Test
    void testCalcularDescuento(){
        assertEquals(900,servicioDeGuarderia.calcularDescuento(1000));
        assertEquals(500, servicioDeGuarderia2.calcularDescuento(500));
    }
}
