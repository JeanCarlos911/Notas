package sitp.v2018.destination;

import model.Destination;

public class Paraiso extends Destination {
    private static Paraiso paraiso = null;
    private Paraiso() {
        super("Paraiso");
    }
    public static Paraiso getInstance() {
        if(paraiso == null) {
            paraiso = new Paraiso();
        }
        return paraiso;
    }
}
