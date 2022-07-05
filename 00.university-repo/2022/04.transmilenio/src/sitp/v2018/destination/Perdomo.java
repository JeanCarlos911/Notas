package sitp.v2018.destination;

import model.Destination;
import model.Zone;

import java.util.ArrayList;

public class Perdomo implements Zone {
    private ArrayList<Destination> destinations;

    public Perdomo() {
        destinations.add(new Destination("Portal Tunal"));
    }

    @Override
    public ArrayList<Destination> getDestinations() {
        return destinations;
    }
}
