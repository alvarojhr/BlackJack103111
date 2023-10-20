package models;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PlayerTest {
    @Test
    public void testPlayerInitialCoins() {
        Player player = new Player("TestPlayer", 1000);
        int monedas_esperadas = 1000;
        int monedas_actuales = player.getCoins();
        assertEquals(monedas_esperadas, monedas_actuales);
    }

}
