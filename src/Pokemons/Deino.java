package Pokemons;

import Moves.*;
import ru.ifmo.se.pokemon.*;

public class Deino extends Pokemon {

    public Deino(String name, int level) {
        super(name, level);
        setType(Type.DARK, Type.DRAGON);
        setStats(52, 65, 50, 45, 50, 38);
        setMove(new DoubleTeam(), new DragonRage());
    }
}
