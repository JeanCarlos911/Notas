package sitp.v2018.destination;

import model.Destination;

public class PortalTunal extends Destination {
    private static PortalTunal portalTunal = null;
    private PortalTunal() {
        super("Portal Tunal");
    }
    public static PortalTunal getInstance() {
        if(portalTunal == null) {
            portalTunal = new PortalTunal();
        }
        return portalTunal;
    }
}
