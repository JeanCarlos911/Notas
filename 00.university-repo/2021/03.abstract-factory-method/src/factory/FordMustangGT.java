package factory;

import component.*;

public class FordMustangGT extends Car {
    private static FordMustangGT fordMustangGT;

    private FordMustangGT(){ }

    public Engine createEngine() {
        return new UltimateEngine();
    }

    public Suspension createSuspension() {
        return new UltimateSuspension();
    }

    public Brakes createBrakes() {
        return new UltimateBrakes();
    }

    public static FordMustangGT getInstance() {
        if (fordMustangGT == null) {
            fordMustangGT = new FordMustangGT();
        }
        return fordMustangGT;
    }
}