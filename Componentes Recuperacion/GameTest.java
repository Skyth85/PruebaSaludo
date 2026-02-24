package com.mycompany.componentesfxjemmy;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class GameTest {

    @Test
    public void testInstanciaAplicacion() {
        ComponentesFXJemmy app = new ComponentesFXJemmy();
        assertNotNull(app);
    }

    @Test
    public void testResultLabel() {
        ResultLabel label = new ResultLabel();
        label.showResult("Prueba");
        assertNotNull(label.getText());
    }

    @Test
    public void testGameButton() {
        GameButton button = new GameButton("Piedra", "red");
        assertNotNull(button.getChoice());
    }
}