import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlayerTest {

    @Test

    public void setAndGetPlayer() {
        Player player = new Player(34, "Oleg", 12);

        player.setId(34);

        int expected = 34;
        int actual = player.getId();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void setAndGetPlayer1() {
        Player player = new Player(34, "Oleg", 12);

        player.setStrength(12);

        int expected = 12;
        int actual = player.getStrength();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void setAndGetPlayer2() {
        Player player = new Player(34, "Oleg", 12);

        player.setName("Oleg");

        String expected = ("Oleg");
        String actual = player.getName();

        Assertions.assertEquals(expected, actual);
    }
}
