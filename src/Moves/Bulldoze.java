package Moves;

import ru.ifmo.se.pokemon.*;

public class Bulldoze extends PhysicalMove {

    public Bulldoze() {
        super(Type.GROUND, 60.0d, 1.0d);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().turns(-1).stat(Stat.SPEED, -1);
        p.addEffect(e);
    }

    @Override
    protected String describe() {
        return "использует Bulldoze";
    }
}
