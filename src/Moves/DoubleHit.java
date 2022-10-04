package Moves;

import ru.ifmo.se.pokemon.*;

public class DoubleHit extends PhysicalMove {

    public DoubleHit() {
        super(Type.NORMAL, 35.0, 0.9, 1, 2);
    }

    @Override
    protected String describe() {
        return "использует Double Hit";
    }
}
