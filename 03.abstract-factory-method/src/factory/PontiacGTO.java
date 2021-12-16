package factory;

import component.*;

public class PontiacGTO extends Car {
    private static PontiacGTO pontiacGTO;

    private PontiacGTO() {}

    public Engine createEngine() {
        return new ProEngine();
    }

    public Suspension createSuspension() {
        return new ProSuspension();
    }

    public Brakes createBrakes() {
        return new ProBrakes();
    }

    public static PontiacGTO getInstance() {
        if (pontiacGTO == null) {
            pontiacGTO = new PontiacGTO();
        }
        return pontiacGTO;
    }
}