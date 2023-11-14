package models;
import java.net.DatagramSocketImplFactory;
import models.Card.Rank;
import models.Card.Suit;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class PlayerTest {

    @BeforeAll
    public static void setUpClass() throws Exception {
    }

    @AfterAll
    public static void tearDownClass() throws Exception {
    }

    @BeforeEach
    public void setUp() throws Exception {
    }

    @AfterEach
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetName() {
        // Crear una instancia de Player con un nombre específico
        Player player = new Player("Diaz Hector", 100);

        // Llamar al método getName y comprobar si devuelve el nombre esperado
        String expectedName = "Diaz Hector";
        String actualName = player.getName();

        assertEquals(expectedName, actualName);
    }

    /**
     * Test of getCoins method, of class Player.
     */
    @Test
    public void testGetCoins() {
        System.out.println("test getCoins");
        Player player=new Player("pepe", 350);
        int expectedCoins=player.getCoins();
        assertEquals(350, expectedCoins);
    }

    @Test
    public void testAddCoins() {
        System.out.println("test addCoins");
       Player player= new Player("carlitos", 100);
       int amount = 100;
       player.addCoins(amount);
        assertEquals(200,player.getCoins());
    }

    @Test
    public void testSubtractCoins() {
        System.out.println("subtractCoins");
        Player player=new Player("eduardo", 300);
        int amount = 123;
        player.subtractCoins(amount);
        assertEquals(177, player.getCoins());
    }
@Test
public void testGetHandForBlackjack() {
    System.out.println("Testing getHand for Blackjack");

    // Create a Player instance with a Blackjack hand
    Player player = new Player("angel", 340);

    // Add two cards to the player's hand with a total value of 21 (a Blackjack hand)
    Card card1 = new Card(Suit.HEARTS, Rank.ACE);
    Card card2 = new Card(Suit.CLUBS, Rank.KING);
    player.getHand().addCard(card1);
    player.getHand().addCard(card2);

    // Check if the player's hand is a Blackjack hand
    assertTrue(player.getHand().isBlackjack());
}
}

