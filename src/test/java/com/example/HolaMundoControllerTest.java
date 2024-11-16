package com.example;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HolaMundoControllerTest {

    @Test
    public void testHolaMundo() {
        HolaMundoController controller = new HolaMundoController();
        String response = controller.holaMundo();
        assertThat(response).isEqualTo("Hola Mundo");
    }
}
