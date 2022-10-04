package Pokemons;

import Moves.*;
import ru.ifmo.se.pokemon.*;

public class Magearna extends Pokemon {

    public Magearna(String name, int level) {
        super(name, level);
        setType(Type.STEEL, Type.FAIRY);
        setStats(80, 95, 115, 130, 115, 65);
        addMove(new DarkPulse());
        addMove(new Bulldoze());
        addMove(new Confide());
        addMove(new BrutalSwing());
    }
}
