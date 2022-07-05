package sitp.v2018;

import model.Destination;
import model.Usuario;
import service.*;
import sitp.SITP;
import sitp.v2018.destination.*;

import java.util.ArrayList;
public class SITP2018 implements SITP {
    private ArrayList<Transporte> services;
    private ArrayList<Destination> trunkLineDestinations;
    private ArrayList<Destination> feederDestinations;
    private ArrayList<Destination> urbanDestinations;
    private ArrayList<Destination> especialDestinations;
    private ArrayList<Destination> complementaryDestinations;
    public SITP2018() {
        loadDestinations();
        loadServices();
    }
    private void loadDestinations() {
        Destination portalTunal = PortalTunal.getInstance();
        Destination paraiso = Paraiso.getInstance();

        trunkLineDestinations = new ArrayList<>();
        trunkLineDestinations.add(portalTunal);
        trunkLineDestinations.add(new Destination("Cl. 45"));
        trunkLineDestinations.add(new Destination("Av. 39"));

        feederDestinations = new ArrayList<>();
        feederDestinations.add(new Destination("Portal del norte"));
        feederDestinations.add(paraiso);
        feederDestinations.add(portalTunal);

        urbanDestinations = new ArrayList<>();
        urbanDestinations.add(new Destination("Palmitas"));
        urbanDestinations.add(new Destination("Patio Bonito"));
        urbanDestinations.add(new Destination("La Cabrera"));

        especialDestinations = new ArrayList<>();
        especialDestinations.add(new Destination("Vicentenario"));
        especialDestinations.add(new Destination("El Verjón"));
        especialDestinations.add(new Destination("Unicerros"));

        complementaryDestinations = new ArrayList<>();
        complementaryDestinations.add(new Destination("Kennedy"));
        complementaryDestinations.add(new Destination("Cedritos"));
        complementaryDestinations.add(new Destination("Girardot"));
    }

    private void loadServices() {
        services = new ArrayList<>();
        services.add(new Transmilenio());
        services.add(new Complementario());
        services.add(new Especial());
        services.add(new Alimentador());
        services.add(new Urbano());
    }

    @Override
    public ArrayList<Transporte> getServices() {
        return services;
    }

    @Override
    public void transportarUsuario(Usuario usuario, Destination start, Destination end) {
        usuario.setLocation(end.getName());
    }
}
