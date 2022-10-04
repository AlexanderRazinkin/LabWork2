package Moves;

import ru.ifmo.se.pokemon.*;

public class BrutalSwing extends PhysicalMove {

    public BrutalSwing() {
        super(Type.DARK, 60.0d, 1.0d);
    }

    @Override
    protected String describe() {
        return "использует Brutal Swing";
    }
}
