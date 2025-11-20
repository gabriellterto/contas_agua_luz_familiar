package calculadora.luz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class CalculadoraLuzTest {
    @Test
    public void testCalcularValorPorCasa() {
        CalculadoraLuz calculadora = new CalculadoraLuz();
        List<Float> valorPorCasa = calculadora.calcularValorPorCasa(100f, List.of(10, 20, 30), 60);

        assertEquals(3, valorPorCasa.size());
        assertEquals(16.666666666666668f, valorPorCasa.get(0));
        assertEquals(33.333333333333336f, valorPorCasa.get(1));
        assertEquals(50f, valorPorCasa.get(2));
    }
}
