package com.example;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class HolaMundoControllerTest {
    @Test
    void testHolaMundo() {
        HolaMundoController controller = new HolaMundoController();
        String response = controller.holaMundo();
        assertThat(response).isEqualTo("Hola Mundo!");
    }
}
