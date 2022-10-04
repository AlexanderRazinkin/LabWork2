package Moves;

import ru.ifmo.se.pokemon.*;

public class Supersonic extends StatusMove {

    public Supersonic() {
        super(Type.NORMAL, 0.0d, 0.55d);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect();
        e.confuse(p);
    }

    @Override
    protected String describe() {
        return "использует Supersonic";
    }
}
