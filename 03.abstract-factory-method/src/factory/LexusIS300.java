package factory;

import component.*;

public class LexusIS300 extends Car {
    private static LexusIS300 lexusIS300;

    private LexusIS300() {}

    public Engine createEngine() {
        return new BasicEngine();
    }

    public Suspension createSuspension() {
        return new BasicSuspension();
    }

    public Brakes createBrakes() {
        return new BasicBrakes();
    }

    public static LexusIS300 getInstance() {
        if (lexusIS300 == null) {
            lexusIS300 = new LexusIS300();
        }
        return lexusIS300;
    }
}