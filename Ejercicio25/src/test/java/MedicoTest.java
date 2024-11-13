import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.example.Medico;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class MedicoTest {
    private Medico medico;

    @BeforeEach
    void setUp() {
        medico = new Medico("Rodrigo", LocalDate.of(2023,05,05),500);

    }

    @Test
    void testValorAntiguedad(){
        assertEquals(100,medico.valorAntiguedad());
    }

}
