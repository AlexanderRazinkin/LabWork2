import Pokemons.*;
import ru.ifmo.se.pokemon.*;


public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();

        Deino p1 = new Deino("1", 1);
        Hydreigon p2 = new Hydreigon("2", 1);
        Ledian p3 = new Ledian("3", 1);
        Ledyba p4 = new Ledyba("4", 1);
        Magearna p5 = new Magearna("5", 1);
        Zweilous p6 = new Zweilous("6", 1);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);

        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);


        b.go();
    }
}