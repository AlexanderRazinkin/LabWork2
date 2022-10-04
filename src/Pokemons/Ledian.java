package Pokemons;

import Moves.*;
import ru.ifmo.se.pokemon.*;

public class Ledian extends Ledyba{

    public Ledian(String name, int level) {
        super(name, level);
        setType(Type.BUG, Type.FLYING);
        setStats(55, 35, 50, 55, 110, 85);
        addMove(new FocusBlast());
    }
}
