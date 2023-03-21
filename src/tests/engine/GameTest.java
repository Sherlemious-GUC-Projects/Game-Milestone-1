package engine;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class GameTest {

    @Test
    public void loadHeroes() throws FileNotFoundException {
        Game.availableHeroes = new ArrayList<>();
        Game.loadHeroes("A:\\University\\Projects\\CS 4 Game\\Heros.csv");
        assertEquals("Joel Miller", Game.availableHeroes.get(0).getName());
    }
    @Test
    public void loadHeros2() throws FileNotFoundException {
        Game.availableHeroes = new ArrayList<>();
        Game.loadHeroes("A:\\University\\Projects\\CS 4 Game\\Heros.csv");
        assertEquals(140, Game.availableHeroes.get(0).getMaxHp());
    }
    @Test
    public void loadHeros3() throws FileNotFoundException {
        Game.availableHeroes = new ArrayList<>();
        Game.loadHeroes("A:\\University\\Projects\\CS 4 Game\\Heros.csv");
        assertEquals(5, Game.availableHeroes.get(0).getMaxActions());
    }
    @Test
    public void loadHeros4() throws FileNotFoundException {
        Game.availableHeroes = new ArrayList<>();
        Game.loadHeroes("A:\\University\\Projects\\CS 4 Game\\Heros.csv");
        assertEquals(30, Game.availableHeroes.get(0).getAttackDmg());
    }

    @Test
    public void loadHeros5() throws FileNotFoundException {
        Game.availableHeroes = new ArrayList<>();
        Game.loadHeroes("A:\\University\\Projects\\CS 4 Game\\Heros.csv");
        assertEquals("Ellie Williams", Game.availableHeroes.get(1).getName());
    }

    @Test
    public void loadHeros6() throws FileNotFoundException {
        Game.availableHeroes = new ArrayList<>();
        Game.loadHeroes("A:\\University\\Projects\\CS 4 Game\\Heros.csv");
        assertEquals(110, Game.availableHeroes.get(1).getMaxHp());
    }
}