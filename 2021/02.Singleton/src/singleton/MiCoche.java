package singleton;

import model.VehicleGamaBaja;

public class MiCoche extends VehicleGamaBaja {
    private static MiCoche miCoche;

    private MiCoche() { }

    public String getOwnerName() {
        return "Jean Carlos Santoya Cabrera";
    }

    public static MiCoche getInstance() {
        if(miCoche == null) {
            miCoche = new MiCoche();
        }
        return miCoche;
    }
}
