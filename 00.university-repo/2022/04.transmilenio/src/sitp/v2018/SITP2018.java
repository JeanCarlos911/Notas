package sitp.v2018;

import model.Destination;
import model.Usuario;
import model.Zone;
import service.*;
import sitp.SITP;
import sitp.v2018.destination.Perdomo;
import sitp.v2018.destination.PortalTunal;

import java.util.ArrayList;
public class SITP2018 implements SITP {
    private ArrayList<Transporte> services;
    private ArrayList<Destination> trunkLineDestinations;
    private ArrayList<Destination> feederDestinations;
    private ArrayList<Destination> urbanDestinations;
    private ArrayList<Destination> especialDestinations;
    private ArrayList<Destination> complementaryDestinations;
    public SITP2018() {
        trunkLineDestinations.add(new PortalTunal());
        trunkLineDestinations.add(new PortalTunal());
        trunkLineDestinations.add(new PortalTunal());

        loadServices();
        loadZones();
    }

    private void loadServices() {
        services = new ArrayList<>();
        services.add(new Transmilenio());
        services.add(new Complementario());
        services.add(new Especial());
        services.add(new Alimentador());
        services.add(new Urbano());
    }

    private void loadZones() {
        zones = new ArrayList<>();
        zones.add(new Perdomo);
    }
    @Override
    public ArrayList<Transporte> getServices() {
        return services;
    }

    @Override
    public ArrayList<Zone> getZones() {
        return zones;
    }

    @Override
    public void transportarUsuario(Usuario usuario, Destination start, Destination end) {
        for(Zone zone: zones) {
            if(zone.getDestinations().contains(start)) {
                
            }
        }
    }
}
