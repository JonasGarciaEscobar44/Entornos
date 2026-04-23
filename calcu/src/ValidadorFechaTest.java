import static org.junit.jupiter.api.Assertions.*;
import org.junit.*;

public class ValidadorFechaTest {

    @Test
    public void testFechaTotalmenteNormal() {
        ValidadorFecha validador = new ValidadorFecha();
        assertTrue(validador.esFechaValida(16, 4, 2026));
    }

    @Test
    public void testMesIncorrecto() {
        ValidadorFecha validador = new ValidadorFecha();
        assertFalse(validador.esFechaValida(10, 13, 2026));
    }

    @Test
    public void testDiaInvalidoParaMesDe30Dias() {
        ValidadorFecha validador = new ValidadorFecha();
        assertFalse(validador.esFechaValida(31, 11, 2026));
    }

    @Test
    public void testFebreroEnAnoBisiesto() {
        ValidadorFecha validador = new ValidadorFecha();
        assertTrue(validador.esFechaValida(29, 2, 2024));
    }

    @Test
    public void testFebreroEnAnoNoBisiesto() {
        ValidadorFecha validador = new ValidadorFecha();
        assertFalse(validador.esFechaValida(29, 2, 2026));
    }

    @Test
    public void testValoresNegativosOCero() {
        ValidadorFecha validador = new ValidadorFecha();
        assertFalse(validador.esFechaValida(-5, 0, 2020));
    }
}
