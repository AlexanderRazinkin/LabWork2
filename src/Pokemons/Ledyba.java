package Pokemons;

import Moves.*;
import ru.ifmo.se.pokemon.*;

public class Ledyba extends Pokemon {

    public Ledyba(String name, int level) {
        super(name, level);
        setType(Type.BUG, Type.FLYING);
        setStats(40, 20, 30, 40, 80, 55);
        setMove(new Confide(), new Rest(), new Supersonic());
    }
}
