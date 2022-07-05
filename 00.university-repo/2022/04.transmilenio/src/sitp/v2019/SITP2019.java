package sitp.v2019;

import model.Destination;
import model.Usuario;
import service.Transmicable;
import service.Transporte;
import sitp.SITP;
import sitp.v2018.SITP2018;

import java.util.ArrayList;

public class SITP2019 implements SITP {
    private ArrayList<Transporte> newServices;
    private SITP2018 sitp2018;

    public SITP2019(SITP2018 sitp2018, Transmicable t) {
        this.sitp2018 = sitp2018;
        newServices = new ArrayList<>();
        for(Transporte service: sitp2018.getServices()) {
            newServices.add(service);
        }
        newServices.add(t);
    }

    @Override
    public void transportarUsuario(Usuario usuario, Destination start, Destination end) {

    }
}
