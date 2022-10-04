package Moves;

import ru.ifmo.se.pokemon.*;

public class DarkPulse extends SpecialMove {

    public DarkPulse() {
        super(Type.DARK, 80.0d, 1.0d);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().chance(0.2d);
        e.flinch(p);
    }

    @Override
    protected String describe() {
        return "использует Dark Pulse";
    }
}
