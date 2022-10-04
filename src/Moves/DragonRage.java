package Moves;

import ru.ifmo.se.pokemon.*;

public class DragonRage extends SpecialMove {

    public DragonRage() {
        super(Type.DRAGON, 0, 1.0d);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().attack(40.0d);
        p.addEffect(e);
    }

    @Override
    protected String describe() {
        return "использует Dragon Rage";
    }
}
