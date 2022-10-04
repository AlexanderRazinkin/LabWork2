package Moves;

import ru.ifmo.se.pokemon.*;

public class DragonRush extends PhysicalMove {

    public DragonRush() {
        super(Type.DRAGON, 100.0d, 0.75d);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().chance(0.2d);
        e.flinch(p);
    }

    @Override
    protected String describe() {
        return "использует Dragon Rush";
    }
}
