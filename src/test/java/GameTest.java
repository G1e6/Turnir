import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class GameTest {

    Game game = new Game();
    Player p1 = new Player(1, "Petay", 12);
    Player p2 = new Player(12, "Vasay", 6);
    Player p3 = new Player(144, "Olay", 12);
    Player p4 = new Player(16, "Olesay", 15);


    @Test
    public void nobodyRegistered() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            game.round("unkown1", "unknown2");
        });
    }

    @Test
    public void firstPlayerRegistered() {
        game.register(p1);
        game.register(p2);
        game.register(p3);

        Assertions.assertThrows(RuntimeException.class, () -> {
            game.round(p1.getName(), "unknown2");
        });
    }

    @Test
    public void secondPlayerRegistered() {
        game.register(p1);
        game.register(p2);
        game.register(p3);

        Assertions.assertThrows(RuntimeException.class, () -> {
            game.round("unkown1", p2.getName());
        });
    }

    @Test
    public void bothPlayersRegistered() {
        game.register(p1);
        game.register(p2);
        game.register(p3);

        int actual = game.round(p1.getName(), p2.getName());
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void bothPlayersStrength() {
        game.register(p1);
        game.register(p2);
        game.register(p3);

        int actual = game.round(p1.getName(), p3.getName());
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void bothPlayersStrength1() {
        game.register(p1);
        game.register(p2);
        game.register(p3);
        game.register(p4);

        int actual = game.round(p2.getName(), p4.getName());
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void test() {
        game.register(p1);
        game.register(p2);
        game.register(p3);


        ArrayList<Player> actual = game.getPlayers();
        ArrayList<Player> expected = new ArrayList<>();
        expected.add(p1);
        expected.add(p2);
        expected.add(p3);

        Assertions.assertEquals(expected, actual);
    }


}
